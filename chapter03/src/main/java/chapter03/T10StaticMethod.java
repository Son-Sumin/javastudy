package chapter03;

public class T10StaticMethod {
	int n; // 필드 정보(정의)
	static int m; // static 변수 선언

	void f1() { 
		System.out.println(n); // 메소드 코드 -> 필드정보
	}

	void f2() {
		System.out.println(T10StaticMethod.m); // 메소드 코드 -> static 변수
		// = System.out.println(m);
		// 같은 클레스의 클래스(static) 변수 접근에서는 클래스 이름 생략이 가능하다.
	}
	
	void f3() {  // static 메소드 -> 필드 정보
		f2();
	}
	
	static void s1() {
		// 오류 : static method에서는 인스턴스 변수에 접근할 수 없다.
		// System.out.println(n);
	}
	
	static void s2() {
		System.out.println(T10StaticMethod.m); // static 변수 -> static 메소드
		System.out.println(m);
	}
	
	static void s3() {
		// 오류 : static method에서는 인스턴스 메소드에 접근할 수 없다.
		// f1();
	}
	
	static void s4( ) {
		T10StaticMethod.s1();
		// 같은 클레스의 클래스(static) 메소드 접근에서는 클래스 이름 생략이 가능하다.
		s1();
		// this 사용 불가; this는 클래스에서 사용 가능
		// this와 static은 상극
	}

}
