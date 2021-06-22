package MineSweeper_BITIRMEPROJESI;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

	int row;
	int column;
	
	
	public MineSweeper(int row, int column) {
	
		this.row = row;
		this.column = column;
	}
	


	//mayınları oluşturma
	String[][] mine() {
		
		Random rnd= new Random();
		String[][] mineSweeper = new String[this.row][this.column];
		int mineCount = (this.row * this.column)/4;
		
		for(int i = 0 ; i<this.row;i++) {
			for(int j = 0 ; j<this.column;j++) {
				mineSweeper[i][j] = "-";
			}
		}
		
		for(int i = 0 ; i<mineCount ; i++) {
			int mineRow= rnd.nextInt(row);
			int mineColumn = rnd.nextInt(column);
			
			mineSweeper[mineRow][mineColumn] = "*";
		}
		
		//mayınları yazdırma
		/*
		for(int i = 0 ; i<mineSweeper.length;i++) {
			for(int j = 0 ; j<mineSweeper[i].length;j++) {
				System.out.print(mineSweeper[i][j]);
			}
			System.out.println();
		}
		*/
		return mineSweeper;
		
	}
	
	//tala oluşturma
	String[][] field(){
		
		String[][] nagivation = new String[this.row][this.column];
		for(int i = 0 ; i<this.row ; i++) {
			for(int j = 0 ; j<this.column;j++) {
				nagivation[i][j] = "-"; 
			}
			
			
		}
		
		for(int i = 0 ; i<nagivation.length;i++) {
			for(int j = 0 ; j<nagivation[i].length;j++) {
				System.out.print(nagivation[i][j]);
			}
			System.out.println();
		}
		
		return nagivation;
	}
	
	//mayınları arama ve tarlaya atama
	void mineSearch() {
		String[][] mines = mine();
		int notMinesCount = (this.row*this.column)-((this.row * this.column)/4);
		System.out.println("#######");
		String[][] field = field();
	
		
		int count = 0;
		while(count != -1) {
			Scanner input = new Scanner(System.in);
			
			
			System.out.print("Satır giriniz :  ");
			int rowUser = input.nextInt();
			
			System.out.print("Sütun giriniz  : ");
			int columnUser = input.nextInt();
			
			if(columnUser >= this.column || rowUser >= this.row) {
				System.out.println("Sınırları aştınız.Tekrar satır ve sütun giriniz.");
			}
			else {
			
			if(mines[rowUser][columnUser] == "*") {
				System.out.println("Kaybettiniz");
				count = -1;
				
				for(int i = 0 ; i<mines.length;i++) {
					for(int j = 0 ; j<mines[i].length;j++) {
						System.out.print(mines[i][j]);
					}
					System.out.println();
				}
				break;
			}
			else {
				count=0;
				if((rowUser-1<0)) {
					if (columnUser-1<0) {
						if(mines[rowUser][columnUser+1] == "*"){
							count++;
						}
						
						if(mines[rowUser+1][columnUser] == "*"){
							count++;
						}
						if(mines[rowUser+1][columnUser+1] == "*"){
							count++;
						}
					}
					else if(columnUser+1>=this.column) {
						if(mines[rowUser][columnUser-1] == "*") {
							count++;
						}
						if(mines[rowUser+1][columnUser-1] == "*"){
							count++;
						}
						if(mines[rowUser+1][columnUser] == "*"){
							count++;
						}
					}else {
						
						if(mines[rowUser][columnUser-1] == "*") {
							count++;
						}
						if(mines[rowUser][columnUser+1] == "*"){
							count++;
						}
						
						if(mines[rowUser+1][columnUser-1] == "*"){
							count++;
						}
						if(mines[rowUser+1][columnUser] == "*"){
							count++;
						}
						if(mines[rowUser+1][columnUser+1] == "*"){
							count++;
						}
					}
				}
				else if(rowUser+1>=this.row) {
					if (columnUser-1<0) {
						if(mines[rowUser][columnUser+1] == "*"){
							count++;
						}
						
						if(mines[rowUser-1][columnUser] == "*"){
							count++;
						}
						if(mines[rowUser-1][columnUser+1] == "*"){
							count++;
						}
					}
					else if(columnUser+1>=this.column) {
						if(mines[rowUser][columnUser-1] == "*") {
							count++;
						}
						if(mines[rowUser-1][columnUser-1] == "*"){
							count++;
						}
						if(mines[rowUser-1][columnUser] == "*"){
							count++;
						}
					}
					else {
						if(mines[rowUser-1][columnUser-1] == "*"){
							count++;
						}
						if(mines[rowUser-1][columnUser] == "*"){
							count++;
						}
						
						if(mines[rowUser-1][columnUser+1] == "*"){
							count++;
						}
						if(mines[rowUser][columnUser-1] == "*") {
							count++;
						}
						if(mines[rowUser][columnUser+1] == "*"){
							count++;
						}
					}
				}
				else if(columnUser-1<0) {
					if(rowUser-1<0) {
						if(mines[rowUser][columnUser+1] == "*"){
							count++;
						}
						
						if(mines[rowUser+1][columnUser] == "*"){
							count++;
						}
						if(mines[rowUser+1][columnUser+1] == "*"){
							count++;
						}
					}
					else if(rowUser>=this.row) {
						if(mines[rowUser][columnUser-1] == "*") {
							count++;
						}
						if(mines[rowUser+1][columnUser-1] == "*"){
							count++;
						}
						if(mines[rowUser+1][columnUser] == "*"){
							count++;
						}
					}
					else {
						
						if(mines[rowUser-1][columnUser] == "*"){
							count++;
						}
						
						if(mines[rowUser-1][columnUser+1] == "*"){
							count++;
						}
						
						if(mines[rowUser][columnUser+1] == "*"){
							count++;
						}
						
						if(mines[rowUser+1][columnUser] == "*"){
							count++;
						}
						if(mines[rowUser+1][columnUser+1] == "*"){
							count++;
						}
					}
				}
				else if(columnUser+1>=this.column) {
					if (rowUser-1<0) {
						if(mines[rowUser][columnUser+1] == "*"){
							count++;
						}
						
						if(mines[rowUser-1][columnUser] == "*"){
							count++;
						}
						if(mines[rowUser-1][columnUser+1] == "*"){
							count++;
						}
					}
					else if(rowUser+1>=this.row) {
						if(mines[rowUser][columnUser-1] == "*") {
							count++;
						}
						if(mines[rowUser-1][columnUser-1] == "*"){
							count++;
						}
						if(mines[rowUser-1][columnUser] == "*"){
							count++;
						}
					}
					else {
						if(mines[rowUser-1][columnUser-1] == "*"){
							count++;
						}
						if(mines[rowUser-1][columnUser] == "*"){
							count++;
						}
						
						if(mines[rowUser][columnUser-1] == "*") {
							count++;
						}
						
						
						if(mines[rowUser+1][columnUser-1] == "*"){
							count++;
						}
						if(mines[rowUser+1][columnUser] == "*"){
							count++;
						}
					}
					
				}else {
					if(mines[rowUser-1][columnUser-1] == "*"){
						count++;
					}
					if(mines[rowUser-1][columnUser] == "*"){
						count++;
					}
					
					if(mines[rowUser-1][columnUser+1] == "*"){
						count++;
					}
					if(mines[rowUser][columnUser-1] == "*") {
						count++;
					}
					if(mines[rowUser][columnUser+1] == "*"){
						count++;
					}
					
					if(mines[rowUser+1][columnUser-1] == "*"){
						count++;
					}
					if(mines[rowUser+1][columnUser] == "*"){
						count++;
					}
					if(mines[rowUser+1][columnUser+1] == "*"){
						count++;
					}
				}
			}
			notMinesCount--;
			
			System.out.println("###########");
			String n = Integer.toString(count);
			field[rowUser][columnUser] = n;
			for(int i = 0  ; i < field.length; i++) {
				for(int j = 0; j < field[i].length;j++) {
					System.out.print(field[i][j]);
				}
				System.out.println();
			}
			if(notMinesCount ==0 ) {
				System.out.println("Kazandınız.Tebrikler!!");
				break;
			}
			}
		}
	
	}
	
	
	void run() {
		mineSearch();
	}
}

