package ex02_3;


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

class Box<T extends Number>{
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
		
//		Box<String> aBox = new Box();
	}

}
