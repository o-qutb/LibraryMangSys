package library_management_system;

import java.time.LocalDate;

public class Magazine extends Item {

	//attributes
	private int issueNumber;

	//setters and getters
	public int getIssueNumber() {
		return issueNumber;
	}
	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	//constructors
	public Magazine(int ID, String title, Author author,
			double price, int pages, int dueDays,
			LocalDate publishingDate,int issueNumber) {
		super(ID, title, author, price, pages, dueDays, publishingDate);
		this.issueNumber = issueNumber;
	}
	
	//toString
	@Override
	public String toString() {
		return "issueNumber=" + issueNumber 
				+ super.toString();
	}

}
