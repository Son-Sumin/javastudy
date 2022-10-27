package chapter01;

public class Ex07ArithmaticOperator {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		
		// binary operator
		System.out.println(a + b);  // 10
		System.out.println(a - b);  // -4
		System.out.println(a * b);  // 21
		System.out.println(a / b);  // 정수/정수 = 정수 이어서 0
		System.out.println(a % b);  // 3
		
		// unary operator
		System.out.println(-a);  // -3
		
		++a;
		// a += 1;
		// a = a + 1;
		System.out.println(a);  // 4
		
		a++;
		// a += 1;
		// a = a + 1;
		System.out.println(a);  // 5
	
		// int k = 10 + a++;  // a는 위에서부터 5를 얻었고 10 더한 후 15가 된 상태에서 +1 => 16
		
		System.out.println(a++);   // System.out.println(a) 후 연산해라
		System.out.println(a);     //6
		
		System.out.println(++a);   //7
		System.out.println(a);     //7
		
		System.out.println(--a);  //6
		System.out.println(a);    //6
		System.out.println(a++);  //6
		System.out.println(a);    //7
	

	}

}
