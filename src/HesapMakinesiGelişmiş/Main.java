package HesapMakinesiGelişmiş;

import java.util.Scanner;

public class Main {

	static void sum(int a,int b) {
		int result = a + b;
		System.out.println("Sonuç : " + result);
	}
	
	static void minus(int a,int b) {
		int result = a - b;
		System.out.println("Sonuç : " + result);
	}
	
	static void times(int a,int b) {
		int result = a * b;
		System.out.println("Sonuç : " + result);
	}
	
	static void divided(int a,int b) {
		if(b==0) {
			System.out.println("B değeri 0 dan farklı olmalı");
		}
		int result = a / b;
		System.out.println("Sonuç : " + result);
	}
	
	static void power(int a,int b) {
		int result=1;
		for(int i=1;i<=b;i++) {
			result*=a;
		}
		System.out.println("Sonuç : " + result);
	}
	
	static void mod(int a,int b) {
		int result=a%b;
		System.out.println("Sonuç : " + result);
	}
	
	static void calc(int a,int b) {
		System.out.println("Çevre : " + 2*(a+b));
		System.out.println("Alan : " + a*b);
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int select;
		
		String menu = "1-Toplama İşlemi\n"
				+ "2-Çıkarma İşlemi\n"
				+ "3-Çarpma İşlemi\n"
				+ "4-Bölme İşlemi\n"
				+ "5-Üslü Sayı Hesaplama İşlemi\n"
				+ "6-Mod Alma İşlemi\n"
				+ "7-Dikdörtgen Alan ve Hesaplama İşlemi\n"
				+ "0-Çıkış yap";
		System.out.println(menu);
				
		while(true) {
			System.out.print("İşlem seçiniz : ");
			select = input.nextInt();
	
			int a = input.nextInt();
			int b = input.nextInt();
			
			switch (select) {
			case 0:
				break;
			case 1:
				sum(a,b);
				break;
			case 2:
				minus(a, b);
				break;

			case 3:
				times(a, b);
				break;

			case 4:
				divided(a,b);
				break;
			
			case 5:
				power(a,b);
				break;
			case 6:
				mod(a, b);
				break;
			case 7:
				calc(a, b);
				break;
			}
		}
	}
}
