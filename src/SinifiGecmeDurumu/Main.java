package SinifiGecmeDurumu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int mat,fizik,muzik,turkce,kimya,count=0;
		double average = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik Notunuz : ");
		mat = input.nextInt();
		
		if(mat>0 && mat<=100) {
			average+=mat;
			count++;
		}
		System.out.print("Fizik Notunuz : ");
		fizik= input.nextInt();
		
		if(fizik>0 && fizik<=100) {
			average+=fizik;
			count++;
		}
		
		System.out.print("Müzik Notunuz : ");
		muzik = input.nextInt();
		
		if(muzik>0 && muzik<=100) {
			average+=muzik;
			count++;
		}
		
		System.out.print("Türkçe Notunuz : ");
		turkce = input.nextInt();
		
		if(turkce>0 && turkce<=100) {
			average+=turkce;
			count++;
		}
		
		System.out.print("Kimya Notunuz : ");
		kimya = input.nextInt();
		
		if(kimya>0 && kimya<=100) {
			average+=kimya;
			count++;
		}
		
		average = average / count;
		if(average <=55) {
			System.out.println("Sınıfta kaldınız.");
		}
		else {
			System.out.println("Sınıfı geçtiniz");
		}
		System.out.println("Ortalamanız : " + average);

	}

}
