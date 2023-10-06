package ex04;

public class TVTest {
	public static void main(String[] args) {
		
		TV tv = new TV();
		System.out.println(tv.channel);
		System.out.println(tv.color);
		System.out.println(tv.power);
		
		System.out.println("============");
		TV tv2 = new TV("black");
		System.out.println(tv2.channel);
		System.out.println(tv2.color);
		System.out.println(tv2.power);

		
		
	}
}
