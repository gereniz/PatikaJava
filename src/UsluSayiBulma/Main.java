package UsluSayiBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sayi,us,usluSayi=1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sayı giriniz : ");
		sayi = input.nextInt();
		
		System.out.println("Üs giriniz : ");
		us = input.nextInt();
		
		for(int i =1 ; i<=us ; i++) {
			usluSayi*=sayi;
		}

		System.out.println(sayi + " nın " + us+ "ıncı kuvveti " +usluSayi);
	}

}
