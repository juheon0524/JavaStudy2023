package ex04;

public class TV {
	String color;
	boolean power;
	int channel;
	// 생성자의 역할 : 맴버변수 초기화 이용될 수 있다.
	TV(){
		this("white",11,false);
		System.out.println("기본 생성자");
	}
	TV(int channel){
		this("white",channel,false);
	}
	TV(String color){
		this(color,11,false);
	}
	
	TV(String color, int channel ,boolean power ){
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
