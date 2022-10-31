package chapter04;

public class Ex11WrapperClassTest {
// WrapperClass 중 int는 불변객체다.
	
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('c');
		Boolean b = new Boolean(true);
		
		// Auto Boxing; constant pull 작동
		Integer i2 = 10;
		Long l = 10L;
		        
		System.out.println(i2.equals(10));    // 객체로 사용, auto boxing
		System.out.println(i2.equals(new Integer(10)));  // 위는 이렇게 내부적으로 돌아감
		
		// Auto Unboxing
		System.out.println(i2 == 10);  // 기본값으로 사용
		//System.out.println(i2.intValue() == 10);
		
		int m = i2 + 10;
		//int m = i2.intValue() + 10;
		
	}

}


/*
2가지 경우 같지만 아래를 굳이 사용하는 이유는 객체로 사용하고자 사용함.
아래 버전이 사용되는 경우는 예로, 사이트 가입 시 나이 기입할 경우 이상한 수나 입력하지 않았을 시 int i로 설정 시 통일된 결과값을 얻기 힘들다. 
이때 객체 Integer 사용하면 null값 출력 가능함.
아래와 같이 사용 안해도 constant pull이 존재하여 자동으로 객체 만들어줌.
int i = 10;
Integer i = new Integer(10);
*/