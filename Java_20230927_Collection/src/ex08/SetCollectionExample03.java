package ex08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
class Car{
	private String model;
	private String color;
	
	@Override
	public String toString() {
		return model + ": " + color;
	}
	
	@Override
	public int hashCode() {
		return (model.hashCode()+color.hashCode())/2;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		String _model = ((Car)obj).model;
		String _color = ((Car)obj).color;

//		if(model.equals(_model) && color.equals(_color))
//			return true;
//		else
//			return false;
		return 
		model.equals(_model) && color.equals(_color)?true : false;
	}
}
public class SetCollectionExample03 {

	public static void main(String[] args) {
		Set<Car> set = new HashSet<Car>();
		set.add(new Car("소나타", "흰색"));
		set.add(new Car("그랜져", "검정색"));
		set.add(new Car("소나타", "검정색"));
		set.add(new Car("제네시스", "흰색"));
		set.add(new Car("제네시스", "검정색"));
		set.add(new Car("소나타", "검정색"));
		
		Iterator<Car> itr = set.iterator();
		while(itr.hasNext()) {
			Car c = itr.next();
			System.out.println(c.toString());
		}
		System.out.println("=========================");
		
		for(Car car : set)	
			System.out.println(car);
	}

}
