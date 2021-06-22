package YakinSayiBulmaDizi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int[] list = {15,12,788,1,-1,-778,2,0};
		
		int sayi=0,min=0,max=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("{");
		for(int i : list) {
			System.out.print(i +",");
		}
		System.out.println("}");
		
		System.out.print("Girilen Sayı : ");
		sayi = input.nextInt();
		
		Arrays.sort(list);
		
		for(int i : list) {
			if(i<sayi) {
				min=i;
			}
			if(i>sayi) {
				max = i;
				break;
			}
		}
	
		System.out.println("Girilen sayıdan küçük en yakın sayı : " + min );
		System.out.println("Girilen sayıdan büyük en yakın sayı : " + max );
	}

}
