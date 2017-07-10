package com.test;

import com.bean.Book;
import com.bean.BookShelf;

public class Test {

	public static void main(String[] args) {
		Book book1 = new Book(0l, "hello", 100d, 100, "hha");
		Book book2 = new Book(1l, "a", 10d, 100, "hha");
		Book book3 = new Book(2l, "so", 15d, 10, "hha");
		Book book4 = new Book(0l, "hel", 100d, 100, "hha");
		Book book5 = new Book(7l, "a", 10d, 100, "hha");
		Book book6 = new Book(9l, "so", 15d, 10, "hha");
		Book book7 = new Book(8l, "hel", 100d, 100, "hha");
		BookShelf shelf = new BookShelf();
		System.out.println(shelf.addBook(book1));
		System.out.println(shelf.addBook(book2));
		System.out.println(shelf.addBook(book3));
		System.out.println(shelf.addBook(book4));
		shelf.addBook(book5);
		shelf.addBook(book6);
		shelf.addBook(book7);
		System.out.println(shelf.toString());	
		System.out.println(shelf.removeBook(0l));
		System.out.println("=============");
		System.out.println(shelf.toString());
		shelf.sortByBook();
		shelf.removeBook("so");
		shelf.modifyBookPrice(1, 439.4);
		System.out.println("=============");
		System.out.println(shelf.toString());
	}

}
