package ex01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam11 {
	public static void main(String[] args) {
//		ArrayList a = new ArrayList();
//		LinkedList a = new LinkedList();
		List a = new ArrayList();
		a.add(10);
		a.add("kor");
		a.add(10.2);
		
		for(Object o : a) {System.out.print(o + " ");}
	}
}
