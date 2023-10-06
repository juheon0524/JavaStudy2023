package ex10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


public class TreeSetExam {

	public static void main(String[] args) {
		Set<Integer> tree = new TreeSet<Integer>();
		
		tree.add(3);
		tree.add(2);
		tree.add(7);
		tree.add(4);
		
		for(int num : tree)
			System.out.println(num);
	}
}
