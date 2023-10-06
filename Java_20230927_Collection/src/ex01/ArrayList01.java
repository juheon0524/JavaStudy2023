package ex01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i = 0 ; i < list.size(); i++) 
			System.out.println(list.get(i));
	
		System.out.println("================");
		for(String s : list)
			System.out.println(s);
		list.remove(0);
		
		System.out.println("================");
		for(String s : list)
			System.out.println(s);
		list.add(1, "Toy");
		
		System.out.println("================");
		for(String s : list)
			System.out.println(s);
	}

}
