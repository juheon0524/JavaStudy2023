package ex01;

public class Exam11 {
	public static void main(String[] args) {
		
		for(int i = 1; i < 101; i++) {
			if(i % 3 == 0) {
				if(i % 5 == 0) {
					System.out.print(i + " ");
				}		
			}	
		}
	}
}
