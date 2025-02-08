package library_management_system;

import java.time.LocalDate;

public class ScientificJournal extends Item {

	//attributes
	private String publicationFrequency;
	private double impactFactor;

	//setters and getters
	public String getPublicationFrequency() {
		return publicationFrequency;
	}
	public void setPublicationFrequency(String publicationFrequency) {
		this.publicationFrequency = publicationFrequency;
	}
	public double getImpactFactor() {
		return impactFactor;
	}
	public void setImpactFactor(double impactFactor) {
		this.impactFactor = impactFactor;
	}

	//Constructors
	public ScientificJournal(int ID, String title, Author author,
			double price, int pages, int dueDays,
			LocalDate publishingDate, String publicationFrequency, double impactFactor) {
		super(ID, title, author, price, pages, dueDays, publishingDate);
		this.publicationFrequency = publicationFrequency;
		this.impactFactor = impactFactor;
	}
	
	//toString
	@Override
	public String toString() {
		return "publicationFrequency=" + publicationFrequency 
				+ ", impactFactor=" + impactFactor 
				+ super.toString();
	}

}
