package chapter01;

public class Ex14IfStatement {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;
		
		System.out.println("---초기값---");
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		
//		방법1)		
//		if(n1 < n2) {
//			n1 = n2 +1;
//		} else {
//			n1 = n1;
//			n2 = n2;			
//		}
		
//		방법2)	
		if(n1 < n2 ) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		System.out.println("---결과값---");
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
	}

}
