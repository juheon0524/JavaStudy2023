package ex02;

public class Exam12 {
	public static void main(String[] args) {
		addition(3,4);
		int result = subtraction(5,2);
		System.out.println("빼기 : " + result);
	}
	
	public static void addition(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("더하기 : " + sum);
	}
	
	public static int subtraction(int num1, int num2) {
		int result = num1 - num2;	
		return result;	
	}
	
}
