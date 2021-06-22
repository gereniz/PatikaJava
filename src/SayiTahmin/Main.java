package SayiTahmin;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int number = rnd.nextInt(100);
		//int number = (int) (Math.random()*100);
		
		Scanner input = new Scanner(System.in);
		
		int right = 0;
		int selected;
		int[] wrongs = new int[5];
		boolean isWin =false;
		boolean isWrong = false;
		
		while(right < 5) {
		
			System.out.println("Lütfen sayı giriniz : ");
			selected = input.nextInt();
			if(selected <0 || selected > 100) {
				System.out.println("Lütfen 0 ile 100 arası bir sayı giriniz");
				if (!isWrong) {
					isWrong = true;
					System.out.println("Tekrar hatalı girişte hakkınız azalacak");
				}else {
					System.out.println("Çok fazla hatalı giriş yaptınız.Kalan hak : " + (5-(++right)));
				}
				continue;
			}
			if(selected == number) {
				System.out.println("Tebrikler kazandınız.Tahmin ettiğiniz sayı : " + number);
				isWin = true;
				break;
			}
			else {
				System.out.println("Yanlış sayı seçtiniz.Tekrar deneyiniz");
				
				if(selected > number) {
					System.out.println(selected + " sayısı gizli sayıdan daha büyük");
				}
				else {
					System.out.println(selected + " sayısı gizli sayıdan daha küçük");
				}
				 

				System.out.println("Kalan hakkınız : " + (5-right));
			}
			wrongs[right++] = selected;
		}
		
		if(!isWin && !isWrong) {
			System.out.println("Kaybettiniz");
			System.out.println("Tahminleriniz : " + Arrays.toString(wrongs));
			System.out.println("Gizli sayı "+ number);
		}

		
		
	}

}
