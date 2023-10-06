package ex03;

public class TVTest {
	public static void main(String[] args) {
		
		TV tv = new TV(10);
		System.out.println(tv.channel);
		
		TV tv2 = new TV("black", false, 7);
		System.out.println(tv2.color);
		System.out.println(tv2.power);
		System.out.println(tv2.channel);
		
	}
}
