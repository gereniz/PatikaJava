package AdventurerGame;


public class Inventory {

	private Weapons weapon;
	private Armors armor;
	private Awards award;
	

	public Inventory() {
		this.weapon = new Weapons(0, "Yumruk", 0, 0);
		this.armor = new Armors(0, "Paçavra", 0, 0);
	}

	int count=0;
	static String[] inventoryBag = {"","","","","","","","","","",""};
	
	public  String[] inventoryBag(String award) {
		
		inventoryBag[count] = award;
		count++;
		return inventoryBag;
	}

	public Weapons getWeapon() {
		return weapon;
	}


	public void setWeapon(Weapons weapon) {
		this.weapon = weapon;
	}



	public Armors getArmor() {
		return armor;
	}



	public void setArmor(Armors armor) {
		this.armor = armor;
	}
	


	public Awards getAward() {
		return award;
	}

	public void setAward(Awards award) {
		this.award = award;
	}
	
	
}
