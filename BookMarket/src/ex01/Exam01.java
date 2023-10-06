package ex01;

public class Exam01 {
	public static void main(String[] args) {
		int even = 0;
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
				even += i;
				System.out.print(i);
				if(i!=100)
					System.out.print("+");
			}		
		}
		System.out.print("의 합 : ");
		System.out.println(even);
	}
}
