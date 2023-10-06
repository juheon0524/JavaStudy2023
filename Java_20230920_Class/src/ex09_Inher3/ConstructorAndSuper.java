package ex09_Inher3;
public class ConstructorAndSuper {
	public static void main(String[] args) {
		HybridWaterCar hwCar1 = new HybridWaterCar(4,2,3);
		hwCar1.showCurrentGauge();
		
		HybridWaterCar hwCar2 = new HybridWaterCar(9,5,7);
		hwCar2.showCurrentGauge();
	}
}
