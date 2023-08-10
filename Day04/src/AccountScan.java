import java.util.ArrayList;
import java.util.Scanner;

public class AccountScan {

	private static Scanner s = new Scanner(System.in);

	// 계좌생성
	private static void createAccount2() {

		System.out.print("계좌번호:");
		String ano = s.next();

		System.out.print("계좌주:");
		String owner = s.next();

		System.out.print("초기입금액:");
		int balance = s.nextInt();

		Account2 Ac2 = new Account2(balance, ano, owner);

		arrayAccount2.add(Ac2);

		System.out.println("결과: 계좌가 생성되었습니다.");

	}

	// 계좌목록보기
	private static void account2List() {

		System.out.println("---------------------");
		System.out.println("계좌목록");
		for (Account2 Ac2 : arrayAccount2) {
			System.out.println("계좌번호: " + Ac2.getAno());
			System.out.println("계좌주: " + Ac2.getOwner());
			System.out.println("계좌금액: " + Ac2.getBalance());
			System.out.println("");
		}
		System.out.println("---------------------");
	}

	// 예금
	private static void deposit() {
		System.out.println("----------------");
		System.out.println("예금");
		System.out.println("-----------------");

		System.out.println("계좌번호: ");
		String ano = s.next();
		Account2 account2 = findAccount2(ano);

		if (account2 != null) {
			System.out.println("예금액: ");
			int money = s.nextInt();

			account2.setBalance(account2.getBalance() + money);
			System.out.println("결과: " + money + "원이 예금되었습니다.");
		}

		if (account2 == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
	}

	private static Account2 findAccount2(String ano) {
		// Account2 account2 = null;

		for (Account2 ac : arrayAccount2) {
			String dbAno = ac.getAno();
			if (dbAno.equals(ano))
				return ac;
		}

		return null;
	}

	// 출금
	private static void withdraw() {
		System.out.println("----------------");
		System.out.println("출금");
		System.out.println("-----------------");

		System.out.println("계좌번호: ");
		String ano = s.next();

		Account2 account2 = findAccount2(ano);
		if (account2 != null) {
			System.out.println("출금액: ");
			int money = s.nextInt();
			if (account2.getBalance() >= money) {
				account2.setBalance(account2.getBalance() - money);
				System.out.println("결과: " + money + "원이 출금되었습니다.");
			} else
				System.out.println("결과: 금액이 모자랍니다.");
		}

		if (account2 == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
	}

	// 계좌저장을 위한 자료구조 생성
	static ArrayList<Account2> arrayAccount2 = new ArrayList<Account2>();

	public static void main(String[] args) {

		boolean b = true;
		while (b) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택= ");

			int a = s.nextInt();
			switch (a) {
			case 1:
				System.out.println("계좌 생성");
				createAccount2();
				break;
			case 2:
				account2List();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				System.out.println("프로그램 종료");
				break;
			}
			if (a == 5) {
				b = false;
			}
		}

	}

}
