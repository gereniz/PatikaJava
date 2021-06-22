package YildizYapma;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sayi;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sayı giriniz : ");
		sayi = input.nextInt();
		
		for(int i =1 ; i<=sayi;i++) {
			for(int j = 1 ; j<=sayi-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k<=(2*i)-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int j=sayi-1;j>=1;j--) {
			for(int l = 0 ; l<=sayi-j-1;l++) {
				System.out.print(" ");
			}
			for(int k = (2*j)-1; k>=1 ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
