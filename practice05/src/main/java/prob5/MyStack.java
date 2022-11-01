package prob5;

import java.util.Arrays;

public class MyStack {
	private String[] buffer;  // 수정없이 지정타입 외 다른 타입으로 사용하는 방법 generic
	
	public MyStack(int size) {
		StringBuffer buffer = new StringBuffer(size);
		if(buffer.length() > size) {
			size = size + buffer.length();
		} else {
			return;
		}
	}

	public void push(String string) {
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i < buffer.length(); i++) {
			buffer.append(string);
		}
		
//		String s2 = "";
//		for (int i = 0; i <= 9; i++) {
//			// s2  = s2 + i;  이것은 아래와 같이 내부적으로 돌아감
//			s2 = new StringBuffer(s2).append(i).toString();
//		}
//		System.out.println(s2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(buffer);
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
		return Arrays.equals(buffer, other.buffer);
	}

	public boolean isEmpty() {
		StringBuffer buffer = new StringBuffer();
		if (buffer.length() != 0) {
		
		}
			return false;
	}

	public String pop() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < buffer.length(); i--) {
			buffer = null;
		}
		return "";
	}	
}

// resize
// top = 0이면 MyStackException에서 throw