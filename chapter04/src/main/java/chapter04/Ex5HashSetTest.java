package chapter04;

import java.util.HashSet;
import java.util.Set;

public class Ex5HashSetTest {

	public static void main(String[] args) {
		Set<Ex4Rect> set = new HashSet<>();

		Ex4Rect r1 = new Ex4Rect(10, 20);
		Ex4Rect r2 = new Ex4Rect(10, 20);

		set.add(r1);
		set.add(r2);

		// for-each문 set에서 r 하나씩 빼기, 순서 없음
		for (Ex4Rect r : set) {
			System.out.println(r);
		}

	}

}

/*
 * 자바 제공 자료구조 클래스 => collection Frameworks
 *   => 객체 동일 여부가 아니라 내용(동질성)을 봐야함. 자료구조는 내용 비교!!
 *   
 * List, Map, Set, Stack, ...
 * HashSet
 *    1. 순서 여부
 *    2. 중복 여부
 *    - list(순서O, 중복O)  -> 자료 가져올 때 순서 활용
 *    - set(순서X, 중복X)  -> 자료 가져올 때 순서가 없으니 for문 활용
 *    - map(key와 value가 존재하여 일대일대응)  -> 자료 가져올 때 key 활용
 */
