package CinZodyagi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int birthYear;
		String zodyag = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Doğum Yılınızı Giriniz: ");
		birthYear = input.nextInt();
		
		switch (birthYear%12) {
			case 0: {
				zodyag = "Maymun";
				break;
			}
			case 1: {
				zodyag = "Horoz";
				break;
			}
			case 2: {
				zodyag = "Köpek";
				break;
			}
			case 3: {
				zodyag = "Domuz";
				break;
			}
			case 4: {
				zodyag = "Fare";
				break;
			}
			case 5: {
				zodyag = "Öküz";
				break;
			}
			case 6: {
				zodyag = "Kaplan";
				break;
			}
			case 7: {
				zodyag = "Tavşan";
				break;
			}
			case 8: {
				zodyag = "Ejdarha";
				break;
			}
			case 9: {
				zodyag = "Yılan";
				break;
			}
			case 10: {
				zodyag = "At";
				break;
			}
			case 11: {
				zodyag = "Koyun";
				break;
			}
		}
		System.out.println("Çin Zodyağı Burcunuz : " +zodyag);

	}

}
