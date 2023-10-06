package ex06;

import java.util.function.Predicate;

public class Lamda10 {
	public static void main(String[] args) {
		Predicate<Integer> f1 = x -> {
			System.out.print(x + " : ");
			return x%2==0;
		};
		
		boolean flag = f1.test((int)(Math.random()*100));
		String msg = flag == true ? "짝수" : "홀수" ;
		System.out.println(msg);
	}
}
