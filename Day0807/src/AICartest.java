
public class AICartest {

	public static void main(String[] args) {
		
		Person hong = new Person();
		Car sportCar = new Car();
		Car sedanCar =new Car(1000, "블랙");
		
		hong.age =20;
		hong.name= "홍길동";
		
//		 sportCar.run(50);
//		 sedanCar.run(5000);
		 
		 System.out.println(sedanCar.speed);
		 System.out.println(sportCar.speed);
		 System.out.println(sedanCar.color);
		 System.out.println(sportCar.color);
		
		hong.eat();
		hong.smile();
				
	}

}
