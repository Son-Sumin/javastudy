package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Ex01VectorTest01 {
	//예전 버전 Vector는 Iterator 지원 못 받았었지만 지금은 가능
	
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우너");
		
		// 순회1; 인덱스별로 출력
		for(int i = 0; i < v.size(); i++) {
			String s =  v.elementAt(i);
			System.out.println(s);
		}
		
		// 삭제
		v.removeElementAt(2);
		
		System.out.println("======================");
		
		// 순회2; 다음꺼 출력
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
	}

}
