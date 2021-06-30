package AdventurerGame;


public class ToolStore extends NormalLocations{

	public ToolStore(Player player) {
		super(player,2,"Eşya Dükkanı");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean onLocation() {
		boolean showMenu = true;
		while(showMenu) {
			System.out.println("\nMağazaya Hoşgeldin ! ");
			System.out.println();
			System.out.println("1 - Silahlar \n2 - Zırhlar \n3 - Çıkış Yap");
			System.out.println();
			System.out.print("Seçiminiz : ");
			int selectCase = input.nextInt();
			
			while(selectCase<0 || selectCase>3) {
				System.out.print("Geçersiz Değer Girdiniz ! Tekrar giriniz : ");
				selectCase = input.nextInt();
			}
			switch (selectCase) {
				case 1:
					showWeapon();
					buyWeapon();
					break;
				case 2:
					showArmor();
					buyArmor();
					break;
				case 3:
					System.out.println("Tekrar bekleriz");
					showMenu=false;
					break;
			}	
			
		}
		return true;
		
	}
	
	public void showWeapon() {
		
		System.out.println("------------------------------------------------------------------ \n");
		for(Weapons weapon : Weapons.weapons()) {
			System.out.println(weapon.getId() + "  -  " + weapon.getName() + "\t<\tPara : " + weapon.getPrice() + "\t Hasar : " + weapon.getDamage() + " \t>");
		}
		System.out.println("------------------------------------------------------------------ \n");	
		System.out.println("0 - Çıkış Yap");
	}
	
	public void buyWeapon() {
		
		System.out.println("Seçiminiz : ");
		int selectWeapon = input.nextInt();
		
		while(selectWeapon < 0 || selectWeapon > 3) {
			System.out.print("Geçersiz Değer Girdiniz ! Tekrar giriniz : ");
			selectWeapon = input.nextInt();
		}
		
		if(selectWeapon != 0) {
			Weapons selectedWeapon = Weapons.getWeaponById(selectWeapon);
			if(selectedWeapon != null) {
				if(selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Bakiye yetersiz");
				}else {
					System.out.println(selectedWeapon.getName() + " satın alındı.");
					int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
					this.getPlayer().setMoney(balance);
					System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
					this.getPlayer().getInventory().setWeapon(selectedWeapon);
				}
			}
		}
		
	}
	
	public void showArmor() {
		System.out.println("------------------------------------------------------------------ \n");
		for(Armors armor : Armors.armors()) {
			System.out.println(armor.getId() + "  -  " + armor.getName() + "<\tPara : " + armor.getPrice() + "\t Bloklama : " + armor.getBlock() + " \t>");
		}
		System.out.println("------------------------------------------------------------------ \n");
		System.out.println("0 - Çıkış Yap");
	}
	
	public void buyArmor() {
		
		System.out.println("Seçiminiz : ");
		int selectArmor = input.nextInt();
		
		while(selectArmor < 0|| selectArmor > 6) {
			System.out.print("Geçersiz Değer Girdiniz ! Tekrar giriniz : ");
			selectArmor = input.nextInt();
		}
		if(selectArmor != 0) {
			Armors selectedArmor = Armors.getArmorById(selectArmor);
			if(selectedArmor != null) {
				if(selectedArmor.getPrice()> this.getPlayer().getMoney()) {
					System.out.println("Bakiye yetersiz");
				}else {
					System.out.println(selectedArmor.getName() + " Zırhını satın alındı.");
					int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
					this.getPlayer().setMoney(balance);
					System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
					this.getPlayer().getInventory().setArmor(selectedArmor);
				}
			}
		}
		
	}

}
