package KullaniciGirisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String username,password,select,newPassword,yes="E",no="H";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanıcı Adı : ");
		username = input.nextLine();
		
		System.out.print("Şifre : ");
		password = input.nextLine();
		
		if(username.equals("patika") && password.equals("java123")) {
			System.out.println("Giriş Başarılı");
		}
		else {
			System.out.println("Şifre sıfırlama isterseniz Evet /n Şifre sıfırlamak istemezseniz H yazınız");
			select = input.nextLine();
			switch (select) {
			case "E": {
				System.out.println("Şifre : ");
				newPassword = input.nextLine();
				if(newPassword.equals(password) || newPassword.equals("java123")) {
					System.out.println("Şifre oluşturulamadı");
					break;
				}
				else {
					System.out.println("Şifre oluşturuldu");
					break;
				}	
			}
			case "H":
				break;
			default:
				System.err.println("--");
			}
		}

	}

}
