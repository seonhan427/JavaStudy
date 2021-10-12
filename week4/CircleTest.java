package week4;

class Circle{ 
	int radius;
	String color;
	
	double calcArea() {
		return 3.14 * radius * radius;
		
	}
} // 클래스 정의

public class CircleTest {
	public static void main(String[] args) {
		Circle obj;  // 참조 변수 선언
		obj = new Circle();  // 객체 생성
		obj.radius = 100;
		obj.color = "blue";
		double area = obj.calcArea(); // 객체의 메소드 접근
		System.out.println("원의 면적 = " + area);
		
	}
}
//생성자는 클래스로 부터 생성될때 값을 초기화 해준다.
