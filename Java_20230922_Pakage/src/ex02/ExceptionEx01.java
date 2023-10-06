package ex02;

import java.util.Scanner;

public class ExceptionEx01 {
	public static void main(String[] args) {
		System.out.println("예외처리1");
		System.out.println("예외처리2");
		System.out.println("예외처리3");
		System.out.println("예외처리4");
		
		Scanner sc = new Scanner(System.in);
		System.out.println(">> 정수입력");
		
		try {
			int num = sc.nextInt();
			System.out.println(5/num);
		} catch (Exception e) {
			System.out.println("예외 내용 : " + e.getMessage() );
		} finally {
			System.out.println("예외 처리 종료!!!");
		}
		
		
		System.out.println("예외처리5");
		System.out.println("예외처리6");
		System.out.println("예외처리7");
		System.out.println("예외처리8");
		System.out.println("프로그램 종료!!!");
	}
}
