package my.day05;

public class HumanRobot {

	public static void main(String[] args) {
		Human human = new Human();
		human.setAddr("세종");
		human.setAge(20);
		human.setName("오승주");
		
		System.out.println(human.toString());
	}

}
