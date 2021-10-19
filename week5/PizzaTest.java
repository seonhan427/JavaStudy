package week5;


class Pizza {
	int radius;
	Pizza(int r){
		radius = r;
	}
	Pizza whosLargest(Pizza p2) {
		if(this.radius > p2.radius) {
			return this;
		}
		else {
			return p2;
		}
	}
}

public class PizzaTest{
	public static void main(String[] args) {
		Pizza obj1 = new Pizza(14);
		Pizza obj2 = new Pizza(18);
		
		Pizza largest = obj1.whosLargest(obj2);
		System.out.println(largest.radius + "인치 피자가 더큼.");
	}
	
}