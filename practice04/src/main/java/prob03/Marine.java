package prob03;

public class Marine extends Unit {
	private int x;
	private int y;
	
	public Marine(int x, int y) {
		super(x, y);
	}

	@ Override
	public void move() {
	}

	@ Override
	public void stop() {
	}
	
	public void stimPack() { 
		/* 스팀팩을 사용한다.*/
	}	
}
