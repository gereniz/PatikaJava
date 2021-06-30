package AdventurerGame;

import java.util.Random;

public class Snake extends Monster {

	
	public Snake() {
		super(4,"Yılan",randomDamage(),12,new RandomItem());
	}
	
	private static Random rnd = new Random();
	public static int randomDamage() {
		
		return rnd.nextInt(4)+3;
	}


}
