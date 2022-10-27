package prob02;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	
	public void showInfo() { 
		System.out.println(name + "(가격: " + price +"원)이" + countStock + "개 입고 되었습니다.");
	}
}
