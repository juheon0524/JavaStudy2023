package ex02;

public class Exam08 {
	public static void main(String[] args) {
		/*문자열이 "12345"이면 개별문자로 분리해서 합을 구하는 프로그램 구현
		 * String클래스 charAt(int i)을 이용*/
		
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i)-'0';
		}
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(0)+str.charAt(1));
		System.out.println("sum : " + sum);
	}
}
