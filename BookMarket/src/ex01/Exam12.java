package ex01;

public class Exam12 {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i < 1000; i++) {
			if(i % 7 == 0) {
				sum1 += i;
			}	
			if(i % 9 == 0) {
				sum2 += i;
			}	
		}
		
		int result = Integer.valueOf(sum1) + Integer.valueOf(sum2);

		System.out.println("7의 배수 합 : " + sum1);
		System.out.println("9의 배수 합 : " + sum2);
		System.out.println("7의 배수 합 + 9의 배수 합 : " + result);
	}
}
