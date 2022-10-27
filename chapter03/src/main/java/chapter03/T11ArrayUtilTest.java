package chapter03;

import java.util.Arrays;

public class T11ArrayUtilTest {
	//항상 test코드부터 짜고 실행해보기
	// static method 익히기 

	public static void main(String[] args) {
		int[] a1 = {0,1,2,3,4};
		
		double[] d1 = T12ArrayUtil.intToDouble(a1);
		System.out.println(Arrays.toString(d1));  // [0.0, 1.0, 2.0, 3.0, 4.0]
		// Arrays.에 utility 기능이 있음
		
		double[] d2 = {0.0, 1.1, 2.2, 3.3, 4.4};
		int[] a2 = T12ArrayUtil.doubleToInt(d2);
		System.out.println(Arrays.toString(a2));  // [0,1,2,3,4]
		
		int[] a3 = T12ArrayUtil.concat(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8});
		System.out.println(Arrays.toString(a3));  // 1, 2, 3, 4, 5, 6, 7, 8

	}

}
