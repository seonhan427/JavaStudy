package week6;

class Shape{
	public Shape(String msg) {
		System.out.println("Shape 持失切()");
	}
}

class Rectangle extends Shape{
	public Rectangle() {
		super("");  //default 持失切
		System.out.println("Rectangle 持失切()");
	}
	
}

public class RectangleTest {
	public static void main(String[] args) {
	Rectangle r = new Rectangle();
	}
}
