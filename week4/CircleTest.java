package week4;

class Circle{ 
	int radius;
	String color;
	
	double calcArea() {
		return 3.14 * radius * radius;
		
	}
} // Ŭ���� ����

public class CircleTest {
	public static void main(String[] args) {
		Circle obj;  // ���� ���� ����
		obj = new Circle();  // ��ü ����
		obj.radius = 100;
		obj.color = "blue";
		double area = obj.calcArea(); // ��ü�� �޼ҵ� ����
		System.out.println("���� ���� = " + area);
		
	}
}
//�����ڴ� Ŭ������ ���� �����ɶ� ���� �ʱ�ȭ ���ش�.
