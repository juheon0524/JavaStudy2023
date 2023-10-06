package ex02;

import java.util.Arrays;
import java.util.List;

public class ReduceExam02 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Integer sum = numbers.stream()
				.filter(i->i%2==1)
				.reduce(1, (a,b)->a*b);
		System.out.println(sum);
	}

}
