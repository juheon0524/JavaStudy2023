package ex01;

//1차원배열
public class Exam03 {
	public static void main(String[] args) {
		int myArr[] = new int[5];
		
		for(int i=0; i<myArr.length; i++) {
			int num = (int)((Math.random()*100)+1);
			myArr[i] = num;
		}
		
		for(int i=0; i<myArr.length; i++) {
			System.out.println(myArr[i]);
		}
	}
}
