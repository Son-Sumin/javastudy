package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		
		String s1 = new String("도우너");
		String s2 = new String("도우너");
		s.add("둘리");
		s.add("마이콜");
		s.add("또치");
		s.add(s1);
		s.add(s2);
		//객체가 달라도 값이 같아서 안 들어감. 자료구조는 데이터 내용!!!
		// 그래서 데어터 기반의 hashCode는 필히 override
		
		System.out.println(s.size());
		System.out.println(s.contains("둘리"));  // 존재여부 확인
		
		// Set의 Interface인 iterator() 사용 가능; for-each
		for(String str : s) {
			System.out.println(str);
		}

	}

}
