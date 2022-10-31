package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20); // class Point의 객체 p
		
//		Class klass = p.getClass();       // Object의 클래스 이름을 "Class"로 설정해놓음.
//		System.out.println(klass);
		
		// Object를 super class로 두고 있는 메소드 예시
		System.out.println(p.getClass());  // reflection; 객체가 생성된 정보를 살펴보는 것, 반영하는 것, 어노테이션 정보 확인
										   // Object의 클래스 이름을 "Class"로 설정해놓음.
		
		System.out.println(p.hashCode());  // address 기반의 해싱값; 해싱이란, int가 아닌 값들을 int로 변환
										   // address X, reference X, 객체의 아이디라는 의미가 더 정확함
		
		System.out.println(p.toString());  // getClass() + "@" + hashCode()
										   // DB를 다룰 경우 기본적으로 override함
		
		System.out.println(p);   		   // println은 기본적으로 객체의 toString() 출력

	}

}

/*
 * 객체 비교 -> 동질성과 동일성 2가지 고려
 * == ; 동일성
 * method 활용 ; 동질성
 * 
 */
