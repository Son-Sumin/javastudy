package prob5;

public class MainApp03 {

// 코드 작성 시에는 타입 지정 안하고 complie 때 하기  => generic
// 부모코드
	
	public static void main(String[] args) {
		try {
			MyStack03<String> stack = new MyStack03(3);
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push(".");

			while (stack.isEmpty() == false) {
				String s = stack.pop();
				System.out.println(s);
			}

			System.out.println("======================================");

			stack = new MyStack03<>(3);  // <> 생략 가능
			stack.push("Hello");

			System.out.println(stack.pop());

		} catch (MyStackException ex) {
			System.out.println(ex);
		}

	}

}
