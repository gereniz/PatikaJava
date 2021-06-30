package AdventurerGame;


import java.util.Scanner;

public class Player {

	private int damage;
	private int health;
	private int money;
	private String name;
	private String charName;
	private Inventory inventory;
	private int orijinalHealth;
	
	
	
	private Scanner input = new Scanner(System.in);
	
	public Player(String name) {
		this.name = name;
		this.inventory = new Inventory();
	}
	
	public void selectChar() {
		System.out.println("------------------------------------------------------------------ \n");
		GameCharacters[] characters = {new Archer(),new Knight(),new Samurai()};
		
		for(GameCharacters character : characters) {
			System.out.println("Id : " +character.getId()+"\t Karakter  : " + character.getName() + "\t Hasar : " +character.getDamage() +
								"\t Sağlık :" +character.getHealth()+ "\t Para : " +character.getMoney());
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------ \n");
		System.out.println("Lütfen bir karakter seç : ");
		int selectChar = input.nextInt();
		for(GameCharacters character : characters) {
			if(selectChar < 0 || selectChar > characters.length) {
				while(selectChar < 0 || selectChar > characters.length) {
					System.out.println("Geçersiz Değer Girdiniz ! Tekrar giriniz !! ");
					System.out.print("Girilen Değer : ");
					selectChar = input.nextInt();
				}
			}
			if(selectChar == character.getId()) {
				initPlayer(character);
			}
		}
	}
	
	
	public void initPlayer(GameCharacters gameCharacter) {
		this.setCharName(gameCharacter.getName());
		this.setDamage(gameCharacter.getDamage());
		this.setHealth(gameCharacter.getHealth());
		this.setOrijinalHealth(gameCharacter.getHealth());
		this.setMoney(gameCharacter.getMoney());
		
	}
	
	public void showInfo() {
		System.out.println();
		System.out.println("Karakter  : " + this.getCharName() +
				"\t Silah  : " + this.getInventory().getWeapon().getName() + "\t Hasar : " + this.getTotalDamage() +
				"\t Zırh : " + this.getInventory().getArmor().getName() + "\t Bloklama : " + this.getInventory().getArmor().getBlock() +
				"\t Sağlık :" + this.getHealth() + "\t Para : " + this.getMoney());
		System.out.println();
	}
	
	public int getTotalDamage() {
		return damage + this.getInventory().getWeapon().getDamage();
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health<0) {
			health = 0;
		}
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public Weapons getWeapon() {
		return this.getInventory().getWeapon();
	}
	
	public Armors getArmor() {
		return this.getInventory().getArmor();
	}
	
	
	public int getOrijinalHealth() {
		return orijinalHealth;
	}

	public void setOrijinalHealth(int orijinalHealth) {
		this.orijinalHealth = orijinalHealth;
	}

	
	
}
