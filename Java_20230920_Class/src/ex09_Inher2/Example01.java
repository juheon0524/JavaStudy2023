package ex09_Inher2;

public class Example01 {
	public static void main(String[] args) {
		BabyCat babyCat = new BabyCat("샴고양이","초콜릿색");
		
		babyCat.eat();
		babyCat.meow();
		System.out.println(babyCat.bread);
		System.out.println(babyCat.color);
	}
}
