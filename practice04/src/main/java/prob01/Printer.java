package prob01;

// overload 활용 -> generic 활용

public class Printer {

//	public void println(double a) {
//		System.out.println(a);
//	}
//	
//	public void println(int a) {
//		System.out.println(a);
//	}
//	
//	public void println(String a) {
//		System.out.println(a);
//	}
//	
//	public void println(boolean a) {
//		System.out.println(a);
//	}

	// generic return
//	public <T, R, S> R println(T t, S s) {
//		R res = null;
//		return res;
//	}
	
	// 1. generic
	// method를 호출할 때 타입을 정하겠다 
	// <T> void는 리터값이 아니라 generic method를 사용하겠다는 의미
//	public <T> void println(T t) {
//		System.out.println(t);
//	}
	
	// 3. generic + 가변 parameter
	public <T> void println(T... ts) {
		for(T t : ts) {
		System.out.println(t);
		}
	}
	
	// 2. 가변 parameter
	// int... nums; java가 complie때 배열 생성해줌
	public int sum(int... nums) {
		int sum = 0;
		for(int i : nums) {
			sum += i;
		}
		return sum;
	}
}
