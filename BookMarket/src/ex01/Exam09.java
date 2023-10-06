package ex01;

public class Exam09 {
	public static void main(String[] args) {
		int score = 0;
		int sum = 0;
		for(int i = 100; i < 1000; i++) {
			if(i % 4 != 0) {
				sum += i;
				score++;
			}		
		}
		System.out.println("갯수 : " + score);
		System.out.println("합 : " + sum);
	}
}
