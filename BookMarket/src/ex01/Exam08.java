package ex01;

public class Exam08 {
	public static void main(String[] args) {
		int score = 0;
		int sum = 0;
		for(int i = 100; i < 1000; i++) {
			if(i % 7 == 0) {
				sum += i;
				score++;
			}		
		}
		System.out.println("7의 배수 갯수 : " + score);
		System.out.println("7의 배수 합 : " + sum);
	}
}
