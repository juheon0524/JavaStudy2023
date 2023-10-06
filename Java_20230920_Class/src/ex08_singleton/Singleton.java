package ex08_singleton;

public class Singleton {
	
	public static Singleton singleton = new Singleton();

	int apple = 100;
	
	public Singleton() {

	}

	public static Singleton getSingleton() {
		return singleton;
	}
	
	
	
	
}
