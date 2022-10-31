package chapter04;

public class StringTest01 {

	public static void main(String[] args) {
		// c:\temp 출력 시 \\ 붙여서 escape를 escape하기
		System.out.println("c:\\temp");
		
		// "hello"
		System.out.println("\"hello\"");
		
		// \ : escape; 제어문자를 사용으로 인식
		// \t: tab
		// \r: 개행문자 carrige return; 타이핑하다가 줄만 바꿔 그 곳에서 출력
		// \n = \r\n: new line, 개행 후 맨 앞에서 시작
		// \b: beep
		
		System.out.print("hello\tworld\n");
		System.out.print("hello world");
		
		// '
		char c = '\'';
		System.out.println(c);
		
	}

}
