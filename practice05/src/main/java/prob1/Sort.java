package prob1;

public class Sort {

	public static void main(String[] arg) {

		int array[] = {5, 9, 3, 8, 60, 20, 1};
		int count = array.length;

		System.out.println("Before sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}

		// 정렬
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count - 1; j++) {
			//for (int j = 0; j < count - 1 - i; j++) {  ; i번 실행 시 마직막에서 i번째 항까지 정렬된 것이므로 '-i'
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		// 결과 출력
		System.out.println("\nAfter Sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
// 이중 for문
