package HarmonikSeriBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,i=1;
		double harmonik=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("N giriniz : ");
		n = input.nextInt();
		
		while(i <= n) {
			harmonik+=(1.0/i);
			i++;
		}
		System.out.println("Harmonik Seri : " +harmonik);
	}

}
