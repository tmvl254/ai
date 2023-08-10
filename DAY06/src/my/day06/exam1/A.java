package my.day06.exam1;

public class A {
	public void method1() {
		System.out.println("A-method1()");
	}
}

class B extends A {
	@Override
	public void method1() {
		System.out.println("B-method1()");
	}
}

class C extends A {
	@Override
	public void method1() {
		System.out.println("C-method1()");
	}

	public void method2() {
		System.out.println("C-method2()");
	}
}