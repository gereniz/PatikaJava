package AsalSayiRecursive;

import java.util.Scanner;

public class Main {

	static int prime(int number,int i) {
		
		if(number <= 2) {
			return 0;
		}
			
		if(number == 1) {
			return 1;
		}
		
		if(number == i) {
			return 1;
		}
		
		if(number % i == 0) {
			return 0;
		}
		
		return prime(number,i+1);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz : ");
		int number = input.nextInt();
		if(prime(number,2) == 0) {
			System.out.println(number + " sayısı ASAL değildir");
		}
		else {
			System.out.println(number + " sayısı ASALDIR");
		}
	}

}
