package KitapSiralayici;

import java.time.LocalDate;


public class Book implements Comparable<Book>{
	
	String name;
	Integer pageNumber;
	String authorName;
	LocalDate releaseDate;
	
	public Book(String name, Integer pageNumber, String authorName, LocalDate releaseDate) {
		super();
		this.name = name;
		this.pageNumber = pageNumber;
		this.authorName = authorName;
		this.releaseDate = releaseDate;
	}

	/*
	@Override
	public int compareTo(Book book) {
		
		return  this.name.compareTo(book.name);
	}
	*/
	
	 public int compareTo(Book book) {
		
		return	book.pageNumber.compareTo(this.pageNumber);
	}
	 
	
	
	
}
