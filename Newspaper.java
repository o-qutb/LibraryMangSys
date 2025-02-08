package library_management_system;

import java.time.LocalDate;

public class Newspaper extends Item {

	//attributes
	private String issueLanguage;

	//setters and getters
	public String getIssueLanguage() {
		return issueLanguage;
	}
	public void setIssueLanguage(String issueLanguage) {
		this.issueLanguage = issueLanguage;
	}

	//constructors
	public Newspaper(int ID, String title, Author author,
			double price, int pages, int dueDays,
			LocalDate publishingDate, String issueLanguage) {
		super(ID, title, author, price, pages, dueDays, publishingDate);
		this.issueLanguage = issueLanguage;

	}
	//toString
	@Override
	public String toString() {
		return "issueLanguage=" + issueLanguage 
				+ super.toString();
	}
}
