package chapter01;

public class Ex12BitwiseOperator {

	public static void main(String[] args) {
		int a = 0x0f;   //0x; 16진수로 표현하겠다, 16진수는 2진법 8자리로 표현
		int b = 0xf0;
		
//		System.out.println(a); // 15   // 0000 1111
//		System.out.println(b); // 240  // 1111 0000
		
		System.out.println(a & b);     // 0000 0000
		System.out.println(a | b);     // 1111 1111
		System.out.println(a ^ b);     // 1111 1111
		System.out.println(~a);        // 1111 0000
		System.out.println(a>>3);      // 0000 0001
		System.out.println(a<<3);      // 0111 1000
		
		
/* 우선순위
 * -----증감 연산자-----
 * 1. 산술 연산자 *  / %  -> +-
 * 2. 비교 연산자 == != > < >= <=
 * -----비트 연산자-----
 * 3. 논리 연산자 ! && || ^
 */

	}

}