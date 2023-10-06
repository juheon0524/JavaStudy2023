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


public class OtherExam2 {

	public static void main(String[] args) {
		int[] ar = {1,7,3,7,8,9,10,2,4};
		
		for(int i : ar)
			System.out.print(i + " ");
		System.out.println();
		System.out.println();
		
		Arrays.sort(ar);
		for(int i : ar)
			System.out.print(i + " ");
		System.out.println();
		String[] str = {"Box", "Toy", "toy", "Robot", "box", "robot"};
		Arrays.sort(str);
		for(String s : str)
			System.out.print(s + " ");
	}
}
