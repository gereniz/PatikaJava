package MatrisTranspozu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matrisin satır sayısını giriniz : ");
		int row = input.nextInt();
		
		System.out.println("Matrisin sütun sayısını giriniz : ");
		int column = input.nextInt();
		
		int[][] matris = new int[row][column];
		int[][] transpoze = new int[column][row];
		for(int i = 0 ; i<matris.length ; i++) {
			for(int j = 0 ; j<matris[i].length ; j++) {
				System.out.println(i + ". satır " + j + ". sütun : ");
				matris[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Matris : ");
		for(int i = 0 ; i<matris.length ; i++) {
			for(int j = 0 ; j<matris[i].length ; j++) {
				System.out.print(matris[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("Tranpoze : ");
		
		for(int i =0 ; i<matris.length ; i++) {
			for(int j = 0 ; j< matris[0].length ; j++) {
				transpoze[j][i] = matris[i][j];
			}
		}
		
		for(int i = 0 ; i<transpoze.length ; i++) {
			for(int j = 0 ; j<transpoze[i].length ; j++) {
				System.out.print(transpoze[i][j] + "  ");
			}
			System.out.println();
			
		}
	}

}
