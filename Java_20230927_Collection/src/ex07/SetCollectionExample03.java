package ex07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

class Num{
	private int num;
	public Num(int num) { this.num = num; }
	
	@Override
	public String toString() { return num + ""; }
	
	@Override
	public int hashCode() {
		return num % 3;
	}
	
	@Override
	public boolean equals(Object obj) {
//		if(num == ((Num)obj).num)
//			return true;
//		else
//			return false;
		return num == ((Num)obj).num ? true : false;
	}
}
public class SetCollectionExample03 {

	public static void main(String[] args) {
		Set<Num> set = new HashSet<>();
		
		set.add(new Num(9999));
		set.add(new Num(8888));
		set.add(new Num(7777));
		set.add(new Num(9999));
		
		Iterator<Num> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
