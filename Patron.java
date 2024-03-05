package kowshik.library;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String contactInfo;
    private List<Book> borrowingHistory;

    public Patron(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.borrowingHistory = new ArrayList<>();
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Book> getBorrowingHistory() {
        return borrowingHistory;
    }

    public void setBorrowingHistory(List<Book> borrowingHistory) {
        this.borrowingHistory = borrowingHistory;
    }
}
