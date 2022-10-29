package prob03;

public class UnitTest {

	public static void main(String[] args) {
		
		Unit u1 = new Unit();
		Unit dropship = new DropShip(10,20);
		Unit marine = new Marine(100,200);
		Unit tank = new Tank(1,2);
		
		dropship.show(true);
		dropship.show(false);
		
		marine.show(true);
		marine.show(false);
		
		tank.show(true);
		tank.show(false);
		

	}
}
