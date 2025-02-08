package library_management_system;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Author implements Serializable{

	//attributes
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;

	//setters and getters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	//constructors
	public Author(String firstName, String lastName, LocalDate dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	//toString
	@Override
	public String toString() {
		return "firstName=" + firstName 
				+ ", lastName=" + lastName 
				+ ", dateOfBirth=" + dateOfBirth;
	}

}
