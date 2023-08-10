package my.day05.exam5;

public class CarExample {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		
		mycar.tire= new Tire();
		mycar.run();

		mycar.tire= new HankookTire();
		mycar.run();
		
		mycar.tire= new kumhoTire();
		mycar.run();

	}

}
