package thread;

import java.util.List;

public class DigitThread extends Thread {
	private List list;
	
	public DigitThread() {
		
	}
	
	public DigitThread(List list) {
		this.list = list;
	}

	@Override
	public void run() {
		  // 같은 객체를 공유하는 thread를 여러 개 진행시킨다면 해당 부분 synchronized 블락 안에 넣기
		synchronized(list) {
			list.add(null);
		}
		for(int i = 1; i <= 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
