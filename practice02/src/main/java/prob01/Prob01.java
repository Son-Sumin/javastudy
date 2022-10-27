package prob01;

import java.util.Scanner;

// 키보드에서 정수로 된 돈의 액수를 입력 받아 오만 원권, 만원 권, 오천 원권, 천원 권,
// 500원 동전, 100원 동전, 50원 동전, 10원 동전, 1원 동전 각 몇 개로 변환 되는지 작성하시오.
// 금액: 67879

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("금액: ");
		int price = scanner.nextInt();

		for (int i = 0; i < MONEYS.length; i++) {
			int a = price / MONEYS[i];
			price = price - (MONEYS[i] * a);
			System.out.println(MONEYS[i] + "원 : " + a + "개");
		}

		scanner.close();
	}

}