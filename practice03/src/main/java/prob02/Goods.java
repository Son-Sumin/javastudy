package prob02;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	
	public Goods(String n, int p, int c) {
		this.name = n;
		this.price = p;
		this.countStock = c;
	}
	
	public void showInfo() { 
		System.out.println(name + "(가격: " + price +"원)이 " + countStock + "개 입고 되었습니다.");
	}
}
