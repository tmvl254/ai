import java.util.ArrayList;

public class Arraytest4 {

	public static void main(String[] args) {
		//배열 사이즈 변경불가 해결
		//ArrayList 사용
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("자바");
		list.add("아침");
		list.add("화분");
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		
		//for each문
		for(String str : list) {
			System.out.println(str);
		}
		
	}

}
