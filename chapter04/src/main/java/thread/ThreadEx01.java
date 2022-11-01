package thread;

public class ThreadEx01 {

	// 한 thread씩 실행되지만 실제로는 동시에 실행되는 것처럼 보임
	
	public static void main(String[] args) {
//		for(int i = 1; i <= 10; i++) {
//			System.out.print(i);
//		}
		
		new DigitThread().start();

		for(char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 하나 찍고 1000밀리초 쉬고 실행 
		}
	}

}
