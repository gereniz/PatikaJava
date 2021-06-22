package MinMaxBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi=0,max=1,n,min,sayi1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kaç tane sayı gireceksiniz : ");
		n = input.nextInt();
		
		System.out.println(1 + ". Sayıyı giriniz : ");
		sayi1 = input.nextInt();
		min =sayi1;
		max=sayi1;
		for(int i = 2 ; i<=n ; i++) {
			System.out.println(i + ". Sayıyı giriniz : ");
			sayi = input.nextInt();
			if (sayi>max) {
				max=sayi;
			}
			if(sayi<min){
				min = sayi;
			}
		}
		System.out.println("En büyük sayı : " + max);
		System.out.println("En küçük sayı : " + min);
	}
}
