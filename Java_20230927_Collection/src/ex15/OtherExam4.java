package ex15;

import java.util.*;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class Person implements Comparable{
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return name + "(" + age + ")";
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
//		if(this.age > p.age)
//			return 1;
//		else if(this.age < p.age)
//			return -1;
//		else
//			return 0;
		
//		return this.age - p.age;
		return p.age - this.age;
	}
}

public class OtherExam4 {

	public static void main(String[] args) {
//		Person[] persons = {new Person("조조", 20), new Person("유비", 30), new Person("관우", 35)};
		Person[] persons = new Person[3];
		persons[0] = new Person("조조", 40);
		persons[1] = new Person("유비", 30);
		persons[2] = new Person("관우", 35);
		
		Arrays.sort(persons);
		for(Person p : persons)
			System.out.println(p);
	}

}
