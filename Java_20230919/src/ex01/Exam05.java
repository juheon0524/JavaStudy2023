package ex01;

import java.util.Arrays;

public class Exam05 {
	public static void main(String[] args) {
		// 1.랜덤을 이용해서 5명 학생 점수를 입력받는다.
		// 2.5명 점수 총점과 평균을 구한다.
		int myArr[] = new int[5];
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 0;
		
		
		for(int i=0; i<myArr.length; i++) {
			int num = (int)((Math.random()*100)+1);	
			if(i==0) {min=num;}
			myArr[i] = num;
			sum += num;	
			if(max<num) {max=num;}
			if(min>num) {min=num;}
			System.out.print(num + " ");
		}
		
	
		avg =(double)sum/myArr.length;
		System.out.println();
		System.out.println("5명 학생의 총점 : "+ sum);
//		System.out.println("5명 학생의 평균 : "+ avg);
		System.out.printf("5명 학생의 평균 : %.2f\n",avg);
		// 최대값 , 최소값
		System.out.println("5명 학생의 최대값 : " + max);
		System.out.println("5명 학생의 최소값 : " + min);
		//오름차순
		for(int i=0; i<myArr.length; i++) {
			boolean flag = false;
			for(int j=0; j<myArr.length-1; j++) {
				if(myArr[j]>myArr[j+1]) {
					int tmp = myArr[j];
					myArr[j] = myArr[j+1];
					myArr[j+1] = tmp;
					flag = true;
				}
			}
			if(!flag) break;
		}
		
//		Arrays.sort(myArr);
		System.out.println("오름차순 : " + Arrays.toString(myArr));
				
	}
}
