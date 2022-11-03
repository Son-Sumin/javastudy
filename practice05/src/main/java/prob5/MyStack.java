//package prob5;
//
//import java.util.Arrays;
//
//public class MyStack {
//	private String[] st;  // 수정없이 지정타입 외 다른 타입으로 사용하는 방법 generic
//	
//	public MyStack(int size) {
//		String[] st = new String[size];
////		if(st.length > size) {
////			size = size + st.length;
////		} 
////			return;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + Arrays.hashCode(st);
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		MyStack other = (MyStack) obj;
//		return Arrays.equals(st, other.st);
//	}
//
//	public void push(String string) {
//		for(int i = 0; i < 10; i++) {
//			st[i] = string;
//		}
//		System.out.println("OKOK");
//	}
//
//
//	public boolean isEmpty() {
//		if (st.length != 0) {
//		}
//			return false;
//	}
//
//	public String pop() {
//		for (int i = 0; i < st.length; i--) {
//			st[i] = null;
//		}
//		return "";
//	}	
//}
//
//// resize
//// top = 0이면 MyStackException에서 throw

package prob5;

// 객체지향 활용

public class MyStack {
	private int top;
	private String[] buffer;

	public MyStack(int capacity) {
		top = -1;  // 그냥 -1로 세팅, 0도 가능하고 그에 맞게 아래 숫자 수정 필요
		buffer = new String[capacity];
	}

	public void push(String s) {
		if (top == buffer.length - 1) {
			resize();
		}
		buffer[++top] = s;		
	}

	public String pop() throws MyStackException {
		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}

		String result = buffer[top];
		buffer[top--] = null;

		return result;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	private void resize() {
		String[] temp = new String[buffer.length * 2];
		for (int i = 0; i <= top; i++) {
			temp[i] = buffer[i];
		}

		buffer = temp;
	}
}