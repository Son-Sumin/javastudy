package prob04;

public class Prob04 {

// 문자열(String)을 입력 받아, 해당 문자열을 문자 순서를 뒤집어서 char[]로 반환하는 메소드를 만들고, 
// char[]을 입력 받아 출력하는 메소드를 만드시오.

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}

	public static char[] reverse(String str) {
		char[] cs = str.toCharArray();
		char[] a = new char[cs.length];
		for (int i = cs.length - 1; 0 <= i; i--) {
			a[cs.length - 1 - i] = cs[i];
		}
		return a;
	}

	public static void printCharArray(char[] array) {
		System.out.println(array);
	}
}