package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {
// CheckedException 확인
	
	public static void main(String[] args) {
		FileInputStream fis = null; // 지역변수 밖으로 뺄 때 초기값 null로 주기

		try {
			fis = new FileInputStream("hello1.txt");
			int data = fis.read();
			System.out.println((char) data);
			
		} catch (FileNotFoundException e) {
			System.out.println("error: " + e);
		} catch (IOException e) {
			System.out.println("error: " + e);
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
