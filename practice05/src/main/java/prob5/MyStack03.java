package prob5;

//Generic Class

public class MyStack03<T> {
	private int top;
	private T[] buffer; 

	public MyStack03(int capacity) {
		top = -1;
		buffer = (T[])new Object[capacity];  //new T[capacity] 지원 안함
	}

	public void push(T o) {
		if (top == buffer.length - 1) {
			resize();
		}

		buffer[++top] = o;		
	}

	public T pop() throws MyStackException {
		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}

		T result = buffer[top];
		buffer[top--] = null;

		return result;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	private void resize() {
		T[] temp = (T[])new Object[buffer.length * 2];
		for (int i = 0; i <= top; i++) {
			temp[i] = buffer[i];
		}

		buffer = temp;
	}
}