package chapter01;

public class Ex11LogicalOperator {

	public static void main(String[] args) {
		// !(not) :   !ture => false
		// !true => false
		// !false => true
		System.out.println(!(3 != 2));  // false
		
		// &&(and, 논리곱)
		// true && false => false
		// false && true => false
		// false && false => false
		// true && true => true
		System.out.println(3 > 2&& 3 > 4);  // false
		
		// ||(or, 논리합)
		// true || false => true
		// false || true => true
		// false || false => false
		// true || true => true
		System.out.println(3 != 2 || -1 > 0);  // true
		
		
		// ^(xor, 배타적 논리합) ; 둘이 다르면 true
		// true ^ false => true
		// false ^ true => true
		// false ^ false => false
		// true ^ true => false
		System.out.println(3 != 2 ^ -1 > 0);  // true
		
		// 비교연산자가 논리연산자보다 먼저 계산된다

	}

}
