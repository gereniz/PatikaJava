package UsAlmaRecursive;

import java.util.Scanner;

public class Main {

	
	static int recursive(int a,int b) {
		if(b == 0) {
			return 1;
		}
		return recursive(a, b-1) * a;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Taban : ");
		int a = input.nextInt();
		
		System.out.print("Üs : ");
		int b = input.nextInt();
		
		System.out.println(recursive(a,b));

	}
}
