package prob5;

import java.util.Arrays;

public class MyStack {
	private String[] st;  // 수정없이 지정타입 외 다른 타입으로 사용하는 방법 generic
	
	public MyStack(int size) {
		String[] st = new String[size];
		if(st.length > size) {
			size = size + st.length;
		} 
			return;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(st);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyStack other = (MyStack) obj;
		return Arrays.equals(st, other.st);
	}

	public void push(String string) {
		for(int i = 0; i < 6; i++) {
			st[i] = string;
		}
		System.out.println("OKOK");
	}


	public boolean isEmpty() {
		if (st.length != 0) {
		
		}
			return false;
	}

	public String pop() {
		for (int i = 0; i < st.length; i--) {
			st[i] = null;
		}
		return "";
	}	
}

// resize
// top = 0이면 MyStackException에서 throw