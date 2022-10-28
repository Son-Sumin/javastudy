package prob05;

public class MyBase extends Base {

	public void service(String s) {
		if (s.equals("낮")) {
			System.out.println("낮에는 열심히 일하자!");
		} else if (s.equals("밤")) {
			System.out.println("night");
		} else {
			System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
		}
	}
}

// Base에서 override해서 코드생성해라