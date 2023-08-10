package my.day05.exam3;

public class SuperonicAirplaneExample {

	public static void main(String[] args) {
		SuperonicAirplane sa = new SuperonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode = SuperonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
