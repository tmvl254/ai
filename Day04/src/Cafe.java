
public class Cafe {

	public static void main(String[] args) {
		
		CoffeeMashine cf= new CoffeeMashine(2,2,2);
		cf.makecoffee(2,2);
		System.out.println(cf.getSuger());
		cf.setSuger(1);
		System.out.println(cf.getSuger());
		
	}

}

class CoffeeMashine{
	private int coffee;
	private int cream;
	private int suger;
	
	public CoffeeMashine() {
		
	}
	
	public CoffeeMashine(int coffee, int cream, int suger) {
		this.coffee = coffee;
		this.cream = cream;
		this.suger = suger;
	}

	//setter
	public void setCoffee(int coffee) {
		this.coffee=coffee;
	}
	
	public void setCream(int cream) {
		this.cream=cream;
	}
	
	public void setSuger(int Suger) {
		this.suger=suger;
	}
	
	//getter
	public int getCoffee() {
		return coffee;
	}
	
	public int getCream() {
		return cream;
	}
	
	public int getSuger() {
		return suger;
	}
	
	//메소드 오버로딩
	

	public void makecoffee(int coffee, int cream) {
		System.out.println("커피:"+coffee+","+"크림:"+cream+" 커피를 만듭니다.");
	}
	public void makecoffee(int coffee) {
		System.out.println("커피"+coffee+"커피를 만듭니다.");
	}
	
	public void makecoffee(int coffee, int suger, int cream) {
		System.out.println("커피"+coffee+","+"크림"+cream+"설탕"+suger+"커피를 만듭니다.");
	}
	
	
}