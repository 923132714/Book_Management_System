/**
 * 可序列化图书 bean类
 * 包含图书信息：
 * 图书编号 @param bookId
 * 图书名称 @param  bookName
 * 图书价格 @param bookPrice
 * 图书数量 @param bookAmount
 * 图书价格 @param bookBrief
 * 
 * @author logic
 */
package com.bean;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 7679161791075683794L;
/**
 * 构造方法
 * @param bookId
 * @param bookName
 * @param bookPrice
 * @param bookAmount
 * @param bookBrief
 */
	public Book(long bookId, String bookName, Double bookPrice, int bookAmount,
			String bookBrief) {

		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookAmount = bookAmount;
		this.bookBrief = bookBrief;
	}

	private long bookId;// 图书编号
	private String bookName;// 图书名称
	private double bookPrice;// 图书价格
	private int bookAmount;// 图书数量
	private String bookBrief;// 图书价格

	public long getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookAmount() {
		return bookAmount;
	}

	public boolean setBookAmount(int bookAmount) {
		if (bookAmount >= 0) {

			this.bookAmount = bookAmount;
			return true;
		} else
			return false;
	}

	public String getBookBrief() {
		return bookBrief;
	}

	public void setBookBrief(String bookBrief) {
		this.bookBrief = bookBrief;
	}

	public boolean changeBookAmount(int change) {
		if (change + bookAmount >= 0) {
			bookAmount += change;
			return true;
		}
		return false;
	}

}
