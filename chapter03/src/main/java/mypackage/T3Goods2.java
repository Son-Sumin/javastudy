package mypackage;

public class T3Goods2 {
	public String name;    // [모든] 접근이 가능하다.
	protected int price;   // 같은 패키지 + [자식]접근*
	int countStock;        // 디폴트, 같은 패키지
	private int countSold; // 클래스 [내부]에서만 접근 가능

	public void m() {
		countSold = 100; 
	}
}
