package ex02_1;


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

class Box{
	private Object obj;
	void setObj(Object obj) {
		this.obj = obj;
	}
	Object getObj() {
		return obj;
	}
}


public class Generrices1 {	
	public static void main(String[] args) {
		
		Box aBox = new Box(); //apple
		Box oBox = new Box(); //orange
		
		aBox.setObj(new Apple());
		oBox.setObj(new Orange());
		
		Object o = oBox.getObj();
		Apple a1 = (Apple)aBox.getObj();
		Orange o1 = (Orange)oBox.getObj();
		
		System.out.println(o.toString());
		System.out.println(a1.toString());
		System.out.println(o1.toString());
		
	}

}
