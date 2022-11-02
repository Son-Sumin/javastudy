package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex04BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;

		// 기반 스트림
		// linux에서는 /(표준), window에서는 \를 /으로 만들어줌, 드라이브 붙이지 말기
		try {
			FileReader fr = new FileReader("./src/main/java/io/BufferedReaderTest.java");

			// 보조 스트림
			br = new BufferedReader(fr);

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Can Not Open: " + e);
		} catch (IOException e) {
			System.out.println("Can Not Open: " + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
