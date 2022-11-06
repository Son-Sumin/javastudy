package prob5;

public class MyStack02 {
	private int top;
	private Object[] buffer; // String이 아닌 모든 객체를 담고 싶은 경우 String -> Object
							 // upcasting 활용; 모든 객체의 부모인 Object 이용

	public MyStack02(int capacity) {
		top = -1;
		buffer = new String[capacity];
	}

	public void push(Object o) {
		if (top == buffer.length - 1) {
			resize();
		}
		buffer[++top] = o;		
	}

	public Object pop() throws MyStackException {
		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}

		Object result = buffer[top];
		buffer[top--] = null;

		return result;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	private void resize() {
		Object[] temp = new Object[buffer.length * 2];
		for (int i = 0; i <= top; i++) {
			temp[i] = buffer[i];
		}
		buffer = temp;
	}
}