package ex06;

import java.util.function.Function;

public class Lamda9 {
	public static void main(String[] args) {
		Function<int[], Integer> ee = (int[] arr) -> {
			int sum = 0;
			for(int i : arr)
				sum +=i;
			return sum;
		};
		System.out.println(ee.apply(new int[] {1,2,3,4,5}));
	}
}
