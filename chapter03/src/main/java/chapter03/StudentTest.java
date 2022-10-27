package chapter03;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();   
		/* 기본 생성자를 만들지 않으면 java가 만들어주듯 Student()를 호출하였지만
		 * Person() called
		 * Student() called
		 * 결과값을 얻었다.
		 * 자식 생성자에 부모 생성자를 언급하지 않으면 자동으로 넣어준다. super();
		 */
		s1.setGrade(1);
		
		Person p1 = s1;  // upcasting(암시적,implicity)
		p1.setName("둘리");
		
		Student s2 = (Student)p1;  // downcasting(명시적, explicity)
		s2.setMajor("Computer Science");
		

	}

}
