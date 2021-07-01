package AdventurerGame;

import java.util.Random;

public abstract class BattleLocations  extends Locations{

	private Monster monster;
	private Awards award;
	private int maxMonster;
	

	public BattleLocations(Player player, int id, String name, Monster monster, Awards award,int maxMonster) {
		super(player, id, name);
		this.monster = monster;
		this.award = award;
		this.maxMonster = maxMonster;
	}

	@Override
	public boolean onLocation() {
		
		int monsterNumber = this.randomMonsterNumber();
		System.out.println("Şu an buradasın-> " + this.getName());
		System.out.println();
		System.out.println("Dikkatli ol !! Burada " +monsterNumber+ " tane " + getMonster().getName() + " yaşıyor !!\n");
		
		System.out.println("\n 1 - Savaş \n 2 - Kaç  \n !!GİRİLEN DEĞER YANLIŞ OLURSA KAÇMIŞ SAYILACAKSIN !! ");
		System.out.print("Girilen Değer : ");
		int selectCase= input.nextInt();
		
			if(selectCase == 1 && combat(monsterNumber)){
				
						
				System.out.println(this.getName() +  " -> buradaki tüm düşmanları öldürdünüz !!");
				System.out.println(this.getAward().getName() + " ödülünü kazandınız");
				if(this.getMonster().getAward().getName() == "Para") {
					this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getMoney());
					System.out.println("Para miktarınız : " + this.getPlayer().getMoney());
				}else{
					System.out.println("Envanteri kullanmak istiyor musunuz ? ");
					System.out.println("1 - Evet \n 2-Hayır");
					int n = input.nextInt();
					if(n == 1) {
						Armors selectedArmor = Armors.getArmorById(this.getAward().getId());
						this.getPlayer().getInventory().setArmor(selectedArmor);
					}
				}
				if(this.getAward().getName() != "Para") {
					this.getPlayer().getInventory().inventoryBag(this.getAward().getName());
				}else {
					this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getMoney());
					System.out.println("Para miktarınız : " + this.getPlayer().getMoney());
				}
				
				System.out.println("Envanteriler : ");
				for(int j = 0 ; j <Inventory.inventoryBag.length ; j++) {
					System.out.print(Inventory.inventoryBag[j] + " ");
				}
						
