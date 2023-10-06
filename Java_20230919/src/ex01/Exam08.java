package ex01;

public class Exam08 {
	public static void main(String[] args) {
		int[] numA = new int[10];
		int val = 0;
		
		for(int i = 0; i < numA.length; i++) {
			numA[i] = (int)(Math.random()*10);
			
		}
		
		for(int i=0; i<numA.length; i++) {
			System.out.print(numA[i] + " ");		
		}
		
		
		System.out.println();
		for(int i=0; i<numA.length; i++) {
			val=0;
			for(int j=0; j<numA.length; j++) {
				if(numA[j]==i) {
					val++;
				}
			}
			System.out.println(i + " 의 갯수 : " + val);
		}
	}
}
