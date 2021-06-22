package Daire;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int r ,a;
		double pi = 3.14,alan,cevre,dilimalan;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dairenin yarıçapı : ");
		r = input.nextInt();
		
		System.out.print("Merkezi Açı Ölçünü : ");
		a = input.nextInt();
		
		alan = pi*r*r;
		cevre = 2*pi*r;
		dilimalan = (pi*(r*r)*a)/360;
		
		System.out.println("Dairenin Alanı : "+ alan);
		System.out.println("Dairen Dilim Alanı : "+ dilimalan);
		System.out.println("Dairenin Çevresi : " + cevre);
		
	}

}
