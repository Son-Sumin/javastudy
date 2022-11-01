package collection;

import java.util.Stack;
import java.util.Vector;

public class Ex09StackTest {

	//public
	// class Stack<E> extends Vector<E>
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("Hello");
		stack.push("World");
		stack.push("!!!");
		stack.push("java");
		stack.push(".");
		
		while (!stack.isEmpty()) {
			String s = stack.pop();
			System.out.println(s);
		}
		
		System.out.println("======================================");

		stack.push("Hello");

		System.out.println(stack.pop());
		
		// 비어있는 경우, pop()을 호출하여 예외 발생
		//System.out.println(stack.pop());

		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우너");
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());  // stack 맨 위에 뭐가 있는지
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.size());  // Super is Vector, so we can get size of array
	}

}
