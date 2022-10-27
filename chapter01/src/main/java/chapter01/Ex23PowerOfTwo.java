package chapter01;

public class Ex23PowerOfTwo {
//Ex20 참고
	public static void main(String[] args) {
		final int POWER = 10;
		long result = 1;
		
		for(int i = 0; i < POWER; i++) {
			result = result * 2;
			// result *= 2;
		}
		
		System.out.println("2의 " + POWER + "승은 " + result + "입니다.");
	}

}
