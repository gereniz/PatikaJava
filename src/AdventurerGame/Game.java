package AdventurerGame;

import java.util.Scanner;

public class Game {
	
	private Scanner input = new Scanner(System.in);
	
	public void start() {
		
		System.out.println("Macera Oyununa Hoşgeldiniz \n");
		System.out.print("Lütfen isminizi giriniz : \n");
		String playerName = input.nextLine();
		
		Player player = new Player(playerName);
		System.out.println(player.getName()+ " HOŞGELDİN :) \n");
		
		player.selectChar();
		Locations currentLocation = null;
		while(true) {
			player.showInfo();
			Locations[] locations = {new SaveHouse(player),new ToolStore(player),new Forest(player),new Cave(player),new River(player),new Mine(player)}; 
			
			System.out.println("\n------------------------------------------------------------------ \n");
			System.out.println("Bölgeler \n");
			for(Locations location : locations) {
				System.out.println(location.getId() + " - " + location.getName());
			}
			System.out.println();
			System.out.println("------------------------------------------------------------------ \n");
			System.out.println("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");
			
			int selectLocation = input.nextInt();
			for(Locations location : locations) {
				if(selectLocation < 0 || selectLocation> locations.length) {
					while(selectLocation < 0 || selectLocation> locations.length) {
						System.out.println("Geçersiz Değer Girdiniz ! Tekrar giriniz !! ");
						System.out.print("Girilen Değer : ");
						selectLocation = input.nextInt();
					}
				}
				if(selectLocation == location.getId()) {
					currentLocation = location;
				}
			}
			System.out.println();
			if(!currentLocation.onLocation()) {
				break;
			}
		}
		
	}

}
