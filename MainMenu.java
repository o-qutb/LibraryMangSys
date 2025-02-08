package library_management_system;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class MainMenu {
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		Application libraryApp = new Application(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(),
				new ArrayList<>());
		displayMainMenu(libraryApp);
	}

	/*------------------------------visual break------------------------------*/
	/*------------------------------visual break------------------------------*/

	public static void displayMainMenu(Application libraryApp) {
		// getting the user choice

		System.out.println("Main Menu");
		System.out.println("(1)  Add New Item");
		System.out.println("(2)  Update Existing Item");
		System.out.println("(3)  Delete Existing Item");
		System.out.println("(4)  Add New Customer");
		System.out.println("(5)  Update Existing Customer");
		System.out.println("(6)  Delete Existing Customer");
		System.out.println("(7)  Borrow Transaction");
		System.out.println("(8)  Return Transaction");
		System.out.println("(9)  List of Items Not Yet Returned");
		System.out.println("(10) List All Author Publications");
		System.out.println("(11) Save and Exit");
		System.out.print("Enter your choice: ");
		if (scanner.hasNextInt()) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			//			while(choice!=0){

			//			choice = scanner.nextInt();
			while (choice < 1 || choice > 12) {
				System.out.println("invalid option!");
				System.out.println("Enter your choice: ");
				choice = scanner.nextInt();
			}

			// user option dictates which functionality to go with
			if (choice == 1) {
				addNewItem(libraryApp);
			} else if (choice == 2) {
				updateItem(libraryApp);
			} else if (choice == 3) {
				deleteItem(libraryApp);
			} else if (choice == 4) {
				addCustomer(libraryApp);
			} else if (choice == 5) {
				updateCustomer(libraryApp);
			} else if (choice == 6) {
				deleteCustomer(libraryApp);
			} else if (choice == 7) {
				borrowTrans(libraryApp);
			} else if (choice == 8) {
				returnTrans(libraryApp);
			} else if (choice == 9) {
				itemsNotReturned(libraryApp);
			} else if (choice == 10) {
				listPublications(libraryApp);
			} else if (choice == 11) {
				saveExit(libraryApp);
			}
			else {
				System.out.println("Invalid choice.");
				System.out.println("Please try again and enter a valid choice.");
				displayMainMenu(libraryApp);
			}

			//				switch (choice) {
			//				case 1:
			//					addNewItem(libraryApp);
			//					break;
			//				case 2:
			//					updateItem(libraryApp);
			//					break;
			//				case 3:
			//					deleteItem(libraryApp);
			//					break;
			//				case 4:
			//					addCustomer(libraryApp);
			//					break;
			//				case 5:
			//					updateCustomer(libraryApp);
			//					break;
			//				case 6:
			//					deleteCustomer(libraryApp);
			//					break;
			//				case 7:
			//					borrowTrans(libraryApp);
			//					break;
			//				case 8:
			//					returnTrans(libraryApp);
			//					break;
			//				case 9:
			//					itemsNotReturned(libraryApp);
			//					break;
			//				case 10:
			//					listPublications(libraryApp);
			//					break;
			//				case 11:
			//					saveExit(libraryApp);
			//					break;
			//				default: // validating the user choice
			//					System.out.println("Invalid choice.");
			//					System.out.println("Please try again and enter a valid choice.");
			//					displayMainMenu(libraryApp);
			//				}
		}

		//			scanner.close();
	}
	// display the options
	//		do {
	//			
	//
	//		}
	//		// terminating the main menu loop if the user chooses 11 (save and exit)
	//		while (choice != 11);
	//		scanner.close();
	//
	//	}

	/*------------------------------visual break------------------------------*/
	/*------------------------------visual break------------------------------*/

	// option 1: add item
	public static void addNewItem(Application libraryApp) {
		System.out.println("Choose the type of item to add:");
		System.out.println("1: Book");
		System.out.println("2: Scientific Journal");
		System.out.println("3: Magazine");
		System.out.println("4: Newspaper");
		System.out.print("Enter your choice: ");

		int itemType= scanner.nextInt();
		scanner.nextLine();
		// determining which type of item to add
		//		System.out.println("Choose the type of item to add:");
		//		System.out.println("1: Book");
		//		System.out.println("2: Scientific Journal");
		//		System.out.println("3: Magazine");
		//		System.out.println("4: Newspaper");
		//		System.out.print("Enter your choice: ");




		// while (itemType < 1 || itemType > 4) {
		// System.out.println("invalid option!");
		// System.out.println("Enter your choice: ");
		// itemType = scanner.nextInt();
		// }
		while (itemType>0 && itemType<5) {
			//		switch (itemType) {
			//		case 1:
			//			addBook(libraryApp);
			//			break;
			//		case 2:
			//			addScientificJournal(libraryApp);
			//			break;
			//		case 3:
			//			addMagazine(libraryApp);
			//			break;
			//		case 4:
			//			addNewspaper(libraryApp);
			//			break;
			//		default: // validating user scanner
			//			System.out.println("invalid option!");
			//			System.out.println("Enter your choice: ");
			//			addNewItem(libraryApp);
			//
			//		}
			if(itemType==1) {
				addBook(libraryApp);
			}
			else if(itemType==2) {
				addScientificJournal(libraryApp);
			}
			else if(itemType==3) {
				addMagazine(libraryApp);
			}
			else if(itemType==4) {
				addNewspaper(libraryApp);
			}
			else {
				System.out.println("invalid option!");
				System.out.println("Enter your choice: ");
				addNewItem(libraryApp);
			}


		}
	}

	public static void addBook(Application libraryApp) {
		//		Scanner scanner = new Scanner(System.in);

		// get book info
		System.out.print("Enter Book ID: ");
		int bookID = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Book Title: ");
		String bookTitle = scanner.nextLine();

		// author info
		System.out.print("Enter Author's First Name: ");
		String authorFirstName = scanner.nextLine();
		System.out.print("Enter Author's Last Name: ");
		String authorLastName = scanner.nextLine();
		System.out.print("Enter Author's Date of Birth (YYYY-MM-DD): ");
		String authorDOBString = scanner.nextLine();
		// author DOB formatting
		LocalDate authorDOB = LocalDate.parse(authorDOBString, DateTimeFormatter.ISO_DATE);
		// creating the author object
		Author bookAuthor = new Author(authorFirstName, authorLastName, authorDOB);

		System.out.print("Enter Book Price: ");
		double bookPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter Book No. of Pages: ");
		int bookPages = scanner.nextInt();
		scanner.nextLine();
//		System.out.print("Enter No. of days due to book return: ");
//		int bookDueDays = scanner.nextInt();
//		scanner.nextLine();

		// publishing date entry and formatting
		System.out.print("Enter Book Publishing Date (YYYY-MM-DD): ");
		String bookPublishingDate = scanner.nextLine();
		LocalDate publishingDate = LocalDate.parse(bookPublishingDate, DateTimeFormatter.ISO_DATE);

		System.out.print("Enter Book ISBN: ");
		String bookISBN = scanner.nextLine();
		System.out.print("Enter Book Genre: ");
		String bookGenre = scanner.nextLine();
		System.out.print("Enter Book Description: ");
		String bookDescription = scanner.nextLine();

		// creating the book object
		Book newBook = new Book(bookID, bookTitle, bookAuthor, bookPrice, bookPages, 0, publishingDate,
				bookISBN, bookGenre, bookDescription);

		// Add the new book to the items list in the Application
		libraryApp.getItems().add(newBook);

		System.out.println("Book added successfully!");
		System.out.println("-----------------------------------------");
		displayMainMenu(libraryApp);

	}

	public static void addScientificJournal(Application libraryApp) {
		//		Scanner scanner = new Scanner(System.in);

		// get journal info
		System.out.print("Enter Journal ID: ");

		int journalID = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Journal Title: ");
		String journalTitle = scanner.nextLine();

		// author info
		System.out.print("Enter Author's First Name: ");
		String authorFirstName = scanner.nextLine();
		System.out.print("Enter Author's Last Name: ");
		String authorLastName = scanner.nextLine();
		System.out.print("Enter Author's Date of Birth (YYYY-MM-DD): ");
		String authorDOBString = scanner.nextLine();
		// author DOB formatting
		LocalDate authorDOB = LocalDate.parse(authorDOBString, DateTimeFormatter.ISO_DATE);
		// creating the author object
		Author journalAuthor = new Author(authorFirstName, authorLastName, authorDOB);

		System.out.print("Enter Journal Price: ");
		double journalPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter Journal No. of Pages: ");
		int journalPages = scanner.nextInt();
		scanner.nextLine();
//		System.out.print("Enter No. of days due to Journal return: ");
//		int journalDueDays = scanner.nextInt();
//		scanner.nextLine();

		// publishing date entry and formatting
		System.out.print("Enter Journal Publishing Date: ");
		String journalPublishingDate = scanner.nextLine();
		LocalDate publishingDate = LocalDate.parse(journalPublishingDate, DateTimeFormatter.ISO_DATE);

		System.out.print("Enter Journal Publishing freqeuncy: ");
		String jornalFrequency = scanner.nextLine();
		System.out.print("Enter Journal Impact Factor: ");
		double journalIF = scanner.nextDouble();
		scanner.nextLine();

		// creating the Journal object
		ScientificJournal newScientificJournal = new ScientificJournal(journalID, journalTitle, journalAuthor,
				journalPrice, journalPages, 0, publishingDate, jornalFrequency, journalIF);

		// Add the new Journal to the items list in the Application
		libraryApp.getItems().add(newScientificJournal);

		System.out.println("Journal added successfully!");
		System.out.println("-----------------------------------------");



		displayMainMenu(libraryApp);
	}

	public static void addMagazine(Application libraryApp) {
		//		Scanner scanner = new Scanner(System.in);

		// get magazine info
		System.out.print("Enter magazine ID: ");
		int magazineID = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter magazine Title: ");
		String magazineTitle = scanner.nextLine();

		// author info
		System.out.print("Enter Author's First Name: ");
		String authorFirstName = scanner.nextLine();
		System.out.print("Enter Author's Last Name: ");
		String authorLastName = scanner.nextLine();
		System.out.print("Enter Author's Date of Birth (YYYY-MM-DD): ");
		String authorDOBString = scanner.nextLine();
		// author DOB formatting
		LocalDate authorDOB = LocalDate.parse(authorDOBString, DateTimeFormatter.ISO_DATE);
		// creating the author object
		Author magazineAuthor = new Author(authorFirstName, authorLastName, authorDOB);

		System.out.print("Enter magazine Price: ");
		double magazinePrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter magazine No. of Pages: ");
		int magazinePages = scanner.nextInt();
		scanner.nextLine();
//		System.out.print("Enter No. of days due to magazine return: ");
//		int magazineDueDays = scanner.nextInt();
//		scanner.nextLine();

		// publishing date entry and formatting
		System.out.print("Enter magazine Publishing Date: ");
		String magazinePublishingDate = scanner.nextLine();
		LocalDate publishingDate = LocalDate.parse(magazinePublishingDate, DateTimeFormatter.ISO_DATE);

		System.out.print("Enter magazine Issue number: ");
		int magazineIssueNumber = scanner.nextInt();
		scanner.nextLine();

		// creating the Journal object
		Magazine newMagazine = new Magazine(magazineID, magazineTitle, magazineAuthor, magazinePrice, magazinePages,
				0, publishingDate, magazineIssueNumber);

		// Add the new Journal to the items list in the Application
		libraryApp.getItems().add(newMagazine);

		System.out.println("Magazine added successfully!");
		System.out.println("-----------------------------------------");

		displayMainMenu(libraryApp);
	}

	public static void addNewspaper(Application libraryApp) {
		//		Scanner scanner = new Scanner(System.in);

		// get newspaper info
		System.out.print("Enter newspaper ID: ");
		int newspaperID = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter newspaper Title: ");
		String newspaperTitle = scanner.nextLine();

		// author info
		System.out.print("Enter Author's First Name: ");
		String authorFirstName = scanner.nextLine();
		System.out.print("Enter Author's Last Name: ");
		String authorLastName = scanner.nextLine();
		System.out.print("Enter Author's Date of Birth (YYYY-MM-DD): ");
		String authorDOBString = scanner.nextLine();
		// author DOB formatting
		LocalDate authorDOB = LocalDate.parse(authorDOBString, DateTimeFormatter.ISO_DATE);
		// creating the author object
		Author newspaperAuthor = new Author(authorFirstName, authorLastName, authorDOB);

		System.out.print("Enter newspaper Price: ");
		double newspaperPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter newspaper No. of Pages: ");
		int newspaperPages = scanner.nextInt();
		scanner.nextLine();
//		System.out.print("Enter No. of days due to newspaper return: ");
//		int newspaperDueDays = scanner.nextInt();
//		scanner.nextLine();

		// publishing date entry and formatting
		System.out.print("Enter Journal Publishing Date: ");
		String newspaperPublishingDate = scanner.nextLine();
		LocalDate publishingDate = LocalDate.parse(newspaperPublishingDate, DateTimeFormatter.ISO_DATE);

		System.out.print("Enter newspaper issue language: ");
		String newspaperIssueLang = scanner.nextLine();

		// creating the newspaper object
		Newspaper newNewspaper = new Newspaper(newspaperID, newspaperTitle, newspaperAuthor, newspaperPrice,
				newspaperPages, 0, publishingDate, newspaperIssueLang);

		// Add the new newspaper to the items list in the Application
		libraryApp.getItems().add(newNewspaper);

		System.out.println("Newspaper added successfully!");
		System.out.println("-----------------------------------------");
		displayMainMenu(libraryApp);
	}

	/*------------------------------visual break------------------------------*/
	/*------------------------------visual break------------------------------*/

	// option 2: update item
	@SuppressWarnings("unchecked")
	public static void updateItem(Application libraryApp) {
		//		Scanner scanner = new Scanner(System.in);
		String itemTitle;
		System.out.println("Enter the title of the item you want to update: ");
		itemTitle = scanner.nextLine();
		ObjectInputStream ois = null;
		ArrayList<Item> readItems = new ArrayList<Item>();
		try {
			ois = new ObjectInputStream(new FileInputStream("Items.txt"));
			readItems = (ArrayList<Item>) ois.readObject();
			for (Item item : readItems) {
				if (itemTitle.equalsIgnoreCase(item.getTitle())) {

					if (item instanceof Book) {
						updateBook(item);
					} else if (item instanceof ScientificJournal) {
						updateJournal(item);
					} else if (item instanceof Magazine) {
						updateMagazine(item);
					} else if (item instanceof Newspaper) {
						updateNewspaper(item);
					}
				} else {
					System.out.println("No item under this title! Try again.");
					updateItem(libraryApp);
				}
			}
			libraryApp.getItems().clear();
			libraryApp.getItems().addAll(readItems);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				ois.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		displayMainMenu(libraryApp);
	}

	public static void updateBook(Item i) {
		Book updatedBook = (Book) i;
		//		Scanner scanner = new Scanner(System.in);

		// get book info
		System.out.print("Enter new Book ID: ");
		int bookID = scanner.nextInt();
		updatedBook.setID(bookID);
		scanner.nextLine();
		System.out.print("Enter new Book Title: ");
		String bookTitle = scanner.nextLine();
		updatedBook.setTitle(bookTitle);

		// author info
		System.out.print("Enter Author's First Name: ");
		String authorFirstName = scanner.nextLine();
		System.out.print("Enter Author's Last Name: ");
		String authorLastName = scanner.nextLine();
		System.out.print("Enter Author's Date of Birth (YYYY-MM-DD): ");
		String authorDOBString = scanner.nextLine();
		// author DOB formatting
		LocalDate authorDOB = LocalDate.parse(authorDOBString, DateTimeFormatter.ISO_DATE);
		// creating the author object
		Author bookAuthor = new Author(authorFirstName, authorLastName, authorDOB);
		updatedBook.setAuthor(bookAuthor);

		System.out.print("Enter Book Price: ");
		double bookPrice = scanner.nextDouble();
		updatedBook.setPrice(bookPrice);
		scanner.nextLine();
		System.out.print("Enter Book No. of Pages: ");
		int bookPages = scanner.nextInt();
		updatedBook.setPages(bookPages);
		scanner.nextLine();
		System.out.print("Enter No. of days due to book return: ");
		int bookDueDays = scanner.nextInt();
		updatedBook.setDueDays(bookDueDays);
		scanner.nextLine();

		// publishing date entry and formatting
		System.out.print("Enter Book Publishing Date (YYYY-MM-DD): ");
		String bookPublishingDate = scanner.nextLine();
		LocalDate publishingDate = LocalDate.parse(bookPublishingDate, DateTimeFormatter.ISO_DATE);
		updatedBook.setPublishingDate(publishingDate);

		System.out.print("Enter Book ISBN: ");
		String bookISBN = scanner.nextLine();
		updatedBook.setISBN(bookISBN);
		System.out.print("Enter Book Genre: ");
		String bookGenre = scanner.nextLine();
		updatedBook.setGenre(bookGenre);
		System.out.print("Enter Book Description: ");
		String bookDescription = scanner.nextLine();
		updatedBook.setDescription(bookDescription);

		System.out.println("Book updated successfully!");
		System.out.println("-----------------------------------------");


	}

	public static void updateJournal(Item i) {
		ScientificJournal updatedJournal = (ScientificJournal) i;
		//		Scanner scanner = new Scanner(System.in);

		// get journal info
		System.out.print("Enter Journal ID: ");
		int journalID = scanner.nextInt();
		updatedJournal.setID(journalID);
		scanner.nextLine();
		System.out.print("Enter Journal Title: ");
		String journalTitle = scanner.nextLine();
		updatedJournal.setTitle(journalTitle);

		// author info
		System.out.print("Enter Author's First Name: ");
		String authorFirstName = scanner.nextLine();
		System.out.print("Enter Author's Last Name: ");
		String authorLastName = scanner.nextLine();
		System.out.print("Enter Author's Date of Birth (YYYY-MM-DD): ");
		String authorDOBString = scanner.nextLine();
		// author DOB formatting
		LocalDate authorDOB = LocalDate.parse(authorDOBString, DateTimeFormatter.ISO_DATE);
		// creating the author object
		Author journalAuthor = new Author(authorFirstName, authorLastName, authorDOB);
		updatedJournal.setAuthor(journalAuthor);

		System.out.print("Enter Journal Price: ");
		double journalPrice = scanner.nextDouble();
		scanner.nextLine();
		updatedJournal.setPrice(journalPrice);
		System.out.print("Enter Journal No. of Pages: ");
		int journalPages = scanner.nextInt();
		updatedJournal.setPages(journalPages);
		scanner.nextLine();
		System.out.print("Enter No. of days due to Journal return: ");
		int journalDueDays = scanner.nextInt();
		updatedJournal.setDueDays(journalDueDays);
		scanner.nextLine();

		// publishing date entry and formatting
		System.out.print("Enter Journal Publishing Date: ");
		String journalPublishingDate = scanner.nextLine();
		LocalDate publishingDate = LocalDate.parse(journalPublishingDate, DateTimeFormatter.ISO_DATE);
		updatedJournal.setPublishingDate(publishingDate);

		System.out.print("Enter Journal Publishing freqeuncy: ");
		String jornalFrequency = scanner.nextLine();
		updatedJournal.setPublicationFrequency(jornalFrequency);
		System.out.print("Enter Journal Impact Factor: ");
		double journalIF = scanner.nextDouble();
		updatedJournal.setImpactFactor(journalIF);
		scanner.nextLine();

		System.out.println("Journal updated successfully!");
		System.out.println("-----------------------------------------");

	}

	public static void updateMagazine(Item i) {
		Magazine updatedMagazine = (Magazine) i;
		//		Scanner scanner = new Scanner(System.in);

		// get magazine info
		System.out.print("Enter magazine ID: ");
		int magazineID = scanner.nextInt();
		updatedMagazine.setID(magazineID);
		scanner.nextLine();
		System.out.print("Enter magazine Title: ");
		String magazineTitle = scanner.nextLine();
		updatedMagazine.setTitle(magazineTitle);

		// author info
		System.out.print("Enter Author's First Name: ");
		String authorFirstName = scanner.nextLine();
		System.out.print("Enter Author's Last Name: ");
		String authorLastName = scanner.nextLine();
		System.out.print("Enter Author's Date of Birth (YYYY-MM-DD): ");
		String authorDOBString = scanner.nextLine();
		// author DOB formatting
		LocalDate authorDOB = LocalDate.parse(authorDOBString, DateTimeFormatter.ISO_DATE);
		// creating the author object
		Author magazineAuthor = new Author(authorFirstName, authorLastName, authorDOB);
		updatedMagazine.setAuthor(magazineAuthor);

		System.out.print("Enter magazine Price: ");
		double magazinePrice = scanner.nextDouble();
		updatedMagazine.setPrice(magazinePrice);
		scanner.nextLine();
		System.out.print("Enter magazine No. of Pages: ");
		int magazinePages = scanner.nextInt();
		updatedMagazine.setPages(magazinePages);
		scanner.nextLine();
		System.out.print("Enter No. of days due to magazine return: ");
		int magazineDueDays = scanner.nextInt();
		updatedMagazine.setDueDays(magazineDueDays);
		scanner.nextLine();

		// publishing date entry and formatting
		System.out.print("Enter magazine Publishing Date: ");
		String magazinePublishingDate = scanner.nextLine();
		LocalDate publishingDate = LocalDate.parse(magazinePublishingDate, DateTimeFormatter.ISO_DATE);
		updatedMagazine.setPublishingDate(publishingDate);

		System.out.print("Enter magazine Issue number: ");
		int magazineIssueNumber = scanner.nextInt();
		updatedMagazine.setIssueNumber(magazineIssueNumber);
		scanner.nextLine();

		System.out.println("Magazine updated successfully!");
		System.out.println("-----------------------------------------");

	}

	public static void updateNewspaper(Item i) {
		Newspaper updatedNewspaper = (Newspaper) i;
		//		Scanner scanner = new Scanner(System.in);

		// get newspaper info
		System.out.print("Enter newspaper ID: ");
		int newspaperID = scanner.nextInt();
		updatedNewspaper.setID(newspaperID);
		scanner.nextLine();
		System.out.print("Enter newspaper Title: ");
		String newspaperTitle = scanner.nextLine();
		updatedNewspaper.setTitle(newspaperTitle);

		// author info
		System.out.print("Enter Author's First Name: ");
		String authorFirstName = scanner.nextLine();
		System.out.print("Enter Author's Last Name: ");
		String authorLastName = scanner.nextLine();
		System.out.print("Enter Author's Date of Birth (YYYY-MM-DD): ");
		String authorDOBString = scanner.nextLine();
		// author DOB formatting
		LocalDate authorDOB = LocalDate.parse(authorDOBString, DateTimeFormatter.ISO_DATE);
		// creating the author object
		Author newspaperAuthor = new Author(authorFirstName, authorLastName, authorDOB);
		updatedNewspaper.setAuthor(newspaperAuthor);

		System.out.print("Enter newspaper Price: ");
		double newspaperPrice = scanner.nextDouble();
		updatedNewspaper.setPrice(newspaperPrice);
		scanner.nextLine();
		System.out.print("Enter newspaper No. of Pages: ");
		int newspaperPages = scanner.nextInt();
		updatedNewspaper.setPages(newspaperPages);
		scanner.nextLine();
		System.out.print("Enter No. of days due to newspaper return: ");
		int newspaperDueDays = scanner.nextInt();
		updatedNewspaper.setDueDays(newspaperDueDays);
		scanner.nextLine();

		// publishing date entry and formatting
		System.out.print("Enter newspaper Publishing Date: ");
		String newspaperPublishingDate = scanner.nextLine();
		LocalDate publishingDate = LocalDate.parse(newspaperPublishingDate, DateTimeFormatter.ISO_DATE);
		updatedNewspaper.setPublishingDate(publishingDate);

		System.out.print("Enter newspaper issue language: ");
		String newspaperIssueLang = scanner.nextLine();
		updatedNewspaper.setIssueLanguage(newspaperIssueLang);

		System.out.println("Newspaper Updated successfully!");
		System.out.println("-----------------------------------------");
		

	}

	/*------------------------------visual break------------------------------*/
	/*------------------------------visual break------------------------------*/

	// option 3: delete item
	@SuppressWarnings("unchecked")
	public static void deleteItem(Application libraryApp) {
		//		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the title of the item you want to delete: ");
		String itemTitle = scanner.nextLine();
		ObjectInputStream ois = null;
		ArrayList<Item> readItems = new ArrayList<Item>();
		try {
			ois = new ObjectInputStream(new FileInputStream("Items.txt"));
			readItems = (ArrayList<Item>) ois.readObject();
			for (Item item : readItems) {
				if (itemTitle.equalsIgnoreCase(item.getTitle())) {
					readItems.remove(item);
					break;
				} else {
					System.out.println("No item under this title! Try again.");
					deleteItem(libraryApp);
				}
			}
			libraryApp.getItems().clear();
			libraryApp.getItems().addAll(readItems);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				ois.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		displayMainMenu(libraryApp);

	}

	/*------------------------------visual break------------------------------*/
	/*------------------------------visual break------------------------------*/
	// option 4 (add customer)
	@SuppressWarnings("unchecked")
	public static void addCustomer(Application libraryApp) {
		//		Scanner scanner = new Scanner(System.in);
		boolean found = true;
		String id = null;
		ObjectInputStream in;
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try {
			in = new ObjectInputStream(new FileInputStream("customers.txt"));
			try {
				customers = (ArrayList<Customer>) in.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			customers = libraryApp.getCustomers();
			// e.printStackTrace();
		} catch (IOException e) {
			customers = libraryApp.getCustomers();
			// e.printStackTrace();
		}

		while (found == true) {
			System.out.println("Enter valid Customer id:");
			id = scanner.next();
			while (id.trim() == "") {
				System.out.println("invalid id");
				System.out.println("Id already exists. Enter valid Customer id:");
				id = scanner.next();
			}

			found = false;

			if (customers != null && customers.size() > 0) {
				for (Customer cus : customers) {
					if (cus.getCustomerID().equalsIgnoreCase(id)) {
						found = true;
						break;
					}
				}
			}
		}

		// if id not found, add to list
		if (found == false) {
			System.out.println("Enter first name:");
			String firstN = scanner.next();
			System.out.println("Enter last name:");
			String lastN = scanner.next();
			System.out.println("Enter address:");
			String address = scanner.next();
			System.out.println("Enter phone number:");
			String phoneN = scanner.next();
			System.out.println("Enter DOT as: (yyyy-mm-dd):");
			String dot = scanner.next();
			System.out.println("Customer is student? (Y/N)");
			String isStudent = scanner.next();
			while (!(isStudent.equalsIgnoreCase("y")) && !(isStudent.equalsIgnoreCase("n"))) {
				System.out.println("Customer is student? (Y/N)");
				isStudent = scanner.next();
			}
			Boolean student = false;
			if (isStudent.equalsIgnoreCase("y")) {
				student = true;
			}

			Customer customer = new Customer(id, firstN, lastN, LocalDate.parse(dot), address, phoneN, student);
			customers.add(customer);
			libraryApp.getCustomers().add(customer);

			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("customers.txt"))) {
				oos.writeObject(customers);
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		displayMainMenu(libraryApp);

	}

	/*------------------------------visual break------------------------------*/
	/*------------------------------visual break------------------------------*/

	// option 5 (update customer)
	@SuppressWarnings("unchecked")
	public static void updateCustomer(Application libraryApp) {
		//		Scanner scanner = new Scanner(System.in);
		boolean found = false;
		String id = "";
		ObjectInputStream in;
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try {
			in = new ObjectInputStream(new FileInputStream("customers.txt"));
			try {
				customers = (ArrayList<Customer>) in.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			customers = libraryApp.getCustomers();
		} catch (IOException e) {
			customers = libraryApp.getCustomers();
			// e.printStackTrace();
		}
		// Check if id exists in Customers array list
		while (found == false) {
			System.out.println("Enter valid customer id to uptade:");
			id = scanner.next();
			while (id.trim() == "") {
				// System.out.println("invalid id");
				System.out.println("Enter valid customer id to update:");
				id = scanner.next();
			}

			if (customers != null && customers.size() > 0) {
				for (Customer cust : customers) {
					if (cust.getCustomerID().equalsIgnoreCase(id)) {
						System.out.println("Enter first name to update:");
						String firstN = scanner.next();
						System.out.println("Enter last name to update:");
						String lastN = scanner.next();
						System.out.println("Enter address to update:");
						String address = scanner.next();
						System.out.println("Enter phone number to update:");
						String phoneN = scanner.next();
						System.out.println("Enter DOT as: (yyyy-mm-dd) to update:");
						String dot = scanner.next();
						System.out.println("Customer is student? (Y/N) to update");
						String isStudent = scanner.next();
						while (!(isStudent.equalsIgnoreCase("y")) && !(isStudent.equalsIgnoreCase("n"))) {
							System.out.println("Customer is student? (Y/N) to update");
							isStudent = scanner.next();
						}
						Boolean student = false;
						if (isStudent.equalsIgnoreCase("y")) {
							student = true;
						}
						cust.setFirstName(firstN);
						cust.setLastName(lastN);
						cust.setAddress(address);
						cust.setPhoneNumber(phoneN);
						cust.setDateOfBirth(LocalDate.parse(dot));
						cust.setStudent(student);
						found = true;
						break;
					}
				}
			}
			displayMainMenu(libraryApp);
		}
		// If item id exists, then update data
		if (found) {
			libraryApp.getCustomers().clear();
			libraryApp.getCustomers().addAll(customers);

			ObjectOutputStream out;
			try {
				out = new ObjectOutputStream(new FileOutputStream("customers.txt"));
				out.writeObject(customers);
				out.close();
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
		displayMainMenu(libraryApp);
	}

	/*------------------------------visual break------------------------------*/
	/*------------------------------visual break------------------------------*/

	// option 6 (delete customer)
	@SuppressWarnings("unchecked")
	public static void deleteCustomer(Application libraryApp) {
		ObjectInputStream in = null;
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try {
			in = new ObjectInputStream(new FileInputStream("customers.txt"));
			try {
				customers = (ArrayList<Customer>) in.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			customers = libraryApp.getCustomers();

		} catch (IOException e) {
			customers = libraryApp.getCustomers();
			// e.printStackTrace();
		}
		boolean found = false;
		String id = "";
		//		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter valid customer id to delete: ");
		id = scanner.next();
		while (id.trim().equalsIgnoreCase("")) {
			System.out.println("invalid id");
			System.out.println("Enter valid customer id to delete: ");
			id = scanner.next();
		}

		if (customers != null && customers.size() > 0) {
			for (Customer cust : customers) {
				if (cust.getCustomerID().equalsIgnoreCase(id)) {
					customers.remove(cust);
					found = true;
					break;
				}
			}
		} else {
			// List contains no elements
			System.out.println("Customers List is empty!");
		}
		if (found) {
			libraryApp.getCustomers().clear();
			libraryApp.getCustomers().addAll(customers);

			ObjectOutputStream out;
			try {
				out = new ObjectOutputStream(new FileOutputStream("customers.txt"));
				out.writeObject(customers);
				out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		displayMainMenu(libraryApp);

	}

	/*------------------------------visual break------------------------------*/
	/*------------------------------visual break------------------------------*/

	// option 7 : New borrow transaction
	@SuppressWarnings("unchecked")
	public static void borrowTrans(Application libraryApp) {

		//		Scanner userInput = new Scanner(System.in);
		ArrayList<Item> readItems = new ArrayList<Item>();
		ArrayList<Transaction> readTrans = new ArrayList<Transaction>();
		ArrayList<Customer> readCustoms = new ArrayList<Customer>();
		LocalDate todayDate = LocalDate.now();
		Random random = new Random();
		int transID = random.nextInt();

		ObjectInputStream ois=null,ois2=null;
		System.out.print("Enter Customer ID :");
		String cust_id = scanner.next();
		System.out.print("Enter item ID you want to borrow : ");
		int item_Id = scanner.nextInt();
//		try {
//			ois1 = new ObjectInputStream(new FileInputStream("Transactions.txt"));
//			readTrans = (ArrayList<Transaction>) ois1.readObject();
//			for(Transaction trans:readTrans) {
//				while(trans.getItem().getID()==item_Id && trans.getCheckInDate()!=null) {
//					System.out.println("Invalid Id:");
//					System.out.print("Enter valid item ID you want to borrow : ");
//					item_Id = scanner.nextInt();
//				}
//			}
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		} finally {
//			try {
//				ois1.close();
//			} catch (Exception e) {
//				System.out.println(e);
//			}
			
		System.out.print("How many days you want to borrow?");
		int due_Days = scanner.nextInt();
		System.out.print("Do you want a Service? Y/N: ");
		String serv = scanner.next();
		try {

			ois = new ObjectInputStream(new FileInputStream("Items.txt"));
			
			ois2 = new ObjectInputStream(new FileInputStream("customers.txt"));
			readItems = (ArrayList<Item>) ois.readObject();
			
			readCustoms = (ArrayList<Customer>) ois2.readObject();

			switch (serv) {
			case "Y":
				System.out.println("What Service Do you want ?");
				System.out.print("1- Printing"+"\n"+"2- Proof Reading");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:

					Service printing = new Service(true, 1.50, false, 0);
					for (Customer custom : readCustoms) {
						if(custom.getCustomerID().equalsIgnoreCase(cust_id)){						
						for (Item item : readItems) {
								if (item.getID() == item_Id )
										{
										;
										Transaction newTrans = new Transaction(Integer.toString(transID),
											custom, item, todayDate, null,printing);
										item.setDueDays(due_Days);	
										libraryApp.getTransactions().add(newTrans);
										double serviceprice = item.getPages() * printing.getPrintingCostPerPage();
										System.out.println(
												"Customer Name: " + custom.getFirstName() + " " + custom.getLastName());
										System.out.println("Item Title:" + item.getTitle());
										System.out.println("Due days :" + item.getDueDays());
										System.out.println(
												"Expected return date :" + todayDate.plusDays(due_Days));
										System.out.println("Price owed :" + item.getPrice());
										System.out.println("Price of additional service: " + serviceprice);

									
								} else {
									System.out.println("Item already borrowed");
								}

							
						}
						}else {
							System.out.println("Customer Doesn't Exist");
						}

				}
					break;
				case 2:
					Service proofRead = new Service(false, 0, true, 3.00);
							
					for (Customer custom : readCustoms) {
						if(custom.getCustomerID().equalsIgnoreCase(cust_id)){						
						for (Item item : readItems) {
								if (item.getID() == item_Id )
										{
										;
										Transaction newTrans = new Transaction(Integer.toString(transID),
											custom, item, todayDate, null,proofRead);
										item.setDueDays(due_Days);	
										libraryApp.getTransactions().add(newTrans);
										double serviceprice = item.getPages() * proofRead.getProofReadingCostPerPage();
										System.out.println(
												"Customer Name: " + custom.getFirstName() + " " + custom.getLastName());
										System.out.println("Item Title:" + item.getTitle());
										System.out.println("Due days :" + item.getDueDays());
										System.out.println(
												"Expected return date :" + todayDate.plusDays(due_Days));
										System.out.println("Price owed :" + item.getPrice());
										System.out.println("Price of additional service: " + serviceprice);

									
								} else {
									System.out.println("Item already borrowed");
								}

							
						}
						}else {
							System.out.println("Customer Doesn't Exist");
						}

				}
				}
				break;
			case "N":
				for (Customer custom : readCustoms) {
					if(custom.getCustomerID().equalsIgnoreCase(cust_id)){
						
					
					for (Item item : readItems) {
							if (item.getID() == item_Id )
									{
									;
									Transaction newTrans = new Transaction(Integer.toString(transID),
										custom, item, todayDate, null);
									item.setDueDays(due_Days);	
									libraryApp.getTransactions().add(newTrans);
									libraryApp.getItems().add(item);
									System.out.println(
											"Customer Name: " + custom.getFirstName() + " " + custom.getLastName());
									System.out.println("Item Title:" + item.getTitle());
									System.out.println("Due days :" + item.getDueDays());
									System.out.println(
											"Expected return date :" +todayDate.plusDays(due_Days));
									System.out.println("Price owed :" + item.getPrice());

								
							} else {
								System.out.println("Item already borrowed");
							}

						
					}
					
					}

			}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		} finally {
			try {
				ois.close();
				ois2.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		displayMainMenu(libraryApp);
	}
	

	/*------------------------------visual break------------------------------*/
	/*------------------------------visual break------------------------------*/

	// option 8: New return transaction

	@SuppressWarnings("unchecked")
	public static void returnTrans(Application libraryApp) {
		LocalDate todayDateTime = LocalDate.now();
		Scanner userInput = new Scanner(System.in);
		ObjectInputStream ois=null ;
		ArrayList<Transaction> readTrans = new ArrayList<Transaction>();
		try {
			ois = new ObjectInputStream(new FileInputStream("Transactions.txt"));
			readTrans = (ArrayList<Transaction>) ois.readObject();
			System.out.println("Enter the Customer ID :");
			String cust_id = userInput.next();
			for (Transaction trans : readTrans) {
				if ((trans.getCustomer().getCustomerID()).equalsIgnoreCase(cust_id)) {
					if (trans.getCheckInDate() == null) {
						System.out.println(trans.getItem().getID());
						System.out.println(trans.getItem().getTitle());
						System.out.println("Enter the Item ID");
						int item_Id = userInput.nextInt();
						if (((trans.getItem().getID()) == item_Id)) {
							trans.setCheckOutDate(null);
							System.out.println(trans.getItem().getTitle());
							System.out.println("Enter Check in Date dd-MM-yyyy:");
							String checkinDate = scanner.next();
							trans.setCheckInDate(LocalDate.parse(checkinDate));
							
							libraryApp.getTransactions().add(trans);
				
						}
					}else{
						System.out.println("No Items to Return");
					}
				}else{
					System.out.println("Customer Didn't make any Transactions");
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				ois.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		displayMainMenu(libraryApp);
	}

	/*------------------------------visual break------------------------------*/
	/*------------------------------visual break------------------------------*/

	// option 9: items not yet returned
	@SuppressWarnings("unchecked")
	public static void itemsNotReturned(Application libraryApp) {
		ObjectInputStream ois = null;
		ArrayList<Transaction> readTransactions = new ArrayList<Transaction>();
		try {
			ois = new ObjectInputStream(new FileInputStream("Transactions.txt"));
			readTransactions = (ArrayList<Transaction>) ois.readObject();
			for (Transaction transaction : readTransactions) {
				if (transaction.getCheckInDate() == null) {
					System.out.println(transaction.getItem().getTitle());
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				ois.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		displayMainMenu(libraryApp);
	}

	/*------------------------------visual break------------------------------*/
	/*------------------------------visual break------------------------------*/

	// option 10: list all publications
	@SuppressWarnings("unchecked")
	public static void listPublications(Application libraryApp) {
		//		Scanner scanner = new Scanner(System.in);
		String authorLN;
		System.out.println("Enter the last name of an Author to get all his publications: ");
		authorLN = scanner.nextLine();
		ObjectInputStream ois = null;
		ArrayList<Item> readItems = new ArrayList<Item>();
		try {
			ois = new ObjectInputStream(new FileInputStream("Items.txt"));
			readItems = (ArrayList<Item>) ois.readObject();
			for (Item item : readItems) {
				if (authorLN.equalsIgnoreCase(item.getAuthor().getLastName())) {
					System.out.println(item.getTitle());
				} else {
					System.out.println("No author with this last name! Try again.");
					listPublications(libraryApp);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				ois.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		displayMainMenu(libraryApp);

	}

	/*------------------------------visual break------------------------------*/
	/*------------------------------visual break------------------------------*/

	// option 11: save and exit
	public static void saveExit(Application libraryApp) {
		// creating several oos objects because not sure if one will work properly
		// files is a PITA enough already
		ObjectOutputStream oos1 = null;
		ObjectOutputStream oos2 = null;
		// ObjectOutputStream oos3 = null;
		ObjectOutputStream oos4 = null;

		try { // saving the arraylists to files with the same names
			oos1 = new ObjectOutputStream(new FileOutputStream("Items.txt"));
			oos1.writeObject(libraryApp.getItems());
			oos2 = new ObjectOutputStream(new FileOutputStream("Authors.txt"));
			oos2.writeObject(libraryApp.getAuthors());
			// oos3 = new ObjectOutputStream(new FileOutputStream("customers.txt"));
			// oos3.writeObject(libraryApp.getCustomers());
			oos4 = new ObjectOutputStream(new FileOutputStream("Transactions.txt"));
			oos4.writeObject(libraryApp.getTransactions());
			//			scanner.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("All data saved successfully!");
			System.out.println("Exiting...");

		}
		try {
			oos1.close();
			oos2.close();
			oos4.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.exit(0);

		}
	}
}
