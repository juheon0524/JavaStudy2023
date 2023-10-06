package ex11;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.LinkedTransferQueue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


public class LinkedListQueue {

	public static void main(String[] args) {
//		Queue<String> queue = new LinkedList<String>();
//		Queue<String> queue = new ArrayDeque<String>();
		Queue<String> queue = new LinkedTransferQueue<String>();
		queue.add("Toy");
		queue.offer("Box");
		queue.offer("Robot");
		queue.offer("Toy");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println("====================");
		for(String s : queue)
			System.out.println(s);
		
		System.out.println("====================");
		for(String s : queue)
			System.out.println(s);
		
		System.out.println("====================");
		System.out.println(queue.peek());
		
		System.out.println("====================");
		for(String s : queue)
			System.out.println(s);
	}
}
