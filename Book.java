package library_management_system;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Book extends Item {

	//attributes
	private String ISBN;
	private String genre;
	private String description;

	//setters and getters
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	//constructors
	public Book(int ID, String title, Author author, double price,
			int pages, int dueDays, LocalDate publishingDate,
			String ISBN, String genre, String description) {
		super(ID, title, author, price, pages, dueDays, publishingDate);
		this.ISBN = ISBN;
		this.genre = genre;
		this.description = description;
	}

	//toString
	@Override
	public String toString() {
		return "ISBN=" + ISBN 
				+ ", genre=" + genre 
				+ ", description=" + description 
				+ super.toString();
	}

}
