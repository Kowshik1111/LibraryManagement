package kowshik.library;

public class ReportGenerator {
    public void generateBookAvailabilityReport(List<Book> books) {
        System.out.println("Book Availability Report:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " - Available: " + book.isAvailable());
        }
    }

    public void generateBorrowingHistoryReport(List<Patron> patrons) {
        System.out.println("Borrowing History Report:");
        for (Patron patron : patrons) {
            System.out.println(patron.getName() + "'s Borrowing History:");
            for (Book book : patron.getBorrowingHistory()) {
                System.out.println("- " + book.getTitle());
            }
        }
    }

    public void generateFineReport(List<Book> books) {
        System.out.println("Fine Report:");
        for (Book book : books) {
            double fine = new FineCalculator().calculateFine(book);
            System.out.println(book.getTitle() + " - Fine: $" + fine);
        }
    }
}
