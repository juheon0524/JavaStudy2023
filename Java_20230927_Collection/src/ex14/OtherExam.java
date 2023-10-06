package ex14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
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


public class OtherExam {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		int[] intNum = new int[5];
		int[] intNum2 = {10,20,30,40,50};
		
		List<Integer> list2 = Arrays.asList(10,20,30,40,50);
		for(int i : list2)
			System.out.print(i + " ");
		
		System.out.println();
		List<String> list3 = Arrays.asList("Toy", "Box", "Robot");
		for(String i : list3)
			System.out.print(i + " ");
		System.out.println();
//		list3.add("Box"); 사용불가 Arrays.asList 추가 안됨
		List<String> list4 = Arrays.asList("Toy", "Box", "Robot");
		
		List<String> list5 = new ArrayList<String>(list4);
		list5.add("Box");
		list5.add("Robot");
		
		for(String s : list5)
			System.out.print(s + " ");
	}
}
