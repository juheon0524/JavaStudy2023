package ex01;

//1차원 배열 =String
public class Exam04 {
	public static void main(String[] args) {
		int[] myArr = new int[5];
		String[] myStr = new String[3];
		
//		int[]myArr2 = {10,20,30,40,50}; => 초기화 자바에서는 배열의 초기화를 선언하지 않으면 기본값이 나온다.
//		ex)int 의 기본값은 0, String의 초기값은 null이다.
	
		
		for(int i=0; i<myArr.length; i++) {
			myArr[i]=(int)(Math.random()*45)+1;
		}
		
		for(int i=0; i<myArr.length; i++) {
			System.out.println(myArr[i]);
		}
		
		for(int i=0; i<myArr.length; i++) {
			System.out.println(myStr[i]);
		}
	}
}
