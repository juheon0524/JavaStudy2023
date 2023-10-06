package ex06;

@FunctionalInterface
interface Cal2 {
	int max(int num1, int num2);
}

interface Print {
	void printVar(String name, int i);
}

interface Square{
	int square(int x);
}

interface Roll {
	int roll();
}

interface Sum {
	int sumArr (int[] arr);
}

public class Lamda5 {

	public static void main(String[] args) {
		Cal2 cal = (num1, num2) -> num1 > num2 ? num1 : num2;
		int result = cal.max(15, 100);
		System.out.println(result);
		System.out.println("============");
		
		Print print = (name,i) -> {System.out.println(name + "=" + i);};
		print.printVar("juheon", 13);
		System.out.println("============");
		
		Square square = (x) -> x*x;
		int result2 = square.square(7);
		System.out.println(result2);
		System.out.println("============");
		
		Roll roll = () -> (int)(Math.random()*6);
		System.out.println(roll.roll());
		System.out.println("============");
		
		Sum sumArr = (int[] arr) -> {
				int sum = 0; 
				for(int i : arr)
					sum += i;
				return sum;
			};
		System.out.println(sumArr.sumArr(new int[] {2,4,6,8}));
		System.out.println("============");
	}

}
