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
		return top == -1;  // 0
	}

	private void resize() {
		String[] temp = new String[buffer.length * 2];
		for (int i = 0; i <= top; i++) {
			temp[i] = buffer[i];
		}
		buffer = temp;
	}
}