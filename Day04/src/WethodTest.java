
public class WethodTest {
	
//	static final double PI= 3.141592;
	
	
		// 1. 7단 출력 메소드
			void gugu1(){
			int dan=7;
			for(int i=1; i<=9; i++) {
				System.out.println(dan+"X"+i+"="+dan*i);
				}
			System.out.println("");
			}

		// 2. 구구단 원하는 단을 출력해주는 메서드를 만들어주세요.(매개변수)
			void gugu1(int dan){
				for(int i=1; i<=9; i++) {
					System.out.println(dan+"X"+i+"= "+dan*i);
					}
				System.out.println("");
				}

			void gugu1(int dan, int limit){
				for(int i=1; i<=9; i++) {
					System.out.println(dan+"X"+i+"= "+dan*i);
				}
				System.out.println("");
			}

		// 3. 구구단 원하는 단을 출력해주는 메서드를 만들어주세요.(매개변수)
			void gugu3(int limit){ //1단부터 limit 단까지 출력
				for(int dan=1; dan<=limit; dan++) {
					for(int i=1; i<=9; i++) {
						System.out.println(dan+"X"+i+"="+dan*i);
					}
				}
				System.out.println("");
			}

		// 4. 원하는 이름을 출력해주는 메서드를 만들어주세요(매개변수)
			void printname(String name) {
				System.out.println("오승주");
			}

		// 5. 자신의 이름을 리턴하는 메서드를 만들고 변수 my_name에 저장해주세요. 
		// 그리고 my_name을 출력해주세요.(리턴값 O)
			String getname(){
				return "오승주";
			}

		// 6. 
			static int square(int num) {
				return num = num;
			}

//			static double area(double radius) {
//				return radius * radius * PI;
//			}
			
			
		public static void main(String[] args) {
			WethodTest mt = new WethodTest();
			mt.gugu1();
			mt.gugu1(3);
			mt.gugu3(5);
			int num1 = WethodTest.square(10);
			System.out.println(num1);
			mt.printname("오승주");
			String n=mt.getname();
			System.out.println("나의 이름은: "+n);

//			WethodTest mt = new WethodTest();
//			System.out.println(WethodTest.area(6.0));
			
		}

}
