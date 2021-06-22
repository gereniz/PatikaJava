package FibonacciSerisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,n0=0,n1=1,n2=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Eleman sayısı giriniz : ");
		n = input.nextInt();
		System.out.print("0 1 ");
		
		for(int i = 0 ; i<=n-2 ; i++) {
			n2 = n0+n1;
			System.out.print(n2 + " ");
			n0=n1;
			n1=n2;		
		}	
	}
}
