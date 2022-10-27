package chapter01;

public class Ex29PrimeDetect {

	public static void main(String[] args) {
		// 2 ~ 1000까지 소수를 화면에 출력하세요.

		boolean isPrime = true;

		for (int i = 2; i <= 1000; i++) {
			for (int j = 2; i > j; j++) {
				if (i % j != 0) {
					isPrime = true;
				} else {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				System.out.println(i);
			}
		}

	}

}
