package my.day05.exam7;

import java.util.Scanner;

public class Staff extends Person {

	private String dept;// 부서
	private String id; // 사번

	public String personInfo() {
		String info = super.personInfo();
		info += "\n사번:" + id + "\n부서:" + dept;
		return info;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String iD) {
		id = iD;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	// inputInfo() 메소드 오버라이딩
	public void inputInfo() {
		///////////////////
		super.inputInfo();
		///////////////////
		System.out.println("사번을 입력하세요=");
		Scanner s = new Scanner(System.in);
		String sid = s.next();
		setId(sid);// 맴버변수에 입력값 저장

		System.out.println("부서을 입력하세요=");
		Scanner sc = new Scanner(System.in);
		String cn = sc.next();
		setDept(cn);// 맴버변수에 입력값 저장
	}

}
