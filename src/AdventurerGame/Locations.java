package AdventurerGame;

import java.util.Scanner;

public abstract class Locations {
	
	private Player player;
	private int id;
	private String name;
	
	public static Scanner input = new Scanner(System.in);
	
	public Locations(Player player, int id,String name) {
		super();
		this.player = player;
		this.id = id;
		this.name = name;
	}
	
	public abstract boolean onLocation();

	public int getId() {
		return id;
	}
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
