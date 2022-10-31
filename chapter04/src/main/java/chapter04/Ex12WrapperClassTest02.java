package chapter04;

public class Ex12WrapperClassTest02 {

	public static void main(String[] args) {
		// string -> int
		String s1 = "123456";
		int i = Integer.parseInt(s1);
		
		// 반대로(int -> string)
		String s2 = String.valueOf(i);
		String s3 = "" + i;
		
		System.out.println(s1 + " : " + s2 + " : " + s3);

		// 문자 -> 숫자(16진수로 표현됨)
		char c = 'A';
		int i2 = Character.getNumericValue(c);
		System.out.println(i2);
		
		// 2진수 - > 16진수
		String s4 = Integer.toBinaryString(15);
		System.out.println(s4);
		
		// 16진수 - > 2진수
		String s5 = Integer.toHexString(c);
		System.out.println(i2);

	}

}
