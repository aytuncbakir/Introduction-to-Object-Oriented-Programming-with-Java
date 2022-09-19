package com.aytuncbakir.oop.ch08.lecture04.composition;

//Book
public class Book {

// Attributes of book
	public String title;
	public String author;

// Constructor of Book class
	public Book(String title, String author) {

		// This keyword refers to current instance itself
		this.title = title;
		this.author = author;
	}
}
