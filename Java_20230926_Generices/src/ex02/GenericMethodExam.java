package ex02;

class Box<T>{
	private T ob;
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {return this.ob;} 
}

class BoxFactory {
	public static <T extends Number> Box<T> makeBox(T o){
		Box<T> box = new Box<T>();
		box.set(o);
		
		System.out.println("Boxed data : " + o.intValue());
		return box;
	}
}


class Unboxer{
	public static <T extends Number> T openBox(Box<T> box) {
		System.out.println("UnBoxed data : " + box.get().intValue());
		return box.get();
	}

}

public class GenericMethodExam {
	public static void main(String[] args) {
		Box<Integer> sbox = BoxFactory.makeBox(9898);
		int n = Unboxer.openBox(sbox);
		System.out.println(n);
		
	}
}
