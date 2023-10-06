package ex05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class SetCollectionExample {

	public static void main(String[] args) {
		Set<String> list = new HashSet<String>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		for(String s : list)
			System.out.println(s);
		System.out.println("=============");
		
		Iterator<String> itr = list.iterator(); //반복자 획득
		String str;
		while(itr.hasNext()) {
			str = itr.next();
			if(str.equals("Box"))
				itr.remove();
			System.out.println(str);
		}
		System.out.println("===============");
		itr = list.iterator(); //반복자 획득
		while(itr.hasNext()) {
			str = itr.next();
			System.out.println(str);
		}
		
	}

}
