package chapter03;

public class T14SwapTest02 {

	public static void main(String[] args) {

		int a = 10; 
		int b = 20;

		System.out.println(a + ":" + b);

//		int temp = a;
//		a = b;
//		b = temp;
		
		swap(a, b);  // 함수에서는 value로 입력하면 바뀌지 않음, reference로 입력해야함

		System.out.println(a + ":" + b);

	}

	public static void swap(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
	}

}

/*
함수에 파라미터를 전달할 때 2가지 방법
call (functional method) by
1. call by value
2. call by reference

*/