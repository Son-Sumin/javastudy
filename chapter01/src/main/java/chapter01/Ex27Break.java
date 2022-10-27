package chapter01;

public class Ex27Break {
// break가 들어간 조건문에 true일 경우 바로 해당 구문 빠져나와 결과 산출
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
//		while(sum < 5000) {
//			sum += i;
//			i++;
//		}
		
		while(true) {
			if(sum > 5000 ) {
				break;
			}
			
			sum += i;
			i++;
		}
		
		System.out.println("i:" + i);
		System.out.println("sum:" + sum);

	}

}
