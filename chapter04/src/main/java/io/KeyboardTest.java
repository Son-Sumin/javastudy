package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 1. 기반 스트림(표준입력, stdin, System.in), 자바 기본 제공함
			
			// 2. 보조 스트림1 (byte|byte|byte -> char  /  char보다 charset이 좋다, encoding 부여해야함)
			InputStreamReader isr = new InputStreamReader(System.in, "utf-8");
			
			// 3. 보조 스트림2 (char1|char2|char3|\n -> "char1char2char3")
			br = new BufferedReader(isr);
			
			String line = null;
			try {
				while((line = br.readLine()) != null) {
					if("quit".equals(line)) {
						break;
					}
				} 
			}
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error:" + e);
		} catch (IOException e) {
			System.out.println("Error:" + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception e) {
				System.out.println();
			}
		}
		
		
		}
	}
