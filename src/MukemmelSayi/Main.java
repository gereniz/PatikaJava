package MukemmelSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi,toplam=0,i=1;
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz : ");
		sayi = input.nextInt();
		
		while(i<sayi) {
			if(sayi %i == 0) {
				toplam+=i;
			}
			i++;
		}
		if(sayi == toplam) {
			System.out.println(sayi + " Mükemmel sayıdır");
		}
		else {
			System.out.println(sayi + " Mükemmel sayı değildir");
		}
	}

}
