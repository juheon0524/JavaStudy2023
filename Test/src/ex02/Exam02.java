package ex02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
//		Java 점수를 입력받아서 학점을 구하는 프로그램 구현..
//		90이상 => A, 80 =>B, 70=>C, 60 =>D , F
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt()/10;
		char grade[] = {'f','f','f','f','f','f','d','c','b','a','a'};	
		System.out.println(grade[score] + " 학점입니다.");
	}

}
