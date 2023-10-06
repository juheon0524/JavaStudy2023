package ex05;

public class MainClass {

	public static void main(String[] args) {
		
		A a = new A();
		a.funA();
		
		B b = new B();
		b.funA();
		b.funB();
		
		C c = new C();
		c.funA();
		c.funB();
		c.funC();
		System.out.println("======================");
		
		A aa = new B();
		aa.funA(); // A class funA()출력
		//B클래스가 A클래스에 있는 funA메소드를 재정의하면 그 떄는 B클래스 안 funA가 실행됨

	}

}
