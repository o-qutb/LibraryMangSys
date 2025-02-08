package library_management_system;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Item implements Serializable{

	//attributes
	private int ID;
	private String title;
	private Author author;
	private double price;
	private int pages;
	private int dueDays;
	private LocalDate publishingDate;


	//setters and getters
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		ID = ID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getDueDays() {
		return dueDays;
	}
	public void setDueDays(int dueDays) {
		this.dueDays = dueDays;
	}
	public LocalDate getPublishingDate() {
		return publishingDate;
	}
	public void setPublishingDate(LocalDate publishingDate) {
		this.publishingDate = publishingDate;
	}

	//empty constructor
	public Item() {
	}
	//Parametrised constructor
	public Item(int ID, String title, Author author, double price, int pages, int dueDays, LocalDate publishingDate) {
		this.ID = ID;
		this.title = title;
		this.author = author;
		this.price = price;
		this.pages = pages;
		this.dueDays = dueDays;
		this.publishingDate = publishingDate;
	}

	//toString
	@Override
	public String toString() {
		return "ID=" + ID 
				+ ", title=" + title 
				+ ", price=" + price 
				+ ", pages=" + pages 
				+ ", dueDays=" + dueDays
				+ ", publishingDate=" + publishingDate;
	}
}
