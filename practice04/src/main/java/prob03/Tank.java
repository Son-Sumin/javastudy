package prob03;

public class Tank extends Unit{
	private int x;
	private int y;

	public Tank(int x, int y) {
		super(x, y);
	}
	
	@ Override
	public void move() {
	}

	@ Override
	public void stop() {
	}
	
	@ Override
	public void show() {
	}

	public void changeMode() {
		/* 공격모드를 변환한다. */
	}
}
