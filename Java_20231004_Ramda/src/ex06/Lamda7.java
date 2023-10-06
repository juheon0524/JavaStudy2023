package ex06;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lamda7 {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = x -> x*x;
		System.out.println(f1.apply(5));
		System.out.println();
	
		BiFunction<Integer, Integer, Integer> bif2 = (x,y) -> x-y;
		System.out.println(bif2.apply(10, 1));
	}
}
