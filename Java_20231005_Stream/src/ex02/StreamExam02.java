package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class PriceInfo {
	private String model;
	private int price;
	
	public PriceInfo(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	public String getModel() {return model;}
	public int getPrice() {return price;}
}

public class StreamExam02 {

	public static void main(String[] args) {
		List<PriceInfo> lists = new ArrayList<PriceInfo>();
		lists.add(new PriceInfo("Toy", 500));
		lists.add(new PriceInfo("Robot", 1500));
		lists.add(new PriceInfo("Box", 700));
		lists.add(new PriceInfo("String", 1200));
		lists.add(new PriceInfo("Servlet", 1000));
		lists.add(new PriceInfo("Java", 700));
		
		int sum = lists.stream().filter(p->p.getPrice()>500).mapToInt(t->t.getPrice()).sum();
		System.out.println(sum);
		System.out.println("=====================");
		
		lists.stream().filter(p->p.getModel().length()>3)
		.map(t->t.getModel())
		.forEach(p->System.out.println(p));
		
		System.out.println("=====================");
		lists.stream().filter(p -> p.getModel().length() > 3)
	    .forEach(p -> System.out.printf("모델: %-8s, 가격: %d%n", p.getModel(), p.getPrice()));


		
		
		
		
		
	}

}
