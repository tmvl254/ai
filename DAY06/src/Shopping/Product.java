package Shopping;

public abstract class Product {

	String pname; //상품이름
	int price; //상품가격
	
	public void printDetail() {
		System.out.println("상품명:"+ pname+",");
		System.out.println("상품가격:"+ price+",");
		printExtra();
	}
	
	public abstract void printExtra();
}
