package com.util;

import java.util.Comparator;

import com.bean.Book;

/*
 * 优先BookName 其次BookId
 */
public class ComparatorBookByName implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		int flag = b1.getBookName().compareTo(b2.getBookName());

		if (flag == 0) {
			flag = -1;
			if (b1.getBookId() > b2.getBookId()) {
				flag = 1;
			}

		}
		return flag;
	}
}
