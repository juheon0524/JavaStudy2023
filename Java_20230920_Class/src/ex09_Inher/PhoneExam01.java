package ex09_Inher;

public class PhoneExam01 {
	public static void main(String[] args) {
		Phone p = new Phone("apple", "V11");
		
		p.bell();
		p.sendVoice("놀자 ......");
		p.hangUp();
		
		SmartPhone s = new SmartPhone("samsung","Zplip",true);
		
	}
}
