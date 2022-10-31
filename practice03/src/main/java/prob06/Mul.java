package prob06;

public class Mul extends Arith {
	private int a;
	private int b;
	
	@ Override
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	} 
	
	@ Override
	public void calculate() {
		System.out.println(a * b);
	}
}
