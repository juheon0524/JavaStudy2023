package ex02;

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

class AppleBox{
	private Apple ap;
	void setApple(Apple ap) {
		this.ap = ap;
	}
	Apple getApple() {
		return ap;
	}
}

class OrangeBox{
	private Orange op;
	void setOrange(Orange ap) {
		this.op = ap;
	}
	Orange getOrange() {
		return op;
	}
}


public class Generrices1 {	
	public static void main(String[] args) {
		AppleBox abox = new AppleBox();
		OrangeBox obox = new OrangeBox();
		
		abox.setApple(new Apple());
		obox.setOrange(new Orange());
		
		Apple a = abox.getApple();
		Orange o = obox.getOrange();
		System.out.println(a);
		System.out.println(o.toString());
	}

}
