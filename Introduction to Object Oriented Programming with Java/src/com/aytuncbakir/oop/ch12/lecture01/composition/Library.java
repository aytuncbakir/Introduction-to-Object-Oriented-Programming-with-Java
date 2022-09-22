package com.aytuncbakir.oop.ch12.lecture01.composition;

import java.util.List;

public class Library {
	
	// Reference to refer to list of books.
    private final List<Book> books;
 
    // Constructor of this class
    public Library(List<Book> books)
    {
        // This keyword refers to current instance itself
        this.books = books;
    }
 
    // Method of this class
    // Getting the list of books
    public List<Book> getListOfBooksInLibrary()
    {
        return books;
    }

}
