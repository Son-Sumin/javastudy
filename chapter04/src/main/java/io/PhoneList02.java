package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {
// scanner 사용하기

	public static void main(String[] args) throws FileNotFoundException { // java main program이 내가 만든 에러 받기, 회피
		BufferedReader br = null;

		try {
			File file = new File("phone.txt");

			if (!file.exists()) {
				System.out.println("file not found");
				return;
			}

			System.out.println("=============파일정보==============");
			System.out.println(file.getAbsolutePath()); // c부터 전체 path
			System.out.println(file.length() + "bytes");
			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));

			System.out.println("=============전화번호==============");
			
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {  // line
				String name = scanner.next();
				String phone01 = scanner.next();
				String phone02 = scanner.next();
				String phone03 = scanner.next();
				
				System.out.println(name + ":" + phone01 + "-" + phone02 + "-" + phone03);
			}
		scanner.close();
	}

}
