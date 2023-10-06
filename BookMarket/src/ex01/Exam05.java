package ex01;

public class Exam05 {
	public static void main(String[] args) {
		for(int i = 1; i < 31; i++) {
			if(i%2 == 0) {
				System.out.printf("%d\t  ", i);
				if(i%3==0) {
					System.out.println();
				}
			}
		}
	}
}
