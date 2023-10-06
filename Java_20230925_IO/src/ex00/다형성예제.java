package ex00;
class A {
	void funA() {System.out.println("funA...");}
}

class B extends A {
	void funB() {System.out.println("funB...");}
	void funA() {System.out.println("funBA...");}
}

class C extends B{
	void funC() {System.out.println("funC...");}
	void funA() {System.out.println("funCA...");}
}

public class 다형성예제 {

	public static void main(String[] args) {
		A a = new A();
		a.funA();
		
		A a3 = new C();
		a3.funA();
	}

}
