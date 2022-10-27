package chapter01;

public class Ex32Array {

	public static void main(String[] args) {
		// 선언 시 크기를 지정할 수 없다
		// int [10] a1 표현 불가
		
		// 배열 만드는 방법
		int a2[] = new int[5];   // 비추방법
		int[] a3 = new int[5];   // 강추방법***
		System.out.println(a3.length);
		
		// 초기화1**; 객체는 new가 있어야 하는 원리를 위배히는 것 같지만 초기화2의 과정을 jvm이 해주는 것임
		// 초기화되는 내용을 안다면 이 방법이 좋긴 함
		int[] a4 = {0,1,2,3,4};
		System.out.println(a4.length);
		
		// 초기화2***
		// int[자리이름] a5 = 값
		int[] a5 = new int[5];
		a5[0] = 0;
		a5[1] = 1;
		a5[2] = 2;
		a5[3] = 3;
		a5[4] = 4;
		System.out.println(a5.length);
		
		// 초기화3
		int[] a6 = new int[]{0,1,2,3,4};
		System.out.println(a6.length);
		
		// 사용: 1.랜덤 접근
		System.out.println(a6[3]);
		
		// 사용: 2.순회
		for(int i = 0; i < a6.length; i++ ) {
			System.out.print(a6[i] + " ");
		}


	}
}
