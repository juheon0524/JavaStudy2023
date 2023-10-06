package ex05_6;
class Box<T>{
	private T ob;
	public void set(T ob) {this.ob = ob;}
	public T get() {return this.ob;}
	
	@Override
	public String toString() {return ob.toString();}
}

class Toy {
	@Override
	public String toString() {return "I am a Toy";}
}

class BoxHandler {		// 상한제한 ==> 목적 ==> get가능 .. set불가
	public static void outBox(Box<? extends Toy> box) {
		Toy t = box.get();
		System.out.println(t);
//		box.set(new Toy());
	}					// 하한제한 ==> 목적 ==> get불가 .. set가능
	public static void inbox(Box<? super Toy>box, Toy n) {
		box.set(n);
//		Toy n2 = box.get();
	}
}


public class WildCardUnBox {

	public static void main(String[] args) {
		Box<Toy> box = new Box();
		BoxHandler.inbox(box, new Toy());
		BoxHandler.outBox(box);
	}
}
