package Ucgen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a , b, c ,u;
		double alan;

		Scanner input = new Scanner(System.in);
		
		System.out.println("A kenarını giriniz : ");
		a = input.nextInt();
		System.out.println("B kenarını giriniz : ");
		b = input.nextInt();
		System.out.println("C kenarını giriniz");
		c = input.nextInt();
	
		u = (a+b+c)/2;
		
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Üçgenin Alanı : " + alan  );
	}

}
