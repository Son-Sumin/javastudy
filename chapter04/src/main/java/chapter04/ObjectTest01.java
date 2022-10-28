package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
//		Class klass = p.getClass();
//		System.out.println(klass);
		
		// Object를 super class로 두고 있는 메소드 예시
		System.out.println(p.getClass());  // reflection; 객체가 생성된 정보를 살펴보는 것
		System.out.println(p.hashCode());
		System.out.println(p.toString());

	}

}
