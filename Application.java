package library_management_system;

import java.util.ArrayList;


public class Application {

	private ArrayList<Item> items = new ArrayList<Item>();
	private ArrayList<Author> authors = new ArrayList<Author>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

	//setters and getters
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	public ArrayList<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<Author> authors) {
		this.authors = authors;
	}
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	// constructors
	public Application(ArrayList<Item> items, ArrayList<Author> authors, ArrayList<Customer> customers,
			ArrayList<Transaction> transactions) {
		this.items = items;
		this.authors = authors;
		this.customers = customers;
		this.transactions = transactions;
	}

	// function 4 (add customer)
//		public static void addCustomer() {
//			boolean found = true;
//			String id = null;
//			while (found == true) {
//				System.out.println("Enter valid Customer id:");
//				id = input.next();
//				while (id.trim() == "") {
//					System.out.println("invalid id");
//					System.out.println("Enter valid Customer id:");
//					id = input.next();
//				}
//
//				found = false;
//
//				if (customers != null && customers.size() > 0) {
//					for (Customer cus : customers) {
//						if (cus.getCustomerID().equalsIgnoreCase(id)) {
//							found = true;
//							break;
//						}
//					}
//				}
//			}
//
//			// if id not found, add to list
//			if (found == false) {
//				System.out.println("Enter first name:");
//				String firstN = input.next();
//				System.out.println("Enter last name:");
//				String lastN = input.next();
//				System.out.println("Enter address:");
//				String address = input.next();
//				System.out.println("Enter phone number:");
//				String phoneN = input.next();
//				System.out.println("Enter DOT as: (yyyy-mm-dd):");
//				String dot = input.next();
//				System.out.println("Customer is student? (Y/N)");
//				String isStudent = input.next();
//				while (!(isStudent.equalsIgnoreCase("y")) && !(isStudent.equalsIgnoreCase("n"))) {
//					System.out.println("Customer is student? (Y/N)");
//					isStudent = input.next();
//				}
//				Boolean student = false;
//				if (isStudent.equalsIgnoreCase("y")) {
//					student = true;
//				}
//
//				customer = new Customer(id, firstN, lastN, LocalDate.parse(dot), address, phoneN, student);
//				customers.add(customer);
//			}
//
//		}
//
//		// function 5 (update customer)
//		public static void updateCustomer() {
//			boolean found = false;
//			String id = "";
//			// Check if id exists in Customers array list
//			while (found == false) {
//				System.out.println("Enter valid customer id to uptade:");
//				id = input.next();
//				while (id.trim() == "") {
//					System.out.println("invalid id");
//					System.out.println("Enter valid customer id to update:");
//					id = input.next();
//				}
//
//				if (customers != null && customers.size() > 0) {
//					for (Customer cust : customers) {
//						if (cust.getCustomerID().equalsIgnoreCase(id)) {
//							found = true;
//							break;
//						}
//					}
//				}
//			}
//			// If item id exists, then update data
//			if (found) {
//				System.out.println("Enter first name to update:");
//				String firstN = input.next();
//				System.out.println("Enter last name to update:");
//				String lastN = input.next();
//				System.out.println("Enter address to update:");
//				String address = input.next();
//				System.out.println("Enter phone number to update:");
//				String phoneN = input.next();
//				System.out.println("Enter DOT as: (yyyy-mm-dd) to update:");
//				String dot = input.next();
//				System.out.println("Customer is student? (Y/N) to update");
//				String isStudent = input.next();
//				while (!(isStudent.equalsIgnoreCase("y")) && !(isStudent.equalsIgnoreCase("n"))) {
//					System.out.println("Customer is student? (Y/N) to update");
//					isStudent = input.next();
//				}
//				Boolean student = false;
//				if (isStudent.equalsIgnoreCase("y")) {
//					student = true;
//				}
//
//				if (customers != null && customers.size() > 0) {
//					for (Customer cust : customers) {
//						if (cust.getCustomerID().equalsIgnoreCase(id)) {
//							cust.setFirstName(firstN);
//							cust.setLastName(lastN);
//							cust.setAddress(address);
//							cust.setPhoneNumber(phoneN);
//							cust.setDateOfBirth(LocalDate.parse(dot));
//							cust.setStudent(student);
//							break;
//						}
//					}
//				}
//			}
//		}
//		// function 6 (delete customer)
//		public static void deleteCustomer() {
//			boolean found = false;
//			String id = "";
//			int index = 0;
//			// Check if id exists in Customers array list
//			while (found == false) {
//				System.out.println("Enter valid customer id to delete:");
//				id = input.next();
//				while (id.trim() == "") {
//					System.out.println("invalid id");
//					System.out.println("Enter valid customer id to delete:");
//					id = input.next();
//				}
//
//				index = 0;
//				if (customers != null && customers.size() > 0) {
//					for (Customer cust : customers) {
//						if (cust.getCustomerID().equalsIgnoreCase(id)) {
//							found = true;
//							break;
//						} else {
//							index++;
//						}
//					}
//				} else {
//					// List contains no elements
//					System.out.println("List is empty!");
//					break;
//				}
//			}
//
//			if (found) {
//				customers.remove(index);
//			}
//		}
//
//		// 7-New Borrow Transaction.
//		public void borrowTrans(String cust_id, int item_Id) {
//			// Do i return an arrayList?
//			LocalDate todayDateTime = LocalDate.now();
//			for (Customer custom : customers) {
//				if ((custom.getCustomerID()).equals(cust_id)) {
//					System.out.println(custom.getFirstName() + " " + custom.getLastName());
//				}
//
//				for (Transaction trans : transactions) {
//					if (((trans.getItem().getID()) == item_Id)) {
//
//						if (trans.getCheckOutDate() == null) {
//							System.out.println(trans.getItem().getTitle());
//							System.out.println(trans.getItem().getTitle());
//							trans.setCheckOutDate(todayDateTime);
//
//						} else {
//							System.out.println("Item already borrowed");
//						}
//					}
//				}
//			}
//		}
//
//		// 8-New Return Transaction
//		public void returnTrans(String cust_id, int item_Id) {
//			LocalDate todayDateTime = LocalDate.now();
//			for (Transaction trans : transactions) {
//				if ((trans.getCustomer().getCustomerID()).equals(cust_id)) {
//					if (trans.getCheckInDate() != null) {
//						System.out.println(trans);
//
//						if (((trans.getItem().getID()) == item_Id)) {
//
//							if (trans.getCheckOutDate() == null) {
//								System.out.println(trans.getItem().getTitle());
//								System.out.println(trans.getItem().getTitle());
//								trans.setCheckInDate(todayDateTime);
//
//							}
//						}
//					}
//
//				}
//
//			}
//
//		}
//
//		// 9- List of items not yet returned
//		public void notReturned() {
//			ArrayList<Transaction> unreturned = new ArrayList<Transaction>();
//			for (Transaction trans : transactions) {
//				if (trans.getCheckInDate() == null) {
//					unreturned.add(trans);
//				}
//			}
//			System.out.println(unreturned);
//		}
//
//		// 16-List All Author Publication
////		public void authorPublic(String author_Lname) {
////			ArrayList<Item> authorPub = new ArrayList<Item>();
////			for (Item item : items) {
////				if (item.getAuthor().getLastName().equals(author_Lname)) {
////
////					authorPub.add(item);
////
////				}
////			}
////			System.out.println(authorPub);
////		}
//
//		@Override
//		public String toString() {
//			return "items=" + items 
//					+ ", authors=" + authors 
//					+ ", customers=" + customers 
//					+ ", transactions=" + transactions;
//		}
//		//SKIP THE BELOW FOR NOW!!!
//		// I JUST USED 3 OPTIONS FOR TEST!
//		public static void main(String[] args) {
//			System.out.println("Main menu");
//			System.out.println("4) Add Customer:");
//			System.out.println("5) Update Customer:");
//			System.out.println("6) Delete Customer:");
//			System.out.println("11) Exit:");
//			System.out.println("Enter option:");
//			int choice = input.nextInt();
//			while (choice < 1 || choice > 11) {
//				System.out.println("invalid option!");
//				System.out.println("Enter option:");
//				choice = input.nextInt();
//			}
//			while (choice != 0) {
//
//				switch (choice) {
//				case 1: { // Add Customer
//					Application.addCustomer();
//					break;
//				}
//				case 2: { // Update Customer
//					Application.updateCustomer();
//					break;
//				}
//				case 3: { // Delete Customer
//					Application.deleteCustomer();
//					break;
//				}
//				default:
//				}
//				System.out.println("\n");
//				System.out.println("1) Add customer:");
//				System.out.println("2) Update customer:");
//				System.out.println("3) Delete customer:");
//				System.out.println("0) Exit:");
//				System.out.println("Enter option:");
//				choice = input.nextInt();
//				while (choice < 0 || choice > 3) {
//					System.out.println("invalid option!");
//					System.out.println("Enter option:");
//					choice = input.nextInt();
//				}
//			}
//		}
}
