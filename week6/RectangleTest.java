package week6;

class Shape{
	public Shape(String msg) {
		System.out.println("Shape ������()");
	}
}

class Rectangle extends Shape{
	public Rectangle() {
		super("");  //default ������
		System.out.println("Rectangle ������()");
	}
	
}

public class RectangleTest {
	public static void main(String[] args) {
	Rectangle r = new Rectangle();
	}
}
