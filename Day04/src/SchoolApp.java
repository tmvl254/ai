import java.util.ArrayList;

public class SchoolApp {

	public static void main(String[] args) {
		
		 Student  student1 = new  Student();
		 student1.set학과("정보통신공학과");
		 student1.set학번("20181482");
		 student1.set수강과목("자바");
		 
		 System.out.println("학생1의 학번"+student1.get학번());
		 student1.showInfo();
		 
		 ArrayList<Student> list = new  ArrayList();
		 list.add(student1);
		 list.add(new Student("20181482","컴퓨터공학과","파이썬"));
		 
		 System.out.println(list.size());
		 
		 for(Student s : list) {
			s.showInfo();
		 }
		 
	}

}
