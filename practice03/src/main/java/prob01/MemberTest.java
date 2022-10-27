package prob01;

public class MemberTest {

	public static void main(String[] args) {
		Member member = new Member();
		
		member.setName("Sumin");
		member.setId("SSon");
		member.setPoint(50000);
		
		member.show();
		
		System.out.println(member);
		// println은 객체이면 toString을 산출하도록 설정되어 있다.
		// toString의 결과값을 원하는 양식으로 만들고 싶으면 toString 메소드를 세팅해놓으면 된다.
		

	}

}
