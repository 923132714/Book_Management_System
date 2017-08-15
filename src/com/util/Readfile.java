package com.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.LinkedList;

public class Readfile<T> {
	private LinkedList<T> linkedList;

	public LinkedList<T> readLinkedList(String filePath) {
		File file = new File(filePath);
		if (!file.exists())
			return null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath));
			linkedList = (LinkedList<T>) in.readObject();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return linkedList;
	}

	public String readfile(String filePath) {
		File file = new File(filePath);
		if (!file.exists())
			return null;
		StringBuilder stringBuilder = new StringBuilder();
		String info = null;
		try {
			InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			while ((info = bufferedReader.readLine()) != null) {
				stringBuilder.append(info);
			}
			info = stringBuilder.toString();
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return info;
	}
}
