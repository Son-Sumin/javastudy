package exception;

public class MyClass {
	public void danger() throws MyException{
		System.out.println("some code1");
		
		if (1-1 == 0) {
			throw new MyException("MyException thrown");  // 이 객체가 MyClassTest catch문에 들어감
		}												  // "~" MyException 대신 여기도 가능
		
		System.out.println("some code2");
	}
}
