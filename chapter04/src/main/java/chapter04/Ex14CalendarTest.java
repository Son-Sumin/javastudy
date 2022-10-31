package chapter04;

import java.util.Calendar;

// Date 말고 Calendar 사용하기

public class Ex14CalendarTest {

	public static void main(String[] args) {
		// Calendar는 new를 하지 않는다. 생성자가 private이어서 static method 사용한다.
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal);
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 11);  // 12월(MONTH-1)
		cal.set(Calendar.DATE, 25);
		printDate(cal);
		
		cal.set(2021, 8, 13);
		cal.add(Calendar.DATE, 1000);
		printDate(cal);
	}

	private static void printDate(Calendar cal) {
		final String[] DAYS = {"일", "월", "화", "수", "목", "금" ,"토"}; 
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);  // 0~11 +1
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK);  // 1~7(일~토)
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(
				year        + "-" +
				(month + 1) + "-" +
				date        + " " +
				DAYS[day-1] + "요일" +
				hour        + ":" +
				minute      + ":" +
				second);
	}

}
