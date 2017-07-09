package com.bean;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author logic
 *
 */
public class BookShelf {
	private LinkedList<Book> shelf = new LinkedList<Book>();
	private int differentBookNumber = 0;

	/*
	 * 通过调用getBook()
	 */
	public boolean addBook(Book book) {
		boolean flag = false;
		if (getBook(book.getBookId()) == null)// 检查是否存在相同编号图书，存在则不添加
			if (shelf.add(book)) {
				differentBookNumber++;
				flag = true;
			}
		return flag;
	}

	/*
	 * 通过调用addBook(Book book)实现
	 */
	public int addBook(Book[] books) {
		int successNum = 0;
		for (Book book : books) {
			if (addBook(book)) {
				successNum++;
			}

		}
		return successNum;
	}

	public boolean removeBook(long bookId) {
		boolean flag = false;

		Book book = getBook(bookId);
		if (book != null) {
			shelf.remove(book);
			flag = true;
		}
		return flag;
	}

	private Book getBook(long bookId) {

		Iterator<Book> iterator = shelf.iterator();
		Book book = null;
		while (iterator.hasNext()) {
			if (iterator.next().getBookId() == bookId) {
				book = (Book) iterator;
				break;
			}
		}
		return book;

	}
}