				return true;
			
			}else if(selectCase !=1 && selectCase != 2 ){
				return true;
			}else if(selectCase == 2) {
				return true;
			}
				
			if(this.getPlayer().getHealth()<=0) {
				System.out.println("Öldünüz!!");
				return false;
			}
		
		return true;	
	}
	
	
	
	public boolean combat(int monsterNumber) {
		int start = randomStart();
		for(int i = 1 ; i <= monsterNumber; i++) {
			this.getMonster().setHealth(this.getMonster().getOrijinalHealth());
			playerStats();
			monsterStats(i);
			System.out.println("------------------------------------------------------------------ \n");
			
			if(start==0) {
				while(this.getPlayer().getHealth()>0 && this.getMonster().getHealth()>0) {
						System.out.println();
						System.out.println("\n" + this.getMonster().getName() + " vurdu\n");
							
						int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getArmor().getBlock();
						if(monsterDamage < 0 ) {
							monsterDamage = 0;
						}
						this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
						afterHit(i);
						if(this.getPlayer().getHealth()>0) {
							if(this.getMonster().getHealth()>0) {
								System.out.println("\n 1 - Vur \n 2 - Kaç  \n!! GİRİLEN DEĞER YANLIŞ OLURSA KAÇMIŞ SAYILACAKSIN !! ");
								int selectCase= input.nextInt();
								if(selectCase == 1) {
									System.out.println("Siz Vurdunuz\n");
									this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
									afterHit(i);
								}else if(selectCase !=1 && selectCase != 2){
									return true; 
								}
								else if(selectCase == 2) {
									return true; 
								}
							}else {
								System.out.println("Düşmanı yendiniz !");
								System.out.println(this.getMonster().getMoney() + " " + this.getMonster().getAward().getName()+ " kazandınız");
								if(this.getMonster().getAward().getName() == "Para") {
									this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getMoney());
									System.out.println("Para miktarınız : " + this.getPlayer().getMoney());
								}
					
							}
						}else {
							System.out.print("Öldünüz");
							return false;
						}
						
					}
				
			}else if(start == 1) {
				while(this.getPlayer().getHealth()>0 && this.getMonster().getHealth()>0) {
					System.out.println();
					
						if(this.getPlayer().getHealth()>0) {
							System.out.println("\n 1 - Vur \n 2 - Kaç  \n!! GİRİLEN DEĞER YANLIŞ OLURSA KAÇMIŞ SAYILACAKSIN !! ");
							int selectCase= input.nextInt();
						
							if(selectCase == 1) {
								System.out.println("Siz Vurdunuz\n");
								this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
								afterHit(i);
								if(this.getMonster().getHealth()>0) {
									System.out.println("\n" + this.getMonster().getName() + " vurdu\n");
									int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getArmor().getBlock();
									if(monsterDamage < 0 ) {
										monsterDamage = 0;
									}
									this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
									afterHit(i);
								}else {
									System.out.println("Düşmanı yendiniz !");
									System.out.println(this.getMonster().getMoney() +" "+ this.getMonster().getAward().getName() + " kazandınız");
									if(this.getMonster().getAward().getName() == "Para") {
										this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getMoney());
										System.out.println("Para miktarınız : " + this.getPlayer().getMoney());
									}
								
									
								}
							}else if(selectCase !=1 && selectCase != 2){
								return true;	
							}
							else if(selectCase == 2) {
								return true;
							}
						}
						else {
							System.out.print("Öldünüz");
							return false;
						}
						
				}	
				
			}
		}
		
		if(this.getPlayer().getHealth() > 0) {
			return true;
		}
		
		System.out.println("------------------------------------------------------------------ \n");
		return false;
	}
	
	public boolean escape(int i) {
		if(i == 1) {
			return true;
		}
		return false;
	}
	public void afterHit(int i) {
		System.out.println("------Oyuncu Değerleri-------");
		System.out.println("Sağlık : " + this.getPlayer().getHealth() );
		System.out.println("Silah : " + this.getPlayer().getWeapon().getName());
		System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
		System.out.println("Para : " + this.getPlayer().getMoney());
		System.out.println("Zırh : " + this.getPlayer().getArmor().getName());
		System.out.println("Bloklama : " + this.getPlayer().getArmor().getBlock());
		System.out.println("Envanteriler : ");
		for(int j = 0 ; j <Inventory.inventoryBag.length ; j++) {
			System.out.print(Inventory.inventoryBag[j] + " ");
		}
		System.out.println();
		System.out.println("------" +i+". "+this.getMonster().getName() +" Değerleri-------");
		System.out.println("Sağlık : " + this.getMonster().getHealth() );
		System.out.println("Hasar : " + this.getMonster().getDamage());
		System.out.println("Ödül : " + this.getMonster().getAward().getName());
	}
	
	public void playerStats() {
		System.out.println("------Oyuncu Değerleri-------");
		System.out.println("Sağlık : " + this.getPlayer().getHealth() );
		System.out.println("Silah : " + this.getPlayer().getWeapon().getName());
		System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
		System.out.println("Para : " + this.getPlayer().getMoney());
		System.out.println("Zırh : " + this.getPlayer().getArmor().getName());
		System.out.println("Bloklama : " + this.getPlayer().getArmor().getBlock());
		System.out.println("Envanteriler : ");
		for(int j = 0 ; j <Inventory.inventoryBag.length ; j++) {
			System.out.print(Inventory.inventoryBag[j] + " ");
		}
		System.out.println();
	}
	
	public void monsterStats(int i) {
		System.out.println("------" +i+". "+this.getMonster().getName() +" Değerleri-------");
		System.out.println("Sağlık : " + this.getMonster().getHealth() );
		System.out.println("Hasar : " + this.getMonster().getDamage());
		System.out.println("Ödül : " + this.getMonster().getAward().getName());
	
	}
	
	public int randomStart() {
		Random rnd = new Random();
		return rnd.nextInt(2);
	}

	public int randomMonsterNumber() {
		Random rnd = new Random();
		return rnd.nextInt(this.getMaxMonster()) + 1;
	}

	public Monster getMonster() {
		return monster;
	}


	public void setMonster(Monster monster) {
		this.monster = monster;
	}


	public Awards getAward() {
		return award;
	}


	public void setAward(Awards award) {
		this.award = award;
	}
	
	public int getMaxMonster() {
		return maxMonster;
	}


	public void setMaxMonster(int maxMonster) {
		this.maxMonster = maxMonster;
	}

}
