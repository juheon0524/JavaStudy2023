package ex02;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		
	      Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("원하는 번호를 입력하세요: ");
	        
	        int choice = scanner.nextInt();
	        
	        switch (choice) {
	            case 1:
	                System.out.println("선택 > 1 ");
	                System.out.println("예금액 > 10000");
	                break;
	            case 2:
	            	System.out.println("선택 > 2 ");
	                System.out.println("출금액 > 2000");
	                break;
	            case 3:
	            	System.out.println("선택 > 3 ");
	                System.out.println("잔고 > 8000");
	                break;
	            case 4:
	            	System.out.println("선택 > 4 ");
	                System.out.println("프로그램 종료");
	                break;
	            default:
	                System.out.println("잘못된 선택입니다. 1, 2, 3, 4 중 하나를 입력하세요.");
	                break;
	        }
	        
	        scanner.close();
		
	}
}
