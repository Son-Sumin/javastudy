package prob3;

public class Duck extends Bird {
	@Override
	public void fly() {
		System.out.println("오리(" + name + ")는 날지 않습니다.");
	}

	@Override
	public void sing() {
		System.out.println("오리(" + name + ")는 소리내어 웁니다.");
	}
	
	@Override
	public String toString() {
		return "오리의 이름은 " + name + " 입니다.";
	}
}
	
	/* 참고
	 * super class 'Bird'에서 protected String name으로 설정하여
	 * this.name, getName() 없이 'name' 사용
	private String name ;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	*/