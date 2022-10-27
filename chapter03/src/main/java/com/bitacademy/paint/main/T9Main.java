package com.bitacademy.paint.main;

import com.bitacademy.paint.i.Drawable;
import com.bitacademy.paint.point.ColorPoint;
import com.bitacademy.paint.point.T8Point;
import com.bitacademy.paint.shape.Circle;
import com.bitacademy.paint.shape.Rectangle;
import com.bitacademy.paint.shape.Shape;
import com.bitacademy.paint.shape.Triangle;
import com.bitacademy.paint.text.GraphicText;

//package 사용법
//import java.util.ArrayList;  // ctrl + shift + o
//import java.util.LinkedList;
//import java.util.*;

public class T9Main {

	public static void main(String[] args) {
		
	// point 그리기
		T8Point pt1 = new T8Point(10,50);
		// pt1.setX(10);
		// pt1.setY(50);
		//drawPoint(pt1); 
		draw(pt1);
		//pt1.disappear();
		pt1.show(false);
	
	// colorpoint 그리기
		T8Point pt2 = new ColorPoint(100, 200 ,"red");
//		ColorPoint pt2 = new ColorPoint();
//		pt2.setX(100);
//		pt2.setY(200);
//		((ColorPoint)pt2).setColor("red");  // upcasting; 자식의 것을 부모가 사용	
//		drawColorPoint(pt2);
		//drawPoint(pt2);
		draw(pt2);
		pt2.show(false);
		
		Triangle triangle = new Triangle();
		// drawTriangle(triangle);
		//drawShape(triangle);
		draw(triangle);
		
		Rectangle rectangle = new Rectangle();
		//drawShape(rectangle);
		draw(rectangle);
		
		Circle circle = new Circle();
		//drawShape(circle);
		draw(circle);
		
		GraphicText gt = new GraphicText("Hello World");
		draw(gt);
		
		// instanceof test
		System.out.println(circle instanceof Object);  // 상속 여부
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		// 오류: class의 instance는 hierachy 상위와 하위만 instanceof 연산자를 사용할 수 있다.
		// System.out.println(circle instanceof Triangle);
		
		// 하지만 interface는 hierachy와 상관없이 instanceof 연산자를 사용할 수 있다.  // interface 기능 구현 여부
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable);  // Runnable; java.lang에 있는 클래스
		
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
//	
//	public static void drawPoint(T8Point pt) {
//		pt.show();
//	}
	
//	public static void drawColorPoint(ColorPoint pt) {
//		pt.show();
//	}
	

}
