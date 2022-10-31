package chapter04;

public class Ex2ObjectTest02 {

	public static void main(String[] args) {
		Ex3Point p1 = new Ex3Point(10,20);
		Ex3Point p2 = new Ex3Point(10,20);
		Ex3Point p3 = p2;
		
		// 객체가 같다라는 것은 2가지 의미를 갖든다.
		// 1. == : 두 객체의 동일성
		// 2개의 객체가 같은 reference를 가리킴
		System.out.println(p1 == p2);  // p1, p2 서로 객체가 다음
		System.out.println(p2 == p3);  // p3는 p2 객체를 복사했으니 같음
		
		// 2. equals : 두 객체의 동질성 (내용비교)
		// 내용 비교를 위해 메소드 사용해야함
		// java는 실무에서 다룰 경우 내용적으로 동일하다는 것을 의미하는 경우가 많다
		// 부모 클래스 Object의 기본 구현인 동일성(==)과 같다.
		// 내용비교를 하려면 override를 해야한다.
		
		System.out.println(p1.equals(p2));
		// 내용은 같으나 객체가 서로 다름
		// 구체적인 내용이 없을 시 object의 동질성 비교는 기본(동일성) 구현
		// equals는 내용 비교를 하며, hashCode와 같이 override 해야한다. 원칙!!!
		// 두 객체가 같은지 물어보면 먼저 해싱값 비교 후 같으면 equals 이용해서 내용 비교하여 한 번 더 확인, 처음부터 해싱값이 다르면 다른 것으로 취급
		// equals에 구체적인 내용 부여가 없을 경우 Object 내용 이어받아서 기본인 동일성 구현
		/*  public boolean equals(Object obj) {
        		return (this == obj);
    		}
		 */
		
		System.out.println(p2.equals(p3));  // p2와 p3는 같은 객체이니 당연히 내용도 같을 것

		// String 비교는 s1.equals(s2)를 사용한다.
		// s1 == s2 가 불가한 것이 아님. 
		// 객체가 같냐는 의미이기 때문에 상황에 따라 가능함.
	}

}
