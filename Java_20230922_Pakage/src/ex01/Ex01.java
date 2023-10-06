package ex01;

import lombok.Getter;
import lombok.Setter;

public class Ex01 {

	public static void main(String[] args) {
		String str1 = new String("이영수");
		String str2 = new String("이영수");
		
		System.out.println(str1.equals(str2));
		int i = 10;
		int j = 20;
//		System.out.println(i.equals(j));
		Integer m = new Integer(10);
		Integer n = new Integer(10);
		System.out.println(m.equals(n));
		Object obj = 10; //Object obj = new Integer(10);
		
		Person p1 = new Person("김용우", 20);
		Person p2 = new Person("김용우", 20);
		
		System.out.println(p1.equals(p2));
		
	}

}
@Getter @Setter
class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age == p.age;
	}
}
