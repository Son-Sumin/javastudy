package chapter03;

public class Student extends Person {
	private String major;
	private int grade;
	
	public Student() {
		// 자식의 모든 생성자에서 부모의 특정 생성자를 명시(explicity)하지 않으면
		// 암시적(implicity)으로 부모의 기본 생성자가 자식 생성자 코드 앞에 호츨된다.
		
		// super();  // 언급하지 않아도 java가 알아서 부모 호출해줌
		System.out.println("Student() called");
		// super();  <- Error; 자식보다 부모가 먼저 불린다
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
