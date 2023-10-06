package ex01;

public class Exam07 {
public static void main(String[] args) {
		
		int[] numA = new int[45];
		
		for(int i=0; i<numA.length; i++) {
			numA[i] = i+1;
		}
		
		System.out.print("원 데이타 : ");
		for(int i=0; i<numA.length; i++) {
			System.out.print(numA[i] + " ");
		}
		
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random()*45); 
			int tmp = numA[0];
			numA[0] = numA[n];
			numA[n] = tmp;
		}
		System.out.println();
		System.out.print("섞은 데이타 : ");
		for(int i=0; i<6; i++) {
			System.out.print(numA[i] + " ");
		}
		
	}
}
