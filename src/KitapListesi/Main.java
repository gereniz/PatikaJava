package KitapListesi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	
		List<Book> books = new ArrayList<>();
		List<Book> bookPage = new ArrayList<>();
		Map<String, String> bookNameAuthor = new HashMap<>();
		
		books.add(new Book("A",100,"AA",LocalDate.parse("2021-07-01")));
		books.add(new Book("B",200,"BB",LocalDate.parse("2021-07-01")));
		books.add(new Book("D",30,"DD",LocalDate.parse("2021-07-01")));
		books.add(new Book("C",400,"CC",LocalDate.parse("2021-07-01")));
		books.add(new Book("E",50,"EE",LocalDate.parse("2021-07-01")));
		books.add(new Book("F",120,"BA",LocalDate.parse("2021-07-01")));
		books.add(new Book("G",250,"AB",LocalDate.parse("2021-07-01")));
		books.add(new Book("H",34,"DC",LocalDate.parse("2021-07-01")));
		books.add(new Book("I",430,"CE",LocalDate.parse("2021-07-01")));
		books.add(new Book("J",52,"EF",LocalDate.parse("2021-07-01")));
		
		books.forEach(book -> {
			
			bookNameAuthor.put(book.getName(),book.getAuthorName());
		});
		
		for(String key : bookNameAuthor.keySet()) {
			System.out.println(key + " " + bookNameAuthor.get(key));
			
		}
		
		books.stream().filter(book -> book.getPageNumber() > 100).forEach(book -> bookPage.add(book));
		
		for(Book b : bookPage) {
			System.out.println(b.getName() + " -> " + b.getPageNumber() );
		}
	
	 
	}

}
