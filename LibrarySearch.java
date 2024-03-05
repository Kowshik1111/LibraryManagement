package kowshik.library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibrarySearch {
    public List<Book> searchBooks(List<Book> books, String keyword) {
        return books.stream()
                .filter(book -> book.getTitle().contains(keyword) || book.getAuthor().contains(keyword))
                .collect(Collectors.toList());
    }

    public List<Patron> searchPatrons(List<Patron> patrons, String keyword) {
        return patrons.stream()
                .filter(patron -> patron.getName().contains(keyword) || patron.getContactInfo().contains(keyword))
                .collect(Collectors.toList());
    }
}
