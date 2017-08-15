package com.bean;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

import com.util.ComparatorBookByAmount;
import com.util.ComparatorBookById;
import com.util.ComparatorBookByName;
import com.util.ReadFile;
import com.util.WriteFile;

/**
 * @author logic
 *
 */
public class BookShelf {
	private LinkedList<Book> shelf = new LinkedList<Book>();
	private int differentBookNumber = 0;

	/**
	 * 向shelf中添加book
	 * @param book
	 * 返回是否成功
	 * @return
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

	/**
	 * 向shelf中添加books
	 * @param books
	 * 中的全部书籍
	 * 返回添加失败的数量
	 * @return
	 * 
	 * 重复调用addBook(Book)
	 */
	public int addBook(LinkedList<Book> books) {
		Iterator<Book> iterator =books.iterator();
		int falseNumber=0;
		while (iterator.hasNext()) {
			if(addBook(iterator.next()))
				differentBookNumber++;
			else {
				falseNumber++;
			}
			}
		return falseNumber;
		}
		
	

	/**
	 * 通过bookId
	 * @param bookId
	 * 找到并返回shelf中相应的的book对象
	 * @return
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

	/**
	 * 通过bookName
	 * @param bookName
	 * 找到并返回shelf中相应的的book对象
	 * @return
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
	/**
	 * 通过bookId
	 * @param bookId
	 * 将shelf中指定book的BookPrice修改为newBookPrice
	 * @param newBookPrice
	 * BookAmount修改为newBookAmount
	 * @param newBookAmount
	 * 并返回是否成功
	 * @return
	 */
	public boolean modifyBook(long bookId, double newBookPrice, int newBookAmount) {
		boolean flag = false;
		Book book = getBook(bookId);
		if (book != null) {// 验证原书存在不存在
			book.setBookAmount(newBookAmount);
			book.setBookPrice(newBookPrice);

			flag = true;
		}
		return flag;
	}
	/**
	 * 通过bookId
	 * @param bookId
	 * 将shelf中指定book的BookPrice修改为newBookPrice
	 * @param newBookPrice
	 * BookAmount修改为newBookAmount
	 * @param newBookAmount
	 * BookBrief修改为newBookBrief
	 * @param newBookBrief
	 * 并返回是否成功
	 * @return
	 */
	public boolean modifyBook(long bookId, double newBookPrice, int newBookAmount, String newBookBrief) {
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
	/**
	 * 通过bookName
	 * @param bookName
	 * 将shelf中指定book的BookPrice修改为newBookPrice
	 * @param newBookPrice
	 * BookAmount修改为newBookAmount
	 * @param newBookAmount
	 * 并返回是否成功
	 * @return
	 */
	public boolean modifyBook(String bookName, double newBookPrice, int newBookAmount) {
		boolean flag = false;
		Book book = getBook(bookName);
		if (book != null) {// 验证原书存在不存在
			book.setBookAmount(newBookAmount);
			book.setBookPrice(newBookPrice);

			flag = true;
		}
		return flag;
	}
	/**
	 * 通过bookName
	 * @param bookName
	 * 将shelf中指定book的BookPrice修改为newBookPrice
	 * @param newBookPrice
	 * BookAmount修改为newBookAmount
	 * @param newBookAmount
	 * BookBrief修改为newBookBrief
	 * @param newBookBrief
	 * 并返回是否成功
	 * @return
	 */
	public boolean modifyBook(String bookName, double newBookPrice, int newBookAmount, String newBookBrief) {
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
	/**
	 * 通过bookId
	 * @param bookId
	 * 将shelf中指定book的BookAmount修改为newBookAmount
	 * @param newBookAmount
	 * 并返回是否成功
	 * @return
	 */
	public boolean modifyBookAmount(long bookId, int newBookAmount) {
		boolean flag = false;
		Book book = getBook(bookId);
		if (book != null) {// 验证原书存在不存在
			book.setBookAmount(newBookAmount);

			flag = true;
		}
		return flag;
	}
	/**
	 * 通过bookName
	 * @param bookName
	 * 将shelf中指定book的BookAmount修改为newBookAmount
	 * @param newBookAmount
	 * 并返回是否成功
	 * @return
	 */
	public boolean modifyBookAmount(String bookName, int newBookAmount) {
		boolean flag = false;
		Book book = getBook(bookName);
		if (book != null) {// 验证原书存在不存在
			book.setBookAmount(newBookAmount);

			flag = true;
		}
		return flag;
	}
	/**
	 * 通过bookId
	 * @param bookId
	 * 将shelf中指定book的BookBrief修改为newBookBrief
	 * @param newBookBrief
	 * 并返回是否成功
	 * @return
	 */
	public boolean modifyBookBookBrief(long bookId, String newBookBrief) {
		boolean flag = false;
		Book book = getBook(bookId);
		if (book != null) {// 验证原书存在不存在

			book.setBookBrief(newBookBrief);
			flag = true;
		}
		return flag;
	}
	/**
	 * 通过bookName
	 * @param bookName
	 * 将shelf中指定book的BookBrief修改为newBookBrief
	 * @param newBookBrief
	 * 并返回是否成功
	 * @return
	 */
	public boolean modifyBookBookBrief(String bookName, String newBookBrief) {
		boolean flag = false;
		Book book = getBook(bookName);
		if (book != null) {// 验证原书存在不存在

			book.setBookBrief(newBookBrief);
			flag = true;
		}
		return flag;
	}
	/**
	 * 通过bookId
	 * @param bookId
	 * 将shelf中指定book的BookPrice修改为newBookPrice
	 * @param newBookPrice
	 * 并返回是否成功
	 * @return
	 */
	public boolean modifyBookPrice(long bookId, double newBookPrice) {
		boolean flag = false;
		Book book = getBook(bookId);
		if (book != null) {// 验证原书存在不存在

			book.setBookPrice(newBookPrice);

			flag = true;
		}
		return flag;
	}

	/**
	 * 通过bookName
	 * @param bookName
	 * 将shelf中指定book的BookPrice修改为newBookPrice
	 * @param newBookPrice
	 * 并返回是否成功
	 * @return
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

	/**
	 * 通过bookId
	 * @param bookId
	 * 从shelf中删除Book
	 * 并返回是否成功
	 * @return
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


	/**
	 * 通过bookName
	 * @param bookName
	 * 从shelf中删除Book
	 * 并返回是否成功
	 * @return
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
	public void sortByBookId() {
		Comparator<Book> cmp = new ComparatorBookById();

		Collections.sort(shelf, cmp);
	}

	public void sortByBookName() {
		Comparator<Book> cmp = new ComparatorBookByName();

		Collections.sort(shelf, cmp);
	}
	
	public void sortByBookAmount() {
		Comparator<Book> cmp = new ComparatorBookByAmount();

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
	public boolean writeShelf(String path){
		boolean flag =true;
		try {
			new WriteFile<Book>(path,shelf);
		} catch (NoSuchFieldException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			 flag =false;
		}
		
		return flag;
	}
	public boolean readShelf(String path){
		boolean flag =true;
		
			ReadFile<Book> reader = new ReadFile<Book>();
			shelf=reader.readLinkedList(path);
		
		
		return flag;
	}
}
