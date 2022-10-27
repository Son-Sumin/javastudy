package paint;

public class T8Point implements Drawable{
	private int x;
	private int y;
	
	public T8Point() {
	}
	
	public T8Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
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
	
	public void show(boolean visible) {
		if(visible) {
			show();
		} else {
			System.out.println("점(x=" + x + ", y=" + y + ")를 지웠습니다.");
		}
	}
	public void show() {
			System.out.println("점(x=" + x + ", y=" + y + ")를 그렸습니다.");	
	}

	@Override
	public void draw() {
		show();
		
	}

// 오버로드는 시그니처가 다른 경우 사용 : 갯수, 순서, 타입	

	
//	public void disappear() {
//		System.out.println("점(x=" + x + ", y=" + y + ")를 지웠습니다.");
//	}
	
}
