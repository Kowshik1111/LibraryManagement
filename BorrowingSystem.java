package kowshik.library;

public class BorrowingSystem {
    public void borrowBook(Patron patron, Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            patron.getBorrowingHistory().add(book);
            System.out.println(patron.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available for borrowing.");
        }
    }

    public void returnBook(Patron patron, Book book) {
        if (patron.getBorrowingHistory().contains(book)) {
            book.setAvailable(true);
            patron.getBorrowingHistory().remove(book);
            System.out.println(patron.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Error: This book was not borrowed by " + patron.getName());
        }
    }
}
