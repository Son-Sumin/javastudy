package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex03LinkedListTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("둘리");
		list.add("마이콜");
		list.add("도우너");
		
		// 순회1
		for(int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		// 삭제
		list.remove(2);
		
		System.out.println("========================");
		
		// 순회2; 예전 버전 Vector와 다르게 Iterator 지원
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		System.out.println("========================");
		
		// 순회3; Iterator 사용 시 for-each 지원
		for(String s : list) {
			System.out.println(s);
		}
		
	}

}
