package ex01;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		System.out.print("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int sum =0;
		for(int i=0; i<=val; i++) {
			sum += i;
		}
		System.out.print("1부터 ~ " + val + "까지의 합 : ");
		System.out.println(sum);
	}
}
