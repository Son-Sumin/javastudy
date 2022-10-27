package chapter01;

import java.util.Scanner;

public class Ex31ScannerTest {

// ctrl + shift + o; 외부 class 함수 import
// System, String 등 자주 쓰는 class는 자동 import
// blocking: 프로그램이 사용자 입력을 기다리는 것
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		// 정수 입력 받기
		System.out.println("상품 정보를 입력하세요.");
		
		System.out.println("이름: ");
		String name = scanner.next();
		
		System.out.println("가격: ");
		int price = scanner.nextInt();
		
		System.out.println("재고량: ");
		int countStock = scanner.nextInt();
		
		System.out.println(name + ":" + price + ":" + countStock);
		
		scanner.close();

	}

}
