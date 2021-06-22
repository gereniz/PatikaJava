package HesapMakinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sayi1,sayi2,select;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("İlk sayıyı giriniz : ");
		sayi1 = input.nextInt();
		System.out.print("İkinci sayıyı giriniz : ");
		sayi2 = input.nextInt();
		
		System.out.println("1 : Toplama \n 2 : Çıkarma \n 3 : Çarpma \n 4 : Bölme");
		System.out.print("Seçiniz : ");
		select = input.nextInt();
		switch (select) {
		case 1: {
			System.out.println("Toplama : " + (sayi1+sayi2));
			break;
		}
		case 2: {
			System.out.println("Çıkarma : " + (sayi1-sayi2));
			break;
		}
		case 3: {
			System.out.println("Çarma : " + (sayi1*sayi2));
			break;
		}
		case 4: {
			if (sayi2 == 0) {
				System.out.println("O a bölme hatası");
				break;
			}
			System.out.println("Bölme : " + (sayi1/sayi2));
			break;
		}
		default:
			System.out.println("Yanlış seçim");
			break;
		}
	}

}
