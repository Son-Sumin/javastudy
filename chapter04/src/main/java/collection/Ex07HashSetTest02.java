package collection;

import java.util.HashSet;
import java.util.Set;

public class Ex07HashSetTest02 {

	public static void main(String[] args) {
		Set<Ex06Gugudan> s = new HashSet<>();
		
		s.add(new Ex06Gugudan(2, 3));
		s.add(new Ex06Gugudan(9, 9));
		s.add(new Ex06Gugudan(3, 2));  // 경우에 따라 구구단게임 만든다고 가정 시 정답보기 중복을 없애기 위해 hashCode, equals 설정 수정
		s.add(new Ex06Gugudan(2, 3));  // 순서없이, 중복가능하게 들어감 -> Gugudan에 hashCode, equals 설정하면 순서없이, 중복 불가하게 바뀜
		
		for(Ex06Gugudan d : s) {
			System.out.println(d);
		}

	}

}
