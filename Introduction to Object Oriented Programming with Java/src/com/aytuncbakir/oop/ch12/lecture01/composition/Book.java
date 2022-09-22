package com.aytuncbakir.oop.ch12.lecture01.composition;

public class Book {

	// Member variables of this class
    public String title;
    public String author;
 
    // Constructor of this class
    Book(String title, String author)
    {
 
        // This keyword refers top current instance
        this.title = title;
        this.author = author;
    }
}
