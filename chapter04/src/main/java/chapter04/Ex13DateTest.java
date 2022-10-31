package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex13DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		
		// formatting
		printDate01(now);
		printDate02(now);
	}

	private static void printDate01(Date d) {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		//SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = sdf.format(d);
		System.out.println(date);
	}
	
	private static void printDate02(Date d) {
		// 개별적으로 뽑아 쓰려면 calendar 사용하기, 이건 수업용
		// 년도(+1900)
		int year = d.getYear();
		
		// 월(0~11) +1
		int month = d.getMonth();
		
		// 일
		int date = d.getDate();
		
		// 시
		int hours = d.getHours();
		
		// 분
		int minutes = d.getMinutes();
		
		//초 
		int seconds = d.getSeconds();
		
		System.out.println(
				(year + 1900) + "-" +
				(month + 1)   + "-" +
				date          + " " +
				hours         + ":" +
				minutes       + ":" +
				seconds);
	}

}
