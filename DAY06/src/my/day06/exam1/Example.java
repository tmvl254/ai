package my.day06.exam1;

public class Example {
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			c.method2();
		}
		
//		if(a instanceof C) {
//			((C)a).method2();
//		}
	}
	
	public static void main(String[] args) {
		A a= new A();
		
		action(a);
		action(new B());
		action(new C());
	}

}
