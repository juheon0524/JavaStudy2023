package ex02;

public class Exam06 {
	public static void main(String[] args) {
		/*두개의 주사위를 던졌을 때, 눈의 합이 6이되는 모든 경우의 수를 출력하는 프로그램 작성*/
        int targetSum = 6; // 눈의 합이 6이 되어야 하는 경우
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 2, 3, 4, 5, 6};
        int count = 0; // 경우의 수를 세기 위한 변수

        System.out.println("눈의 합이 " + targetSum + "인 경우의 수:");

        // 두 개의 주사위를 던져 가능한 모든 조합을 확인하고 배열에 저장
        for (int A : a) {
            for (int B : b) {
                int sum = A + B;
                if (sum == targetSum) {
                    System.out.println("주사위 1: " + A + ", 주사위 2: " + B);
                    count++;
                }
            }
        }

        System.out.println("총 " + count + "가지 경우");
 	}
}
