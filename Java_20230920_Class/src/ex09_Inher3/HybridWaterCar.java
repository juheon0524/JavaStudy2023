package ex09_Inher3;

public class HybridWaterCar extends HybridCar {
	int waterGuage;
	public HybridWaterCar(int i, int j, int k) {
		super(i, j);
		this.waterGuage = k;
	}
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : " + gasolineGauge);
		System.out.println("잔여 전기량 : " + electricGuage);
		System.out.println("잔여 워터량 : " + waterGuage);
	}
}
