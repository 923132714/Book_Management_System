package com.util;

import java.util.Comparator;

import com.bean.Book;

/*
 * 优先图书编号排序其次图书名称
 */
public class ComparatorBookById implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		int flag = -1;
		if (b1.getBookId() > b2.getBookId()) {
			flag = 1;
		} 
		return flag;
	}

}
