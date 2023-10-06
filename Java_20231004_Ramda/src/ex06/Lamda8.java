package ex06;

import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.Function;

public class Lamda8 {

	public static void main(String[] args) throws Exception {
		Callable d1 = () -> (int)(Math.random()*6);
		
		System.out.println(d1.call());
	}

}
