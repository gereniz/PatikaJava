package BoksMaci;



public class Match {

	Fighter fighter1;
	Fighter fighter2;
	
	int minHeight;
	int maxHeight;
	
	
	public Match(Fighter fighter1,Fighter fighter2, int minHeight, int maxHeight) {

		this.fighter1 = fighter1;
		this.fighter2 = fighter2;
		this.minHeight = minHeight;
		this.maxHeight = maxHeight;
	}
	
	public void run() {
		if(isCheck()) {
			if(isStart() == true) {
				System.out.println(this.fighter1.name + " başladı");
				while(this.fighter1.health>0 && this.fighter2.health >0) {
					System.out.println("Round");
					this.fighter2.health = this.fighter1.hit(fighter2);
					if(isMin()) {
						break;
					}
					this.fighter1.health = this.fighter2.hit(fighter1);
					if(isMin()) {
						break;
					}
					System.out.println(this.fighter1.name + " sağlığı : " + this.fighter1.health);
					System.out.println(this.fighter2.name + " sağlığı : " + this.fighter2.health);
					
				}
			}else {
				System.out.println(this.fighter2.name + " başladı");
				while(this.fighter2.health>0 && this.fighter1.health >0) {
					System.out.println("Round");
					this.fighter1.health = this.fighter2.hit(fighter1);
					if(isMin()) {
						break;
					}
					this.fighter2.health = this.fighter1.hit(fighter2);
					if(isMin()) {
						break;
					}
					System.out.println(this.fighter2.name + " sağlığı : " + this.fighter2.health);
					System.out.println(this.fighter1.name + " sağlığı : " + this.fighter1.health);
				}	
			}
				
		}else {
			System.out.println("Sporcuların sikletleri uymuyor");
		}
	}
	
	
	boolean isCheck() {
		boolean control = (this.fighter1.weight >= minHeight && this.fighter1.weight<=maxHeight) && ( this.fighter2.weight >= minHeight && this.fighter2.weight <= maxHeight);
		return control;
	}
	
	boolean isMin() {
		if(this.fighter1.health == 0) {
			System.out.println(this.fighter2.name + " kazandı");
			return true;
		}
		if(this.fighter2.health == 0) {
			System.out.println(this.fighter1.name + " kazandı");
			return true;
		}
		return false;
	}
	
	boolean isStart() {
		double randomNumber = Math.random() *100;
		if(randomNumber > 50) {
			return true;
		}
		else {
			return false;
		}
	}
}
