package prob02;

import java.util.Scanner;

public class Prob02 {
// 키보드에서 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] intArray = new int[5];
		double sum = 0;

		System.out.println("5개의 숫자를 입력하세요.");
		intArray[0] = scanner.nextInt();
		intArray[1] = scanner.nextInt();
		intArray[2] = scanner.nextInt();
		intArray[3] = scanner.nextInt();
		intArray[4] = scanner.nextInt();

		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}

		double avg = sum / intArray.length;
		System.out.println("평균은 " + avg + "입니다.");

		scanner.close();
	}
}
