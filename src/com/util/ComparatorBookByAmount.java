package com.util;

import java.util.Comparator;

import com.bean.Book;
/*
 * 优先BookAmount 其次BookId
 */
public class ComparatorBookByAmount implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		int flag = -1;
		if (b1.getBookAmount() > b2.getBookAmount()) {
			flag = 1;
		}else if(b1.getBookAmount() == b2.getBookAmount()) {
			flag = -1;
			if (b1.getBookId() > b2.getBookId()) {
				flag = 1;
			} 
		}
		return flag;
	}
}
