package thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadEx02 {

	public static void main(String[] args) {
		List list = new ArrayList();
		Thread thread1 = new DigitThread(list);  // 객체만 생성, thread는 미생성 start를 해야 생성됨
		Thread thread2 = new AlphabetThread(list);

		thread1.start();
		thread2.start();
	}

}

/* main(this sheet)는 실행 후 끌
 * t1 실행하다 lock, t2 실행하다 lock 번갈아가면서 함
 * 
 */
