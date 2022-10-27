package chapter01;

public class Ex15IfStatement {

	public static void main(String[] args) {
		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		
//		방법1)	
//		char big = ' ';
//		
//		if(a3 > a1 & a3 > a2) {
//			big = (char)a3;
//		} else {
//			System.out.println("최대값은 " + a3 + "이 아닙니다.");
//		}
//		
//		System.out.println("최대값은 " + a3 + "입니다.");
		
//		방법2) 임의의 수를 지정해도 최대값 산출 가능
		if(a1 >a2) {
			if(a3 > a1) {
				System.out.println("최대값은 " + a3 + "입니다.");
			} else {
				System.out.println("최대값은 " + a1 + "입니다.");
			}
		} else {
			if(a3 > a2) {
				System.out.println("최대값은 " + a3 + "입니다.");
			} else {
				System.out.println("최대값은 " + a2 + "입니다.");
			}
		}
		
	}

}
