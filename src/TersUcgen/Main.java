package TersUcgen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Basamak sayısı giriniz : ");
		n = input.nextInt();
		
		for(int i = n; i>=1 ; i--) {
			for(int j = 0 ; j<(2*i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
