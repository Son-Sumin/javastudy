package chapter04;

public class Ex7StringTest01 {

	public static void main(String[] args) {
		// c:\temp 출력 시 \\ 붙여서 escape를 escape하기
		System.out.println("c:\\temp");
		
		// "hello" 출력
		System.out.println("\"hello\"");
		
		// \ : escape; 제어문자를 사용으로 인식
		// \t: tab
		// \r: 개행문자 carrige return; 그 줄 맨 앞으로
		// \n = \r\n: new line, 개행 후 맨 앞에서 시작 (\n: 원래 줄만 바꿔 그 곳에서 출력을 의미함)
		// \b: beep ; window에서는 소리 안나고, linux에서 소리 나옴
		
		System.out.print("hello\tworld\n");
		System.out.print("hello world1\r");
		System.out.print("hello world");
		
		// ' 출력
		char c = '\'';
		System.out.println(c);
		
	}

}
