package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex08HashMapTest {	
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		
		String ks1 = "one";   //key는 불변을 보장해야함, java가 보장하지 않으니 개발자가 인지하고 코딩해야함.
		m.put(ks1, 1);        // auto boxing
		m.put("two", 2);
		m.put("three", 3);
		
		int i = m.get("one");   // auto unboxing
		int j = m.get(new String("two"));
		System.out.println(i + ":" + j);
		
		m.put("three", 33333);
		System.out.println(m.get("three"));
		
		// 순회; 데이터 순회는 가능하지만 key를 통해 순회해야한다.
		Set<String> s = m.keySet();
		for(String key : s) {
			System.out.println(m.get(key));
		}
	}

}
