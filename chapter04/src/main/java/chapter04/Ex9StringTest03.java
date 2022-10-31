package chapter04;

public class Ex9StringTest03 {

	public static void main(String[] args) {
		
		// String method...
		// count from 0
		String s1 = "aBcABCabcAbc";
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("abc"));
		System.out.println(s1.indexOf("abc", 7 ));  // 찾는 시작점 부여, 못 찾으면 -1 출력
		System.out.println(s1.substring(3));  // 3부터 출럭
		System.out.println(s1.substring(3,5));  // 3 ~ (5-1)까지 출력
		
		System.out.println("-----x--------x--------x-----");
		
		String s2 = "   ab   cd   ";
		String s3 = "efg,hij,klm,nop,  qrs";
		
		String s4 = s1.concat(s3);
		System.out.println(s4);
		
		System.out.println("-----" + s2.trim() + "-----");  // trim 양쪽 공백 없애기, 안의 공백 삭제 불가
		System.out.println("-----" + s2.replaceAll(" ", "") + "-----");  // 바꾸고싶은 문자, 어떻게 바꿀지
		
		String[] tokens = s3.split(",");
		for(String s : tokens) {
			System.out.println(s);
		}
		
		System.out.println("-----x--------x--------x-----");
		
		String s5 = "efg,hij,klm,nop,qrs";
		
		String[] tokens2 = s5.split(" ");  // 자를 수 없는 경우
		for(String s : tokens2){
			System.out.println(s);  // String은 null이 나오지 않는다. 그냥 string 원본 출력	
		}
	}

}
