package ex01;

public class Exam10 {
	public static void main(String[] args) {
		int even = 0;
		int odd = 0;
		for(int i = 1; i < 31; i++) {
			if(i % 2 == 0) {
				even += i;
			}	
			if(i % 2 == 1) {
				odd += i;
			}
		}
		System.out.println("짝수합 : " + even);
		System.out.println("홀수합 : " + odd);
	}
}
