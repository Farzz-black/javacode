package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("text.txt");
		try {
			FileReader fr = new FileReader(file);
			System.out.println("yes success");

		} catch (FileNotFoundException e) {
			System.out.println("file not found : "+ file.toString());
		}

	}
}
