package exception;

public class UncheckedExceptionTest {

	public static void main(String[] args) {
		// Unchecked Exception은 예외처리 없이 발생해야 한다.
		// 왜? 예외 확인 후 수정해야하는 예외라기보다 로직 에러이기 때문이다.
		// 아래 예외들은 코드를 재작성해야 한다.
		// ArrayIndexOutOfBoundsException
		// ArithmeticException
		// NullPointException
		
//		try {
			int[] a = {1, 2, 3, 4, 5};
			for (int i = 0; i <= 5; i++) {
				System.out.println(a[i]);
			}
			
//		} catch (Exception ex) {
//			//exception 종류를 모르면 모든 exception의 부모인 Exception 사용
//			System.out.println("미안합니다.");
//			System.out.println("error:" + ex);
//			return;
//		}

	}

}
