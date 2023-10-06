package ex02;

public class Polymorphism02 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal pig = new Pig();
		Animal dog = new Dog();
		animal.animalSound();
		pig.animalSound();
		dog.animalSound();
	}
}
