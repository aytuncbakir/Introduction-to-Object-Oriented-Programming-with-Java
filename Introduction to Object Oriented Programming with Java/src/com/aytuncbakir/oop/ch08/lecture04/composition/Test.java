package com.aytuncbakir.oop.ch08.lecture04.composition;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// Creating objects of Book class inside main()
		// method Custom inputs
		Book book1 = new Book("EffectiveJ Java", "Joshua Bloch");
		Book book2 = new Book("Thinking in Java", "Bruce Eckel");
		Book book3 = new Book("Java: The Complete Reference", "Herbert Schildt");

		// Creating the list which contains number of books
		List<Book> books = new ArrayList<Book>();

		// Adding books
		// using add() method
		books.add(book1);
		books.add(book2);
		books.add(book3);

		Library library = new Library(books);

		// Calling method to get total books in library
		// and storing it in list of user0defined type -
		// Books
		List<Book> bks = library.getTotalBooksInLibrary();

		// Iterating over books using for each loop
		for (Book bk : bks) {

			// Printing the title and author name of book on
			// console
			System.out.println(" Author : " + bk.author + "Book : " + bk.title);
		}
	}

}
