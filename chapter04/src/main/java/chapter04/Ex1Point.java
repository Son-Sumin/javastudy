package chapter04;

import java.util.Objects;

public class Ex1Point {
	private int x;
	private int y;
	
	public Ex1Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);  // 31*x + 30*y
	}

	@Override  // 해시값이 다르면 다르게 인식, 같으면 아래 과정으로 거침
	public boolean equals(Object obj) {
		if (this == obj)  // 동질성 비교, 같은 객체이니 같음
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex1Point other = (Ex1Point) obj;
		return x == other.x && y == other.y;  // 내용 비교
	}
	
	

}
