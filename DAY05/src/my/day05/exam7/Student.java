package my.day05.exam7;

import java.util.Scanner;

public class Student extends Person {

	private String sID; // 학번
	private String className; // 과목

	// personInfo 메소드오버라이딩
	@Override
	public String personInfo() {
		String info = super.personInfo();
		info += "\n학번:" + sID + "\n수강과목:" + className;
		return info;
	}

	@Override
	public String getId() {
		return sID;
	}

	@Override
	public void setId(String id) {
		sID = id;
	}

	public String getsID() {
		return sID;
	}

	public void setsID(String sID) {
		this.sID = sID;
	}

	// inputInfo() 메소드 오버라이딩
	public void inputInfo() {
		///////////////////
		super.inputInfo();
		///////////////////
		System.out.println("학번을 입력하세요=");
		Scanner s = new Scanner(System.in);
		String sid = s.next();
		setId(sid);// 맴버변수에 입력값 저장

		System.out.println("수강과목을 입력하세요=");
		Scanner sc = new Scanner(System.in);
		String cn = sc.next();
		setClassName(cn);// 맴버변수에 입력값 저장
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
