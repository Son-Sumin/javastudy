package chapter03;

public class T12ArrayUtil {

	public static double[] intToDouble(int[] a) {
		double[] result = null; 

		if (a == null) {
			return result;
		}

		result = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}

		return result;
	}

	public static int[] doubleToInt(double[] d) {
		int[] result = null;

		if (d == null) {
			return result;
		}

		result = new int[d.length];
		for (int i = 0; i < d.length; i++) {
			result[i] = (int) d[i];  // 작은데 <- 큰 데 명시적 캐스팅!
		}
		return result;
	}

	public static int[] concat(int[] a, int[] b) {
//		int size = 0;
//		if (a != null) {
//			size += a.length;
//		}
//		
//		if (b != null) {
//			size += b.length;
//		}
		
		int[] result = new int[(a == null ? 0 : a.length) + (b == null ? 0 : b.length)];
		// (a == null ? 0 : a.length); a가 null이면 0, 아니면 a.lenth
		
		int index = 0;
		for(int v : a) {
			result[index++] = v;
		}
		
		for(int v : b) {
			result[index++] = v;
		}
		
		return result;

		
		/* for each문(each는 의미적으로 존재)
		 * for(배열로부터 받는 것: 배열)
		 * 배열이 하나씩 앞으로 던짐
		 * 단점이 index가 없다, 값만 받는 것이면 좋지만 아니면 index 부여하기
		 */
	}

}
