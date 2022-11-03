package prob01;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer();

		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		printer.println(new Point(10,20));  // Overloading again? Let's use Generic Method!
		
		System.out.println("-----generic + 가변 parameter----");
		
		printer.println("홍길동");
		printer.println(10, true);
		printer.println(10, true, 5.7, new Point(10,20));
		
		System.out.println("--------가변 parameter--------");
		
		// 가변 parameter
		System.out.println(printer.sum(1));
		System.out.println(printer.sum(1, 2));
		System.out.println(printer.sum(1, 2, 3, 4));
		// = printer.sum(new int[] {1, 2, 3, 4});  -> 배열 활용
		System.out.println(printer.sum(1, 2, 3, 4, 5, 6));
	}
}

// println overload