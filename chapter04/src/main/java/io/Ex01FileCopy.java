package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01FileCopy {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("맹구.jpg");
			os = new FileOutputStream("맹구copy.jpg");

			int data = -1; // data를 다 읽을면 -1로 표시하기로 약속!

			while ((data = is.read()) != -1) {
				os.write(data);
			}

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("error: " + e);
		} finally {
			try {
				if (is != null) {  // nullpointexception 에러 처리
					is.close();
				}
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
