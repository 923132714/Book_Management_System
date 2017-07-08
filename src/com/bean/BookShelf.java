package com.bean;

import java.util.Iterator;
import java.util.LinkedList;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.util.Book;

/**
 * @author logic
 *
 */
public class BookShelf {
	private LinkedList<Book> shelf = new LinkedList<Book>();
	private int differentBookNumber = 0;

	public boolean addBook(Book book) {
		boolean flag = false;
		if (shelf.add(book)) {
			differentBookNumber++;
			flag = true;
		}
		return flag;
	}

	public int addBook(Book[] books) {
		int successNum = 0;
		for (Book book : books) {
			if (shelf.add(book)) {
				successNum++;
				differentBookNumber++;
			}
		}
		return successNum;
	}

	public boolean removeBook(int bookId) {
		boolean flag = false;

		Iterator<Book> iterator = shelf.iterator();

		while (iterator.hasNext()) {
			if (iterator.next().getBookId() == bookId) {
				iterator.remove();
				differentBookNumber--;
				flag = true;
			}
			return flag;
		}

	}
}
