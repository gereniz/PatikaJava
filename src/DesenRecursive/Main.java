package DesenRecursive;

import java.util.Scanner;

public class Main {

	static int patternGrowing(int n,int x) {
		System.out.print(n + " ");
		if(n == x) {
			return x;
		}
		if (n>0) {
			return patternGrowing(n+5,x);
			
		}else {
			return patternDecreasing(n-5,x);
		}
	}
	
	
	static int patternDecreasing(int n,int x) {
		
		if(n<=0) {
			System.out.print(n + " ");
			return patternGrowing(n+5,x);
			
		}else {
			System.out.print(n + " ");
			return patternDecreasing(n-5,x);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		System.out.print("N sayısı : ");
		int n = input.nextInt();
		patternDecreasing(n,n);
		
	}
}
