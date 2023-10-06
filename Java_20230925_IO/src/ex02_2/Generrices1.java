package ex02_2;


class Apple{
	public String toString() {
		return "I am on apple";
	}
}


class Orange {
	public String toString() {
		return "I am on Orange";
	}
}

class Box<T>{
	private T obj;
	void setObj(T obj) {
		this.obj = obj;
	}
	T getObj() {
		return obj;
	}
}


public class Generrices1 {	
	public static void main(String[] args) {
		
		Box<Apple> aBox = new Box<Apple>() {};
		aBox.setObj(new Apple());
		System.out.println(aBox.getObj());
		
//		Box abox = new Box();
//		abox.setObj(new Apple());
//		System.out.println(abox.getObj());
//		abox.setObj(new Orange());
//		System.out.println(abox.getObj());
	}

}
