package ex05;

public class Tire {
	public void roll() {
		System.out.println("일반 타이어가 굴러감..");
	}
}

class SubTire extends Tire {
	@Override
	public void roll() {
		System.out.println("익명2 타이어 굴러감...");
	}
}