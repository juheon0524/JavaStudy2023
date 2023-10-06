package ex04_2;

class A {
	void funA() {
		System.out.println("AAA");
	}
}

class B extends A{
	void funA() {
		System.out.println("BBB");
	}
}

class C extends A{
	void funA() {
		System.out.println("CCC");
	}
}

class D {
	void funA() {
		System.out.println("DDD");
	}
}


public class MainClass {

	public static void main(String[] args) {
		A a = new B();
		a.funA();
		
		conver(new D());
	}
	
	static void conver(Object obj) {
		if(obj instanceof A) {
			A a = (A)obj;
			a.funA();
		}
		System.out.println("conver");
	}

}
