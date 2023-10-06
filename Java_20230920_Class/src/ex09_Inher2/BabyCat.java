package ex09_Inher2;

public class BabyCat extends ParentCat{
	public String color;
	public BabyCat(String bread, String color) {
		super(bread);
		this.color = color;
	}
	
	void meow() {
		System.out.println("야옹");
	}
}
