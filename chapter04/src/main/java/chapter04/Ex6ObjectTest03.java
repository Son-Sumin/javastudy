package chapter04;

public class Ex6ObjectTest03 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println(s1 == s2);  // reference값 비교
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + ":" + s2.hashCode());  // 내용 기반의 hashcode
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2));  // 주소 기반의 hashcode
		
		System.out.println("=================================================");
		
		String s3 = "hello";
		String s4 = "hello";
		// String 객체는 상수이다. setter가 없어서 그냥 그 값으로 써야함. 불변객체
		// new를 하긴 하지만 선택적으로 함. 같은 값이 있으면 한 객체를 공유함.
		
		System.out.println(s3 == s4);  // reference값 비교
		System.out.println(s2.equals(s4));
		System.out.println(s2.hashCode() + ":" + s4.hashCode());  // 내용 기반의 hashcode
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4));  // 주소 기반의 hashcode

	}

}