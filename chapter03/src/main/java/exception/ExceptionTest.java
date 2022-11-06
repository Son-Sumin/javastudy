package exception;

// ExceptionTest > UncheckedExceptionTest > FileTest > MyClass > MyClassTest > MyException


public class ExceptionTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 10 - a;

		System.out.println("some code1");

		/*
		 * 에러가 발생할 것 같은 코드를 try와 catch로 감싸기
		 * 'catch(예외이름)' 
		 * 예외는 던진다고 표현
		 * 에러 처리를 못하겠으면 catch문에 e.printStackTrace();라도 넣어놓기
		 * catch문 이후에 코드는 넣는 것은 비추
		 * finally는 옵션이다
		 * 
		 * try-catch를 사용하면 예외 처리를 할 수 있으나 코드상 지저분하고, 본인이 작성한 코드가 예외가 발생할 것이라는 것을 감안하면 안됨.
		 * 위 내용은 string에서 더 다룰 내용임.
		 */
		
		try {
			System.out.println("some code2");

			int result = (1 + 2 + 3) / b;

			System.out.println("some code3");
			System.out.println("some code4");

		} catch (ArithmeticException ex) {
			/* 예외 처리 */
			
			//1. 사과
			System.out.println("미안합니다.");
			
			//2. 로깅; 원래는 파일로 로깅 작업을 해야함
			System.out.println("error:" + ex);
			
			//3. 정상 종료; 숫자 부여시 숫자마다 에러가 정해져 있음, 대체로 0 기입
			return;
		} finally {
			// catch에서 return 했기에 마무리되는 것이 맞으나
			// 예외가 발생하거나 정상적으로 실행되어서 반드시 실행되는 블록
			// 정상적으로 실행되어도, 실행되지 않아도 마무리해야 하는 자원정리할 경우 사용함
			System.out.println("자원 정리");
		}
		// 예외가 발생한 이후에 실행되는 코드이기 때문에 비추
		// System.out.println("[비추]some code4");
	}

}
