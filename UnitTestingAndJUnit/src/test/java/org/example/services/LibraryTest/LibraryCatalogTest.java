package org.example.services.LibraryTest;

import org.example.services.Library.Book;
import org.example.services.Library.LibraryCatalog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryCatalogTest {

    @Test
    public void addBookTest() {
        Book book = new Book("Title 1", "Author 1");
        LibraryCatalog libraryCatalogObj = new LibraryCatalog();
        libraryCatalogObj.addBook(book);
        Assertions.assertEquals(1, libraryCatalogObj.getBooks().size());
    }

    @Test
    public void getBooksTest() {
        LibraryCatalog libraryCatalogObj = new LibraryCatalog();
        Book book1 = new Book("Human Anatomy", "Dr. Ashvini Kumar Dwivedi");
        Book book2 = new Book("Monsoon", "Abhay K");
        libraryCatalogObj.addBook(book1);
        libraryCatalogObj.addBook(book2);
        Assertions.assertEquals(2, libraryCatalogObj.getBooks().size());
        Assertions.assertTrue(libraryCatalogObj.getBooks().contains(book1));
        Assertions.assertTrue(libraryCatalogObj.getBooks().contains(book2));
    }

    @Test
    public void borrowBookTest() {
        LibraryCatalog libraryCatalogObj = new LibraryCatalog();
        Book book = new Book("The Golden Years", "Ruskin Bond");
        libraryCatalogObj.addBook(book);
        Assertions.assertTrue(book.isAvailable());
        libraryCatalogObj.borrowBook("The Golden Years");
        Assertions.assertFalse(book.isAvailable());
    }

    @Test
    public void returnBookTest() {
        LibraryCatalog libraryCatalogObj = new LibraryCatalog();
        Book book = new Book("The Golden Years", "Ruskin Bond");
        libraryCatalogObj.addBook(book);
        book.setAvailable(false);
        Assertions.assertFalse(book.isAvailable());
        libraryCatalogObj.returnBook("The Golden Years");
        Assertions.assertTrue(book.isAvailable());
    }
}
