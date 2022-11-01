package thread;

import java.util.List;

public class AlphabetThread extends Thread {
	private List list;  // List<String> list 같이 원래 형식으로 써야하지만 예시를 위해 생략 
	
	public AlphabetThread(List list) {
		this.list = list;
	}

	@Override
	public void run() {	
		// 동기화 작업; 제어하지 못하는 자원과 thread들의 진행을 동기화시킴
		synchronized(list) {
			list.add(null);  // 예시를 위해 의미없이 넣음
		}		
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 하나 찍고 1000밀리초 쉬고 실행 
		}
	}
}
