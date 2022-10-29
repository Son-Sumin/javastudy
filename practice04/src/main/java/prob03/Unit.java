package prob03;

public class Unit {
	private int x;
	private int y;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Unit() {
	}
	
	public Unit(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move() {
	}

	public void stop() {
		/* 현재 위치에 정지 */
	}
	
	public void show(boolean go) {
		if (go) {
			System.out.println("좌표(x, y) = (" + x + "," + y +")로 이동했습니다.");
		} else {
			System.out.println("현 위치에 멈췄습니다.");
		}

	}
	
	@Override
	public void show() {
		
	}

}
