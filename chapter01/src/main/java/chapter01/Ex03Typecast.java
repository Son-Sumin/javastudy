package chapter01;

public class Ex03Typecast {

	public static void main(String[] args) {
		int i1 = 10;
		long l1 = 1000L;
		
		float f1 = 3.14f;
		double d1 = 3.14; 

		// 명시적 캐스팅(explicit Casting); 작은거 <- 큰거 에러, 명시해주기
		int i2 = (int)l1;    // int i2 = l1; 에러가 발생하지만 작성자가 l1이 int임을 안다고 명시하면 이상 무
		float f2 = (float)d1;
		int i3 = (int)f1;
		
		// 암시적 캐스팅(implicit Casting); 큰거 <- 작은거 이상무, 역은 에러
		long l2 = i1;
		double d2 = f1;
		double d3 = i1;
		
		// 데이터 의비가 다르면 캐스팅 자체가 불가함
		// boolean b = (boolean)i1 ;  C에서는 casting 가능
	}

}
