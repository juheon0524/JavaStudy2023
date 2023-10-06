package ex05;

public class Test {
	static int age;
	static String name;
	static String address;
	
	static {
		age = 10;
		name = "kim";
		address = "수원시";
	}
	public static void main(String[] args) {
		
		System.out.println(age);
		System.out.println(name);
		System.out.println(address);
	}
	
	static int sum(int ...values) {
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum+=values[i];
			
		}
		return sum;
	}
}

class A {
	void func() {
		Test.sum(1,2,3);
	}
}