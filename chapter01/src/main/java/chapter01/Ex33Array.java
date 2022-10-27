package chapter01;

public class Ex33Array {
// 잘못된 소스 고치기
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		int result = 0;

		for (int i = 0; i < intArray.length; i++) {    // '<=' -> '<'
			result = result + intArray[i];
		}
		
		System.out.println("result:" + result);
		
		// 배열의 요소는 지정 안하면 초기화된다.
		// 정수, 실수 -> 0, 객제 -> null 로 초기화된다.
		System.out.println("intArray의 4번째 값: " + intArray[3]);

	}

}
