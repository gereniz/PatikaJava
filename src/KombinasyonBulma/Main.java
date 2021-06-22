package KombinasyonBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n,r,kombinasyon,N=1,R=1,K=1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("N giriniz : ");
		n = input.nextInt();
		
		System.out.println("R giriniz : ");
		r = input.nextInt();
		
		for(int i = 1 ; i<=n;i++) {
			N*=i;
		}
		for(int i = 1 ; i<=r;i++) {
			R*=i;
		}
		for(int i = 1 ; i<=(n-r);i++) {
			K*=i;
		}

		kombinasyon = N/(R*K);
		
		System.out.println("Kombinasyon : " + kombinasyon);
	}

}
