package com.bean;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

import com.util.ComparatorBook;

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

	/*
	 * 通过图书编号获取Book对象
	 */
	public Book getBook(long bookId) {

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

	/*
	 * 通过图书名称获取Book对象
	 */
	public Book getBook(String bookName) {

		boolean flag = false;
		Iterator<Book> iterator = shelf.iterator();
		Book book = null;
		while (iterator.hasNext()) {

			if ((book = iterator.next()).getBookName() == bookName) {
				flag = true;
				break;
			}

		}
		if (flag)
			return book;
		return null;

	}

	/*
	 * 获取书架上的book个数
	 */
	public int getDifferentBookNumber() {
		return differentBookNumber;
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

	public boolean modifyBook(String bookName, double newBookPrice,
			int newBookAmount) {
		boolean flag = false;
		Book book = getBook(bookName);
		if (book != null) {// 验证原书存在不存在
			book.setBookAmount(newBookAmount);
			book.setBookPrice(newBookPrice);

			flag = true;
		}
		return flag;
	}

	public boolean modifyBook(String bookName, double newBookPrice,
			int newBookAmount, String newBookBrief) {
		boolean flag = false;
		Book book = getBook(bookName);
		if (book != null) {// 验证原书存在不存在
			book.setBookAmount(newBookAmount);
			book.setBookPrice(newBookPrice);
			book.setBookBrief(newBookBrief);
			flag = true;
		}
		return flag;
	}

	public boolean modifyBookAmount(long bookId, int newBookAmount) {
		boolean flag = false;
		Book book = getBook(bookId);
		if (book != null) {// 验证原书存在不存在
			book.setBookAmount(newBookAmount);

			flag = true;
		}
		return flag;
	}

	public boolean modifyBookAmount(String bookName, int newBookAmount) {
		boolean flag = false;
		Book book = getBook(bookName);
		if (book != null) {// 验证原书存在不存在
			book.setBookAmount(newBookAmount);

			flag = true;
		}
		return flag;
	}

	public boolean modifyBookBookBrief(long bookId, String newBookBrief) {
		boolean flag = false;
		Book book = getBook(bookId);
		if (book != null) {// 验证原书存在不存在

			book.setBookBrief(newBookBrief);
			flag = true;
		}
		return flag;
	}

	public boolean modifyBookBookBrief(String bookName, String newBookBrief) {
		boolean flag = false;
		Book book = getBook(bookName);
		if (book != null) {// 验证原书存在不存在

			book.setBookBrief(newBookBrief);
			flag = true;
		}
		return flag;
	}

	public boolean modifyBookPrice(long bookId, double newBookPrice) {
		boolean flag = false;
		Book book = getBook(bookId);
		if (book != null) {// 验证原书存在不存在

			book.setBookPrice(newBookPrice);

			flag = true;
		}
		return flag;
	}

	/*
	 * 修改book信息
	 */
	public boolean modifyBookPrice(String bookName, double newBookPrice) {
		boolean flag = false;
		Book book = getBook(bookName);
		if (book != null) {// 验证原书存在不存在

			book.setBookPrice(newBookPrice);

			flag = true;
		}
		return flag;
	}

	/*
	 * 删除shelf中图书编号为bookId的book
	 */
	public boolean removeBook(long bookId) {
		boolean flag = false;

		Book book = getBook(bookId);
		if (book != null) {
			shelf.remove(book);
			flag = true;
		}
		return flag;
	}

	/*
	 * 删除shelf中图书名称为bookName的book
	 */
	public boolean removeBook(String bookName) {
		boolean flag = false;

		Book book = getBook(bookName);
		if (book != null) {
			shelf.remove(book);
			flag = true;
		}
		return flag;
	}
	/*
	 * 排序
	 */
	public void sortByBook() {
		Comparator<Book> cmp = new ComparatorBook();

		Collections.sort(shelf, cmp);

	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Iterator<Book> iterator = shelf.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			
			stringBuilder.append(book);
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();

	}
}
