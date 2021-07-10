package SigortaYonetimSistemi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("E mail : ");
		String mail = input.next();
		System.out.print("Şifre : ");
		String password = input.next();
		
		AccountManager accountManager = new AccountManager();
		accountManager.login(mail, password);
		

	}

}
