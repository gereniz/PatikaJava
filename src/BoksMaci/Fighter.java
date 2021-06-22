package BoksMaci;

public class Fighter {

	String name;
	int damage;
	int health;
	int weight;
	int dodge;
	
	public Fighter(String name, int damage, int health, int weight,int dodge) {
	
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		if(dodge >= 0 && dodge <= 100) {
			this.dodge = dodge;
		}else {
			this.dodge = 0;
		}
		
	}
	
	int hit(Fighter foo) {
		System.out.println(this.name + " => " + foo.name + " " + this.damage + " kadar hasar vurdu");
		if(foo.isDodge()) {
			System.out.println(foo.name +" gelen hasarı blokladı");
			return foo.health;
		}
		if(foo.health -this.damage <0) {
			return 0;
		}
		return foo.health - this.damage;
	}
	
	boolean isDodge() {
		double randomNumber = Math.random() * 100;
		return randomNumber <= this.dodge;
	}
}
