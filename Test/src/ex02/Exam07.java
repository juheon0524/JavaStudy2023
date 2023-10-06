package ex02;

public class Exam07 {
    public static void main(String[] args) {
        
        int count = 0; // 경우의 수를 세기 위한 변수

        // 두 개의 주사위를 던져 가능한 모든 조합을 확인
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                int sum = i + j;
                if (sum == 6) {
                    System.out.println("주사위 1: " + i + ", 주사위 2: " + j);
                    count++;
                }
            }
        }

        System.out.println("눈의 합이 6인 경우의 수: " + count + "가지");
}
}