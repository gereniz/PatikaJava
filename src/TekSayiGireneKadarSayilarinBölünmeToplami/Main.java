package TekSayiGireneKadarSayilarinBölünmeToplami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi;
		int toplam = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Sayı giriniz : ");
			sayi = input.nextInt();
			if(sayi%2==0 && sayi%4==0) {
				toplam+=sayi;
			}
		}while(sayi%2==0);
		System.out.println("Tek sayı girene kadar çift ve 4 e bölünen sayıların toplamı : " +toplam);
	}

}
