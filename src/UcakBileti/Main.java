package UcakBileti;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int km,age,tripType;
		double price;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen mesafeyi giriniz : ");
		km = input.nextInt();
		
		System.out.println("Lütfen yaşınızı giriniz : ");
		age = input.nextInt();
		

		System.out.println("1 : Tek Yön    2 : Gidiş-Dönüş ");
		System.out.println("Lütfen yolculuk tipini giriniz : ");
		tripType = input.nextInt();
		
		if(km<0 || age< 0 || (tripType !=1 && tripType  != 2 )) {
			System.out.println("Hatalı veri girdiniz");
		}
		else {
			price = km * (0.10);
			
			if(age<12) {
				price = price - (price/2);
			}else if(age<24) {
				price = price - (price/10);
			}else if(age>65) {
				price = price - ((price*3)/10);
			}
			
			if(tripType == 2) {
				price = (price - (price/5))*2;
			}
	
			System.out.println("Toplam Tutar : " + price +" TL");
	
		}
	}

}
