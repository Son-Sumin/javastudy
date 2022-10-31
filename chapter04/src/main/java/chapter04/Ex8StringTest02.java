package chapter04;

public class Ex8StringTest02 {

	public static void main(String[] args) {
		// immutability(불변성); 객체 안의 값을 바꿀 수 없음
		
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase();  // s2 = "ABC"
		String s4 = s2.concat("??");  // s4 = "ABC??"
		String s5 = "!".concat(s2).concat("@");  // s5 = "!ABC@"    / "!" 자체가 객체임
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		String s6 = null;
		System.out.println(equalsHello(s6));
	}
	
	private static boolean equalsHello(String s) {
		return "Hello". equals(s);
		//return s.equals("Hello");
		// s = null이면 NullPointException 발생
		// 이때는 "Hello". equals(s); 가 안정적, 스트링 내용 자체를 변수로 사용
	}

}
