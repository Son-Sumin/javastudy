package chapter03;

public class T1Goods {
	public static int countOfGoods = 0;
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	// 필드는 private으로 하는 것이 좋다
	// 메소드를 통해 데이터에 접근하도록 해야함. Goods와 GoodsApp-> set, get 활용
	// 위 사항은 규격임

	// 메소드는 public이 많다.
	// this 객체 내부에서 접근하는 메소드
	
	public T1Goods() {
		countOfGoods++;
	}
	
	public T1Goods(String name, int price, int countStock, int countSold) {
		this();  
		// 기본 생성자 T1Goods 호출 
		// this; 메소드 호출을 받는 객체를 의미
		// this(); 현재 사용중인 객체 그 자체를 의미한다
		// refactoring; 중복되는 코드는 피해라
		
		this.name = name;
		this.price = price;
		this.countStock = countStock;
		this.countSold = countSold;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price < 0) {
			price = 0;    // private 필드를 메소드를 통해 조건을 부여하여 보호할 수 있다.
		}
		this.price = price;
	}

	public int getCountStock() {   // 매개변수 없고, 리턴값 있음
		return countStock;
	}

	public void setCountStock(int countStock) {  // 매개변수 있고, 리턴값 없음
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
//	public void info() {
//		int i = 10;
//	}


	// @Override
	// source > generate to string
	// GoodsApp에 println(객체)하면 객체의 tostring 츨력
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ "]";
	}

	public void showInfo() {   // 매개변수 없고, 리턴값 없음
		System.out.println("Goods [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold+ "]");
		
	}

	public int calcDiscountPrice(double discountRate) {
		return (int)(price * discountRate);
	}
	
}
