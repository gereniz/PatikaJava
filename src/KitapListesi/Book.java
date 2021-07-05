package KitapListesi;

import java.time.LocalDate;

public class Book {
	private String name;
	private Integer pageNumber;
	private String authorName;
	private LocalDate releaseDate;
	
	public Book(String name, Integer pageNumber, String authorName, LocalDate releaseDate) {
		super();
		this.setName(name);
		this.setPageNumber(pageNumber);
		this.setAuthorName(authorName);
		this.setReleaseDate(releaseDate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

}
