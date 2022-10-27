package chapter03;

import mypackage.T3Goods2;

public class T5DiscountGoods2 extends T3Goods2 {
	private float discountRate = 0.3f;
	
	public int getDiscountPrice() { 
		// protected는 자식에서 접근할 수 있다(price)
		return (int)(discountRate * price);   // Goods2를 부모로 둬서 상속받지만 접근과는 다른 얘기이다.
	}
}
