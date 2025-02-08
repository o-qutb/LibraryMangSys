package library_management_system;

import java.io.Serializable;
import java.time.LocalDate;

public class Transaction implements Serializable{

	//attributes
	private String transactionID;
	private Customer customer;
	private Item item;
	private LocalDate checkOutDate; //will be the current date (automatically generated) when an item is checked out
	private LocalDate checkInDate; //will be entered manually 
	private Service service;

	//setters and getters
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public LocalDate getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}

	//constructors
	public Transaction(String transactionID, Customer customer, Item item, LocalDate checkOutDate,
			LocalDate checkInDate) {
		this.transactionID = transactionID;
		this.customer = customer;
		this.item = item;
		this.checkOutDate = checkOutDate;
		this.checkInDate = checkInDate;
		
	}
	public Transaction(String transactionID, Customer customer, Item item, LocalDate checkOutDate,
			LocalDate checkInDate,Service service) {
		this.transactionID = transactionID;
		this.customer = customer;
		this.item = item;
		this.checkOutDate = checkOutDate;
		this.checkInDate = checkInDate;
		this.service = service;
	}


	//toString
	@Override
	public String toString() {
		return "transactionID=" + transactionID 
				+ ", customer=" + customer 
				+ ", item=" + item
				+ ", checkOutDate=" + checkOutDate 
				+ ", checkInDate=" + checkInDate 
				+ ", service=" + service;
	}
}
