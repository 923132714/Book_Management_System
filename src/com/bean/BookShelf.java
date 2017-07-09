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

	private Book getBook(long bookId) {

		boolean flag = false;
		Iterator<Book> iterator = shelf.iterator();
		Book book = null;
		while (iterator.hasNext()) {

			if ((book = iterator.next()).getBookId() == bookId) {
				flag = true;
				break;
			}

		}
		if (flag)
			return book;
		return null;

	}

	public int getDifferentBookNumber() {
		return differentBookNumber;
	}

	public boolean modifyBook(long bookId, double newBookPrice) {
		boolean flag = false;
		Book book = getBook(bookId);
		if (book != null) {// 验证原书存在不存在

			book.setBookPrice(newBookPrice);

			flag = true;
		}
		return flag;
	}

	public boolean modifyBook(long bookId, double newBookPrice,
			int newBookAmount) {
		boolean flag = false;
		Book book = getBook(bookId);
		if (book != null) {// 验证原书存在不存在
			book.setBookAmount(newBookAmount);
			book.setBookPrice(newBookPrice);

			flag = true;
		}
		return flag;
	}

	public boolean modifyBook(long bookId, double newBookPrice,
			int newBookAmount, String newBookBrief) {
		boolean flag = false;
		Book book = getBook(bookId);
		if (book != null) {// 验证原书存在不存在
			book.setBookAmount(newBookAmount);
			book.setBookPrice(newBookPrice);
			book.setBookBrief(newBookBrief);
			flag = true;
		}
		return flag;
	}

	public boolean modifyBook(long bookId, int newBookAmount) {
		boolean flag = false;
		Book book = getBook(bookId);
		if (book != null) {// 验证原书存在不存在
			book.setBookAmount(newBookAmount);

			flag = true;
		}
		return flag;
	}

	public boolean modifyBook(long bookId, String newBookBrief) {
		boolean flag = false;
		Book book = getBook(bookId);
		if (book != null) {// 验证原书存在不存在

			book.setBookBrief(newBookBrief);
			flag = true;
		}
		return flag;
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
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Iterator iterator = shelf.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			
			stringBuilder.append(book);
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}
}
