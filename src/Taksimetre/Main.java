package Taksimetre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int km;
		double perKm = 2.20 ,tutar =10;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mesafayi km olrak giriniz : ");
		km = input.nextInt();
		
		tutar+=(km*perKm);
		
		
		tutar = (tutar>20) ? tutar : 20; 
		
	
		System.out.println("Toplam Tutar : " + tutar);

	}

}
