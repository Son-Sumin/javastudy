package exception;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		try {
			myClass.danger();
		} catch (MyException e) {
			System.out.println("error:" + e);
		}

	}

}
