package chapter01;

/*
 * literal이란 프로그램에 직접적으로 표현되는 상수이다. 
 */
public class Ex02Literal {

	public static void main(String[] args) {
		float f = 3.14f;
		double d = 3.14;  // 기본적으로 소수는 double로 인식, 그냥 float 사용 시 소수 뒤에 f 명시하기
		
		short s = 1;
		int i = 1;
		long l = 1234567890111111111L;  //int 범위를 넘는 큰 수는 뒤에 L 붙이기, 그냥 long 뒤에 L 명시하기
		
		char c = 'A';
		byte b = 65;
		
		boolean bool = true;
		
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(c);
		System.out.println(b);  //  (char) b = A ansi코드표 참조
		
		System.out.println(bool);

	}

}
