package GirilenSayidanKucukKuvvetBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sayi,k=1,l=1,n=0,m=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Sayı giriniz : ");
		sayi = input.nextInt();
		
		while(k<=sayi) {
			System.out.println("4 nin " + n + "ncı kuvveti " + k);
			k*=4;
			n++;	
		}
		System.out.println("---------");
		while(l<=sayi) {
			
			System.out.println("5 nin " + m + "ncı kuvveti " + l);
			l*=5;
			m++;
		}
	}
}
