package ex03_Printjob;

import java.util.Scanner;

public class Printjob {

	public static void main(String[] args) {
		System.out.print("colortype, papersize 및 count 입력: ");
		Scanner sc = new Scanner(System.in);
		String color, size;
		int count;
		
		color = sc.next();
		size = sc.next();
		count = sc.nextInt();
		int sum = Integer.parseInt(color)*count + Integer.parseInt(size)*count;
		
		System.out.println(sum);
		sc.close();
	}

	/*
	 * public void computePrintJobCost(String[] color, String[] size, int count) {
	 * color = new String [] {"그레이스케일", "컬러"}; color[0] = "5"; color[1] = "15"; size
	 * = new String [] {"A4", "A5", "Letter", "Legal"}; size[0] = "40"; size[1] =
	 * "20"; size[2] = "30"; size[3] = "25"; }
	 */
	
	public void computePrintJobCost(String color, String size, int count) {
		if(color == "그레이스케일") {color = "5";}
		if(color == "컬러") {color = "15";}

		if(size == "A4") {size = "40";}
		if(size == "A5") {size = "20";}
		if(size == "Letter") {size = "30";}
		if(size == "Legal") {size = "25";}
	} 
}
