package paint;

public class ColorPoint extends T8Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		// this.x =x; 는 T8에 x가 private으로 명시되어 호출 불가
		// this.setX(x); 도 가능
		//setX(x);
		//setY(y);
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override  // 시그니처가 부모와 동일 (메소드의 갯수 순서 타입)
	public void show() { 
		// super.show();   부모의 기능 재구현 super. 은 부모의 것을 쓰겠다는 키워드
		
		// 부모의 x, y가 private이기에 에러뜸, super는 코드 수정하지 않도록!!
		System.out.println(
				"점(x=" + getX() + 
				", y=" + getY() +
				", color=" + color +
				")를 그렸습니다."); 
		
	}
}
