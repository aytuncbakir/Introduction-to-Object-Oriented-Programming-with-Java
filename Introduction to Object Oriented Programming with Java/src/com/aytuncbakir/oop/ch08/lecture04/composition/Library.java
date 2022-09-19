package com.aytuncbakir.oop.ch08.lecture04.composition;

import java.util.List;

//Class 2
class Library {

	// Reference to refer to list of books
	private final List<Book> books;

	// Library class contains list of books
	Library(List<Book> books) {

		// Referring to same book as
		// this keyword refers to same instance itself
		this.books = books;
	}

	// Method
	// To get total number of books in library
	public List<Book> getTotalBooksInLibrary() {

		return books;
	}
}
