package com.bitacademy.paint.i;

import com.bitacademy.paint.shape.Rectangle;

public interface Drawable {
	void draw();
}

/* interface는 다 public이기에 public void -> void 가능
*    ex. public class GraphicText implements Drawable
*
* 추상클래스는 확장만을 위한 용도로 사용하며 new를 하지 않는다.(객체를 직접 생성해서 사용 불가)
* 추상클래스는 대체로 부모클래스가 되며, 자식은 그 추상메소드을 구현해야한다. 아니면 자식도 추상클래스
*    ex. public abstract class Shape implements Drawable 
*    
* interface
* - 2개 이상의 클래스에서 똑같이 구현될만한 메소드 선언
* - 클래스 자체를 드러내지 않고 객체의 프로그래밍 인터페이스를 제공하는 경우 -> 캡슐화
*
* 객체지향 5가지 원칙(SOLID)
* ISP (Interface Segragation Principle) : 인터페이스 분리 원칙
* 
* 인터페이스 사이에서는 다중 상속이 가능
* 여러의 인터페이스를 하나의 기능으로 모으는 것
* 
* 어떤 interface 영향을 받고 있을까? 
* reference instanceof 상위/하위 클래스  - boolean
*    ex. Shape c = new Circle();
*        System.out.println(c instanceof Drawable);
* 
* 하지만 interface는 hierachy와 상관없이 instanceof 연산자를 사용할 수 있다.
*/

// 부모클래스의 메소드를 동일한 이름으로 재 작성 (같은 이름, 같은 리턴 타입, 같은 시그너쳐)
/*

[Rectangle]
@Override
public void draw() {
	System.out.println("사각형을 그렸습니다.");
}

[Main]
Rectangle rectangle = new Rectangle();
		draw(rectangle);

*/
