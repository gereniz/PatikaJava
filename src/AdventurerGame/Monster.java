package AdventurerGame;

import java.util.Random;

public class Monster {

	private int id;
	private String name;
	private int damage;
	private int health;
	private Awards award;
	private int money;
	private int orijinalHealth;
	
	public int getOrijinalHealth() {
		return orijinalHealth;
	}


	public void setOrijinalHealth(int orijinalHealth) {
		this.orijinalHealth = orijinalHealth;
	}


	public Monster(int id, String name, int damage, int health, Awards award) {
		super();
		this.id = id;
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.award = award;
		this.orijinalHealth = health;
		
		
		
	}

	public static int awardMoney() {
		Random rnd = new Random();
		int i = rnd.nextInt(100);
		if(i<50) {
			return 1;
		}else if(i <80) {
			return 5;
		}else {
			return 10;
		}
	}

	public int getMoney() {
		

		if(this.getName().equals("Zombi")) {
			this.money = (award.getId()/10)*4;
		}else if(this.getName().equals("Ayı")) {
			this.money = (award.getId()/10)*7;
		}else if (this.getName().equals("Vampir")){
			this.money = (award.getId()/10)*12;
		}else if (this.getName().equals("Yılan")) {
			if(award.getId() == 10) {
				this.money =awardMoney();
			}
		}
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	
	}


	public Awards getAward() {
		return award;
	}


	public void setAward(Awards award) {
		this.award = award;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
			health=0;
		}
		this.health = health;
	}
	
	
}
