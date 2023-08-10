package my.day06.exam1;

public class ButtonExample {

	public static void main(String[] args) {

		// Button 객체생성
		Button btnOk = new Button();

		class OKListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}

		}
		btnOk.setClickListener(new OKListener());

		btnOk.click();

		Button btncancel = new Button();

		class cancelListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("cancel 버튼을 클릭했습니다.");
			}

		}
		btncancel.setClickListener(new cancelListener());
		btncancel.click();

	}

}
