package ex08;

public class SoundableExam {
//	public static void main(String[] args) {
//		Soundable sou = new Cat();
//		sou.sound();	
//		sou = new Dog();
//		sou.sound();	
//	}
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
