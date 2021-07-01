package KitapSiralayici;

import java.time.LocalDate;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		/*
		TreeSet<Book> booksName =  new TreeSet<Book>();
		booksName.add(new Book("B",10,"AA",LocalDate.parse("2021-07-01")));
		booksName.add(new Book("A",20,"BB",LocalDate.parse("2021-07-01")));
		booksName.add(new Book("D",30,"BA",LocalDate.parse("2021-07-01")));
		booksName.add(new Book("C",40,"CC",LocalDate.parse("2021-07-01")));
		booksName.add(new Book("E",50,"DD",LocalDate.parse("2021-07-01")));
	
		
		for(Book book : booksName) {
			System.out.println(book.name);
		}
		*/
		System.out.println();
		
		TreeSet<Book> booksPageNumber =  new TreeSet<Book>();
		booksPageNumber.add(new Book("B",20,"AA",LocalDate.parse("2021-07-01")));
		booksPageNumber.add(new Book("A",10,"BB",LocalDate.parse("2021-07-01")));
		booksPageNumber.add(new Book("D",40,"BA",LocalDate.parse("2021-07-01")));
		booksPageNumber.add(new Book("C",30,"CC",LocalDate.parse("2021-07-01")));
		booksPageNumber.add(new Book("E",50,"DD",LocalDate.parse("2021-07-01")));
	
		for(Book book : booksPageNumber) {
			System.out.println(book.pageNumber);
		}
		
		
	}

}
