package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhoneList01 {
// IO와 tokendiser 이용하기
// if문으로 에러처리할 수 있는데 exception 이용하는 것은 효율적이지 못하다
// exception은 예측 못할 에러처리하는데 사용하기, exception은 내 코드의 모든 객체가 다 들어 있어 메모리를 많이 차지한다

	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			// IO가 아니라 순수하게 파일 정보를 알아내가
			File file = new File("phone.txt");

			if (file.exists()) {
				System.out.println("file not found");
				return;
			}

			System.out.println("=============파일정보==============");
			System.out.println(file.getAbsolutePath()); // c부터 전체 path
			System.out.println(file.length() + "bytes");
			// System.out.println(new Date(file.lastModified())); // 년월일 각각 뽑아낼 때 date 비추
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new
			// Date(file.lastModified()));
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));

			System.out.println("=============전화번호==============");

			// 1. 기반 스트림
			FileInputStream fs = new FileInputStream(file);

			// 2. 보조 스트림1
			InputStreamReader isr = new InputStreamReader(fs, "utf-8");

			// 3. 보조 스트림2
			br = new BufferedReader(isr);
			
			// 4. 처리
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException ex) {
			System.out.println("Error:" + ex);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
