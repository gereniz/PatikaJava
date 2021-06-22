package ATM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String username,password;
		int right=3,select;
		double price,balance = 1500;
		
		Scanner input = new Scanner(System.in);
		while(right>0) {
		System.out.println("Kullanıcı Adınız : ");
		username = input.nextLine();
		
		System.out.println("Şifreniz : ");
		password = input.nextLine();
		
		if(username.equals("patika") && password.equals("123456")) {
			System.out.println("Merhaba,sisteme giriş yaptınız");
			do {
				
				System.out.println("Lütfen yapacağınız işlemi seçiniz");
				System.out.println("1-Para Yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorgula\n"+"4-Çıkış Yap");
				select = input.nextInt();
				switch(select) {
				case 1:
					System.out.println("Para miktarı");
					price = input.nextDouble();
					balance+=price;
					System.out.println("Toplam Paranız : " + balance);
					break;
				case 2:
					System.out.println("Para miktarı");
					price = input.nextDouble();
					if(price > balance) {
						System.out.println("Bakiyeniz yetersiz");
					}else {
						balance-=price;
					}
					System.out.println("Toplam Paranız : " + balance);
					break;
				case 3:
					System.out.println("Toplam Paranız : " + balance);
				 break;
				case 4:
					System.out.println("Çıkış Yapıldı");
					break;
				}
			}
			while(select!=4);
			break;
		}else {
			right--;
			System.out.println("Kullanıcı adı yada şifre yanlış.Lütfen Tekrar Deneyimiz");;
			if(right == 0) {
				System.out.println("Hesabınız Bloke Olmuştur.");
			}else {
				System.out.println("Kalan hakkınız : " +right);
			}
		}
		}
		
	}

}
