package ex01;

public class Exam03 {
	public static void main(String[] args) {
		char even [] = {'A', 'B', 'C','D','E','F','G','H','I','J','K','L','M','N'};
		for(int i=0; i < even.length; i++) {
			if(even[i] % 2 == 0) {
				System.out.print(even[i] + "  ");
			}
		}		
	}
}
