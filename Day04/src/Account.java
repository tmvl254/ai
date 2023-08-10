
public class Account {

	public static final int MIN_BALANCCE = 0;
	public static final int MAX_BALANCCE = 1000000;

	private int balance;
	private String ano; // 계좌번호
	private String owner; // 계좌주

	// 인자 생성자 (맴버변수 초기화)
	public Account(int balance, String ano, String owner) {
		this.balance = balance;
		this.ano = ano;
		this.owner = owner;
	}

	// 기본 생성자
	public Account() {
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance < MIN_BALANCCE || balance > MAX_BALANCCE) {
			return;
		} else {
			this.balance = balance;
		}
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public static void main(String[] args) {

	}

}
