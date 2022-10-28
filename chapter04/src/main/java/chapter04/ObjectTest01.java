package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
//		Class klass = p.getClass();
//		System.out.println(klass);
		
		// Object를 super class로 두고 있는 메소드 예시
		System.out.println(p.getClass());  // reflection; 객체가 생성된 정보를 살펴보는 것
		System.out.println(p.hashCode());  // address 기반의 해싱값; int가 아닌 값들을 int로 변환
										   // address X, reference X
		System.out.println(p.toString());  // getClass() + "@" + hashCode()
		System.out.println(p);   		   // println은 기본적으로 객체의 toString() 출력

	}

}

/*
 * 객체 비교 -> 동질성과 동일성 2가지 고려
 * == ; 동일성
 * method 활용 ; 동질성
 * 
 */
