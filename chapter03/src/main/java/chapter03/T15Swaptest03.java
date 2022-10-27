package chapter03;

public class T15Swaptest03 {

	public static void main(String[] args) {
		T16IntValue a = new T16IntValue(10);
		T16IntValue b = new T16IntValue(20);

		System.out.println(a.value + ":" + b.value);
		
		swap(a, b);  // 함수에서는 value로 입력하면 바뀌지 않음, reference로 입력해야함

		System.out.println(a.value + ":" + b.value);

	}
	
	public static void swap(T16IntValue m, T16IntValue n) {
		int temp = m.value;
		m.value = n.value; 
		n.value = temp;
	}

}

/*
 * T16IntValue class가 Method area에 만들어짐
 * 동시에 heap에 value = 10, value = 20 생성
 * 그리고 stack에 지역변수 a = 10, b =20 생성
 * 
 * m이 a의 값을 복사
 * n이 b의 값을 복사
 * 
 * temp가 m의 값을 복사
 * m이 n의 값을 복사
 * n이 temp의 값을 복사
 * 
 * 
 * java는
 * call (functional method) by
 * 2. call by reference이 곧 1. call by value이다
 * 
*/
