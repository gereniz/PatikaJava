package Manav;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double armut,elma,domates,muz,patlican,toplam;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Armut Kaç Kilo ? : ");
		armut = input.nextDouble();
		
		System.out.print("Elma Kaç Kilo ? : ");
		elma = input.nextDouble();
		
		System.out.print("Domates Kaç Kilo ? : ");
		domates = input.nextDouble();
		
		System.out.print("Muz Kaç Kilo ? : ");
		muz = input.nextDouble();
		
		System.out.print("Patlıcan Kaç Kilo ? : ");
		patlican = input.nextDouble();
		
		toplam = (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.00);
		
		System.out.print("Toplam Tutar : " + toplam);

	}

}
