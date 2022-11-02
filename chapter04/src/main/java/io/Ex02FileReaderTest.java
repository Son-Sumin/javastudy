package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Ex02FileReaderTest {

	public static void main(String[] args) {
		Reader in = null;
		InputStream is = null;
		
		System.out.println("===========char===========");

		try {
			in = new FileReader("1234.txt");

			int count = 0;
			int data = -1;  // data를 다 읽을면 -1로 표시하기로 약속!
			while ((data = in.read()) != -1) {
				System.out.print((char) data);
				count++;
			}

			System.out.println("");
			System.out.println("count: " + count);
			System.out.println("===========byte===========");

			count = 0;
			is = new FileInputStream("1234.txt");
			while ((data = is.read()) != -1) {
				System.out.print((char)data);  // (char) 붙이면 UTF-8로 표현됨
				count++;
			}
			System.out.println("");
			System.out.println("count: " + count);

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("error: " + e);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}