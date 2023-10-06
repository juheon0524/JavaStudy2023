package ex02;

public class TV {
	String color;
	boolean power;
	int channel;
	TV(){
		System.out.println("기본 생성자");
	}
	TV(int n){
		System.out.println("1개 변수");
	}
	TV(String string, int n){
		System.out.println("2개 변수");
	}
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
