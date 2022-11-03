package prob5;

public class MainApp02 {

// 코드 작성 시에는 타입 지정 안하고 complie 때 하기  => generic
// 부모코드
	
	public static void main(String[] args) {
		try {
			MyStack02 stack = new MyStack02(3);
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push(".");
			stack.push(12);  // int로 auto-boxing 발생

			while (stack.isEmpty() == false) {
				//String s = (String)stack.pop();  //downcasting, 위에 숫자를 push하면 castexception
				// 위험하다: 잘못된 Type Casting할 우려가 있다
				// 1. 작성시 에러가 발견되지 않음
				// 2. 런타임 때 ClassCastException이 발생할 확률이 있다
				Object s = stack.pop();
				System.out.println(s);
			}

			System.out.println("======================================");

			stack = new MyStack02(3);
			stack.push("Hello");

			System.out.println(stack.pop());

		} catch (MyStackException ex) {
			System.out.println(ex);
		}

	}

}
