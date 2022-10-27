package chapter01;

public class Ex20PowerOfTwo {

	public static void main(String[] args) {
		final int POWER = 32;
		long result = 1;
		
		// 1. Loop 조건 변수
		int i = 1;
		
		// 2. While Loop의 조건식
		while(i <= POWER) {
			// 반복되는 코드
			result = result * 2; 
			// 3.Loop 조건 변경
			i = i + 1;			
		}
		
		System.out.println("2의 " + POWER + "승은 " + result + "입니다.");

	}

}
