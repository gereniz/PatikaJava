package NotOrtalamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int mat,fizik,turk,kimya,tarih,muzik;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Matematik notunuz : ");
		mat = input.nextInt();
		
		System.out.println("Fizik notunuz : ");
		fizik = input.nextInt();
		
		System.out.println("Türkçe notunuz : ");
		turk = input.nextInt();
		
		
		System.out.println("Kimya notunuz : ");
		kimya = input.nextInt();
		
		
		System.out.println("Tarih notunuz : ");
		tarih = input.nextInt();
		
		
		System.out.println("Müzik notunuz : ");
		muzik = input.nextInt();
		
		double sonuc = (mat+fizik+turk+kimya+tarih+muzik)/6.0;
		System.out.println("Ortalamanız : " + sonuc);
		
		boolean gectiKaldı =sonuc > 60 ;
		System.out.println(gectiKaldı == true ? "Sınıfı geçti":"Sınıfta kaldı");
		
		
	}

}
