package KDVTutari;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double tutar , kdvTutar ,kdvliTutar , kdvOran;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ücret tutarını giriniz : ");
		tutar = input.nextDouble();
		
		kdvOran = tutar<1000 && tutar >0 ? 0.18 : 0.8;
		kdvTutar = tutar * kdvOran;
		kdvliTutar = kdvTutar + tutar;
		

		System.out.println("Tutar : " + tutar);
		System.out.println("KDV Oranı : " + kdvOran);
		System.out.println("KDV Tutar : " + kdvTutar);
		System.out.println("KDVli Tutar : " + kdvliTutar);
		
	}

}
