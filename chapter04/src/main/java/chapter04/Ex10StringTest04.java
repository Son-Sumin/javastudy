package chapter04;

public class Ex10StringTest04 {

	public static void main(String[] args) {
		// String s1 = "Hello " + "World " + "Java " + 12;
		// 위는 아래와 같은 원리로 돌아감
		// append는 자기를 return해줌; method tuning, chaining 
		// StringBuffer는 내부적으로 아래와 같이 돌아가니 위 버전 사용하기
		String s1 = new StringBuffer("Hello ")
				.append("World ")
				.append("Java ")
				.append(12)
				.toString();
		
		System.out.println(s1);
		
		System.out.println("-----x--------x--------x-----");
		
		// StringBuffer를 명시적으로 써야하는 경우; for문으로 많은 횟수로 + 연산을 할 경우
		// i <= 100000 면 엄청 오래 걸린다
		String s2 = "";
		for (int i = 0; i <= 9; i++) {
			// s2  = s2 + i;  이것은 아래와 같이 내부적으로 돌아감
			s2 = new StringBuffer(s2).append(i).toString();
		}
		System.out.println(s2);
		
		System.out.println("-----x--------x--------x-----");
		
		StringBuffer sb3 = new StringBuffer("");
		for (int i = 0; i <= 100000; i++) {
			sb3.append(i);
		}
		String s3 = sb3.toString();
		System.out.println(s3.length());  // 너무 길어져서 문자열 연속이 아닌 문자열 길이 출력
	}
	
	

}
