package thread;

import java.util.List;

public class AlphabetThread extends Thread {
	private List list;
	
	public AlphabetThread(List list) {
		this.list = list;
	}

	@Override
	public void run() {
		
		// 동기화 작업; 제어하지 못하는 자원과 thread들의 진행을 동기화시킴
		synchronized(list) {
			list.add(null);
		}
		
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
