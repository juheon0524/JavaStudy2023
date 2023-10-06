package ex01_1;

class Box<T>{
	private T ob;
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {return this.ob;} 
}


class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}

}

public class GenericMethodExam {
	public static void main(String[] args) {
		Box<String> sbox = new Box<String>();
		sbox.set("Sweet");
		String str = Unboxer.openBox(sbox);
		System.out.println(str);
	}
}
