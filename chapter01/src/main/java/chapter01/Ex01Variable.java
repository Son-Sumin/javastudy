package chapter01;

public class Ex01Variable {

	public static void main(String[] args) {
		int i = 1000;
		String s = "Hello World";  // = new String("Hello World") string은 자주 사용하기에 java에서 제공하는 서비스
		
		System.out.println(i);
		System.out.println(s);
		
		System.out.println("변수 변경(algorithm, logic)");
		i = 2000;
		s = "Hello Again";
		
		System.out.println(i);
		System.out.println(s);
		
		// 상수; 관례상 상수는 캐피탈
		final double PI = 3.14;
		System.out.println(PI);
		
		// final이 붙은 변수(상수)는 다시 값을 대입하면 오류
		// pi = 5.68;
		
	}

}

//java는 실행 시 반드시 클래스 최소 1개가 들어가야 한다.

//public static void main(String args[]) -> 암기

//기본 프로그래밍; 변수, 데이터타입, 제어문(반복문, 조건문)

/* 식별자(Identifier); 변수명으로 다른 것들과 식별, 예약어(Keyword)가 아닌 것들을 활용
* 클래스명은 대문자, 변수 및 함수명은 소문자로 시작하여 캐피탈 섞어서 쓰기
* 
* 변수는 데이터를 저장하는 공간이고, java는 저장되는 데이터 공간(변수)의 타입을 지정해줘야한다.
* java에서 기본적으로 제공해주는 8(9)가지의 타입 존재 >
* 정수(int4), 작은/큰 정수(short2/long8), 한글자(char1), 더작은 정수(byte), t/f(boolean), 부동소수(float), 큰소수(double),
* 참조변수(학생정보를 갖고 있는 변수)
* 수 관련 타입은 연산 가능
* 
* 'Class' class 생성 완료
* 객체를 만들기 위해서 'new' 기입 new Class() 객체 생성 완료
* 객체에 대한 변수 제공 s = new Class()
* Class s = new Class()
* Class의 저장공간(변수) s는 new Class()와 별개의 저장공간을 가짐
* 
* java는 주소를 referenc로 저장함 <- jvm이 실시
* 이제 s에 reference 등이 들어갈 수 있음
* 
* 
* 선언 vs 정의
* int i라 선언하고, int i = 1000라 정의하자
* 
*/ 



// java는 선언할 때가 아니라 사용할 때 에러 발생함
/* 배열[]은 처음에 정해진 크기가 변하지 않는 정적 성질을 가짐
 * 
 * 객체; 메모리 덩어리
 * int i 에서 i 는 변수
 * String s = new String() 에서 s는 객체, 즉 reference의 주소가 들어감
 * 객체는 참조를 해야함, 그 안에 정보가 많기에
 * 객체 안에 개개의 변수가 있음
 * 
 * java가 자동으로 기존쿼리(수정내용 전 버전)를 Garbage Collect이 작동함
 * 
 * 상수(Constant); 변하지 않는 고정된 값
 */
