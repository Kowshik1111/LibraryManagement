package kowshik.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementApp {
    public static void main(String[] args) {
        // Initialization
        List<Book> books = new ArrayList<>();
        List<Patron> patrons = new ArrayList<>();
        BorrowingSystem borrowingSystem = new BorrowingSystem();
        LibrarySearch librarySearch = new LibrarySearch();
        ReportGenerator reportGenerator = new ReportGenerator();

        // Sample data (you can replace it with database integration)
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction"));
        patrons.add(new Patron("Alice Johnson", "123-456-7890"));

        // Menu Loop
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Library Management System");
            System.out.println("1. Borrow a Book");
            System.out.println("2. Return a Book");
            System.out.println("3. Search Books");
            System.out.println("4. Search Patrons");
            System.out.println("5. Generate Reports");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Borrow a Book
                    System.out.println("Enter patron name: ");
                    String patronName = scanner.next();
                    System.out.println("Enter book title: ");
                    String bookTitle = scanner.next();
                    
                    // Find patron and book objects from the lists (you need to implement this logic)
                    Patron borrowingPatron = /* Logic to find the patron */;
                    Book borrowedBook = /* Logic to find the book */;
                    
                    borrowingSystem.borrowBook(borrowingPatron, borrowedBook);
                    break;
                    
                case 2:
                    // Return a Book
                    System.out.println("Enter patron name: ");
                    patronName = scanner.next();
                    System.out.println("Enter book title: ");
                    bookTitle = scanner.next();
                    
                    // Find patron and book objects from the lists (you need to implement this logic)
                    Patron returningPatron = /* Logic to find the patron */;
                    Book returnedBook = /* Logic to find the book */;
                    
                    borrowingSystem.returnBook(returningPatron, returnedBook);
                    break;
                    
                case 3:
                    // Search Books
                    System.out.println("Enter search keyword: ");
                    String searchKeyword = scanner.next();
                    List<Book> searchResultsBooks = librarySearch.searchBooks(books, searchKeyword);
                    // Display search results (you need to implement this logic)
                    break;
                    
                case 4:
                    // Search Patrons
                    System.out.println("Enter search keyword: ");
                    searchKeyword = scanner.next();
                    List<Patron> searchResultsPatrons = librarySearch.searchPatrons(patrons, searchKeyword);
                    // Display search results (you need to implement this logic)
                    break;
                    
                case 5:
                    // Generate Reports
                    reportGenerator.generateBookAvailabilityReport(books);
                    reportGenerator.generateBorrowingHistoryReport(patrons);
                    reportGenerator.generateFineReport(books);
                    break;
                    
                case 0:
                    System.out.println("Exiting the Library Management System.");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 0);

        // Close resources
        scanner.close();
    }
}
