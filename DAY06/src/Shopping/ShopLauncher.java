package Shopping;

public class ShopLauncher {

	public static void main(String[] args) {

		Shop shop = new Myshop();
		shop.setTitle("My shop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}
}
