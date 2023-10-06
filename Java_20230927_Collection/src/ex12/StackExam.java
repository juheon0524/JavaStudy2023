package ex12;

import java.util.ArrayDeque;
import java.util.ArrayList;
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


public class StackExam {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(11);
		stack.push(9);
		stack.push(10);
		stack.push(15);
		
		stack.pop();
		System.out.println("==========");
		for(int i : stack)
			System.out.println(i);
	}
}
