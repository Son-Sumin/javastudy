package chapter01;

public class Ex09ArithmaticOperator {

	public static void main(String[] args) {
		System.out.println(10.0 / 3.0);  //  double
		System.out.println(10.0 / 3);  // double
		System.out.println(10 / 3.0);  // double
		System.out.println(10 / 3);  // int
		
		System.out.println((double)(10 / 3));
		System.out.println((double)10 / 3);
		
		System.out.println(44 % 3);
		System.out.println(-7 % 3);  // -1 수학적 연산과 다름
		System.out.println(7 % -3);  // 1 수학적 연산과 다름

	}

}
