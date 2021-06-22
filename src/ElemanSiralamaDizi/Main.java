package ElemanSiralamaDizi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dizinin boyutu n : ");
		n = input.nextInt();
		
		int[] dizi = new int[n];
		
		System.out.println("Dizinin elemanlarını giriniz : ");
		for(int i = 1 ; i<= n ; i++) {
			System.out.print(i + ". Elemanı : ");
			dizi[i-1] = input.nextInt();
		}
		
		Arrays.sort(dizi);
		System.out.print("Sıralama : ");
		for(int i : dizi) {
			System.out.print(i + " ");
		}
	}
}
