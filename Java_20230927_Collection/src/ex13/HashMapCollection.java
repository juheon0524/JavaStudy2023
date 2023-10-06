package ex13;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.LinkedTransferQueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


public class HashMapCollection {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap();
		
		map.put(45, "Toy1");
		map.put(35, "Robot");
		map.put(25, "Box");
		map.put(15, "Toy2");
		map.put(45, "Toy3");
		System.out.println(map.get(45));
		
		Set<Integer> keySet = map.keySet();
		
		for(int i : keySet)
			System.out.print(i + " ");
		
		System.out.println("\n-------------------");
		for(int i : keySet)
			System.out.print(map.get(i) + " ");
		System.out.println();
		
		Iterator<Integer> itr = keySet.iterator();
		while(itr.hasNext())
			System.out.println(map.get(itr.next()));
	}
}
