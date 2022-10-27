package paint;
 // 구현되지 않는 메소드가 단 한 개라도 있으면 추상클래스이다.
 // 다 구현 안 될 필요는 없다.
  // 부모의 추상 메소드를 자식은 반드시 물려 받아야하며, 자식도 구현 못할 시 자식도 추상클래스이다.

public abstract class Shape implements Drawable {
	private String lineColor;
	private String fillColor;
	
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
}
