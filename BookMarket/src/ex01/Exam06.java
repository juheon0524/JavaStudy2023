package ex01;

public class Exam06 {
	public static void main(String[] args) {
		int even = 0;
		int odd = 0;
		for(int i = 1; i < 11; i++) {
			if(i % 2 == 0) {
				even += i;
				System.out.print(i);
				if (i != 10) {
	                System.out.print("-");
	            }
			}
			if(i % 2 != 0) {
				odd += i;
				System.out.print(i + "+");
			}
		}
		System.out.print("까지의 합 : ");
		System.out.println(odd-even);
	}
}
