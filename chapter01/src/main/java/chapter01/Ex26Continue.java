package chapter01;

public class Ex26Continue {
// continue가 들어간 조건문에 true일 경우 거기서 멈추고 다시 처음으로 돌아가 시작
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);

		}

	}

}
