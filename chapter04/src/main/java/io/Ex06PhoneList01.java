package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class Ex06PhoneList01 {
// IO와 tokenizer 이용하기
// tokenizer와 split의 차이로는, split은 단일 구분자, tokenizer는 다중 구분자 기준으로 토큰화 가능
// if문으로 에러처리할 수 있는데 exception 이용하는 것은 효율적이지 못하다
// exception은 예측 못할 에러처리하는데 사용하기, exception은 내 코드의 모든 객체가 다 들어 있어 메모리를 많이 차지한다

	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			// IO가 아니라 순수하게 파일 정보를 알아내가
			File file = new File("phone.txt");

			if (!file.exists()) {
				System.out.println("file not found");
				return;
			}

			System.out.println("=============파일정보==============");
			System.out.println(file.getAbsolutePath()); // c부터 전체 path
			System.out.println(file.length() + "bytes");
			// 한 번 사용할 내용 굳이 객체 만들 필요없이 그냥 넣어버리기
			// System.out.println(new Date(file.lastModified())); // 년월일 각각 뽑아낼 때 date 비추
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(newDate(file.lastModified()));
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
				StringTokenizer st = new StringTokenizer(line, "\t ");  // (토큰화할 대상, 구분기준); 구분기분은 여러 개 나열
				
				int index = 0;
				while(st.hasMoreElements()) {  // 남은 토큰이 있는지, 있으면 true
					String token = st.nextToken();  // 객체에서 다음 토큰 반환
					if(index == 0) { //이름
						System.out.println(token + ":");
					} else if(index == 1) { //번호1
						System.out.println(token + "-");
					} else if(index == 2) { //번호2
						System.out.println(token + "-");
					} else { // 번호3
						System.out.println(token);
					}
					index++;
				}
				System.out.println("");
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
