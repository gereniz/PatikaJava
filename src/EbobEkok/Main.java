package EbobEkok;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sayi1,sayi2,i=1,ebob=0,ekok=1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sayı1 gir : ");
		sayi1 = input.nextInt();
		System.out.println("Sayı2 gir : ");
		sayi2 = input.nextInt();
		
		if(sayi1>sayi2) {
			while(i<=sayi2) {
				if(sayi1 %i == 0 && sayi2 %i == 0) {
					ebob=i;
				}
				i++;
			}
		}else {
			while(i<=sayi1) {
				if(sayi1 %i == 0 && sayi2 %i == 0) {
					ebob=i;	
				}
				i++;
			}
		}
		ekok = (sayi1*sayi2)/ebob;
		System.out.println("Ebob : " + ebob);
		System.out.println("Ekok : " + ekok);
	}
}
