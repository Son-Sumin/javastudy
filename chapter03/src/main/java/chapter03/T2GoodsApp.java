package chapter03;

public class T2GoodsApp {

	public static void main(String[] args) {
		T1Goods camera = new T1Goods();  // new 뒤에 Goods() 생성자는 실행이 된다
		
		camera.setName("nikon");   // 객체 안의 변수에 값을 세팅하는 setName
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		camera.showInfo();
		
		int discountPrice = camera.calcDiscountPrice(0.5);   // 리턴값 = 0.5 매개변수
		System.out.println("Discount Price:" + discountPrice);
		
		//System.out.println(camera);   // getName으로 각 필드값 명시도 가능하지만 객체로 전필드 활용 가능
		
		
		T1Goods g1 = new T1Goods();
		T1Goods g2 = new T1Goods();
		T1Goods g3 = new T1Goods();		
		System.out.println("instance count:" + T1Goods.countOfGoods); 
		
		
		T1Goods g4 = new T1Goods("TV", 10000, 10, 0);
		g4.showInfo();
		System.out.println("instance count:" + T1Goods.countOfGoods);   // T1Goods가 몇 번 실행됬는지 count
		
		System.out.println(g4.toString());
		System.out.println(g4);  // 위와 같은 결과를 가진다. println은 객체이면 toString을 산출하도록 설정되어 있다.
	} 

}
