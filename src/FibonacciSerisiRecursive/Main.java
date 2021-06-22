package FibonacciSerisiRecursive;

import java.util.Scanner;

public class Main {

	static int Fibonacci(int number) {
		if(number == 1 || number == 2) {
			return 1;
		}
		return Fibonacci(number-1)+ Fibonacci(number-2);
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Fibonacci serisi eleman sayısını giriniz : ");
		int number = input.nextInt();
		
		System.out.println(Fibonacci(number));
	}

}
