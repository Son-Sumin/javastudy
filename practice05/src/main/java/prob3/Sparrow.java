package prob3;

public class Sparrow extends Bird {
	private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub

	}
	
	public void show() {
		System.out.println(toString());
	}

}
