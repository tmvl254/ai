package Shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Myshop implements Shop {

	User[] users = new User[2];

	Product[] products = new Product[4];

	ArrayList<Product> cart = new ArrayList<Product>();

	Scanner s = new Scanner(System.in);

	String title;
	int seluser;

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 프로그램 메인 시작 가이드
	 */
	@Override
	public void start() {
		System.out.println(title + " : 메인화면~계정 선택");
		System.out.println("===============================");
		int i = 0;

		// 등록된 사용자 정보 출력
		for (User u : users) {
			System.out.printf("[%d]%s(%s)\n", i++, u.getName(), u.getPaytype());
		}

		System.out.println("[x]종료");
		System.out.print("선택: ");
		String sel = s.next();
		System.out.println("##" + sel + "선택 ##");

		// 선택된 메뉴에 따라 처리
		switch (sel) {
		case "x":
			System.exit(0);
			break;
		default:
			seluser = Integer.parseInt(sel);
			productList();
		}
	}

	/**
	 * 프로그램에서 사용하기 위한 예제 사용자 등록 가이드
	 */
	@Override
	public void genUser() {
		User user = new User("오승주", PayType.CARD);
		users[0] = user;
		user = new User("대전대", PayType.CASH);
		users[1] = user;

	}

	/**
	 * 프로그램에서 사용하기 위한 예제 상품 등록 가이드
	 */
	@Override
	public void genProduct() {
		CellPhone cp = new CellPhone("갤럭시 노트20 5G", 800000, "KT");
		products[0] = cp;

		cp = new CellPhone("갤럭시 Z 폴드4", 2000000, "SKT");
		products[1] = cp;

		SmartTV st = new SmartTV("삼성 3D Smart TV", 5000000, "4K");
		products[2] = st;

		st = new SmartTV("LG Smart TV", 2500000, "Full HD");
		products[3] = st;

	}

	/**
	 * 프로그램에서 사용하기 위한 예제 상품 목록 가이드
	 */
	public void productList() {
		System.out.println(title + " : 상품목록-상품선택");
		System.out.println("===============================");
		int i = 0;

		// 등록된 상품목록 출력
		for (Product p : products) {
			System.out.println("[" + i + "]");
			p.printDetail();
			i++;
		}
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		System.out.print("선택: ");
		String sel = s.next();
		System.out.println("##" + sel + "선택 ##");

		// 선택된 메뉴에 따라 처리
		switch (sel) {
		case "h":
			start();
			break;
		case "c":
			cheakOut();
			break;
		default:
			int psel = Integer.parseInt(sel);
			cart.add(products[psel]);
			productList();
		}
	}

	/**
	 * 프로그램 메인 종료 가이드
	 */
	public void cheakOut() {
		System.out.println(title + " : 체크아웃");
		System.out.println("===============================");
		int total = 0;
		int i = 0;

		// 장바구니에 등록된 상품정보 출력
		for (Product p : cart) {
			System.out.printf("[%d]%s(%s)\n", i++, p.pname, p.price);
			total = p.price;
		}
		System.out.println("===============================");

		// 선택한 사용자의 결제방법출력
		System.out.println("결제방법:" + users[seluser].getPaytype());

		// 합게출력
		System.out.println("합계:" + total + "원입니다.");
		System.out.println("[p]이전, [q]결제 완료");
		System.out.print("선택: ");
		String sel = s.next();

		// 선택된 메뉴에 따라 처리
		switch (sel) {
		case "q":
			System.out.println("결제가 완료되었습니다. 종료합니다");
			System.exit(0);
			break;
		case "p":
			productList();
			break;
		default:
			cheakOut();

		}
	}

	public static void main(String[] args) {

	}

}
