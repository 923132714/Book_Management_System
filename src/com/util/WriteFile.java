package com.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;



public class WriteFile<T> {


	public WriteFile(String filePath, LinkedList<T> linkedList)throws NoSuchFieldException {
		File file = new File(filePath);
		try {
			if (!file.exists())
				if (!file.createNewFile())
					throw new NoSuchFieldException();	

			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream(filePath));
			out.writeObject(linkedList);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public WriteFile(String filePath, String message ,boolean flag)throws NoSuchFieldException {

		File file = new File(filePath);
		OutputStreamWriter outputStreamWriter;
		try {
			if (!file.exists())
				if (!file.createNewFile())
					throw new NoSuchFieldException();	
			outputStreamWriter = new OutputStreamWriter(new FileOutputStream(filePath,flag), "utf-8");
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		if(flag)
			bufferedWriter.append(message);
		else
			bufferedWriter.write(message);
		bufferedWriter.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


}
