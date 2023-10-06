package ex03;

public class TV {
	String color;
	boolean power;
	int channel;
	// 생성자의 역할 : 맴버변수 초기화 이용될 수 있다.
	TV(){
		System.out.println("기본 생성자");
	}
	TV(int channel){
		this.channel = channel;
	}
	TV(String color, boolean power, int channel){
		this.color = color;
		this.power = power;
		this.channel = channel;
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
