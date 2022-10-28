package prob03;

public class DropShip extends Unit {
	// 현재 위치
	private int x;
	private int y;
	
	@ Override
	public void move(int x, int y) {
	}

	@ Override
	public void stop() {
	}
	
	public void load() {
		/* 선택된 대상을 태운다.*/ 
	}
	
	public void unload() {
		/* 선택된 대상을 내린다.*/ 
	}
}

// 각 공통점을 찾아서 Unit 부모클래스를 만들어 상속시켜보기 like Shape, 실행 없음