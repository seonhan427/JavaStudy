package week6;

public class child extends parent {
	public void print() {
		
		System.out.println("자식 클래스의 print() 메소드 ");
		super.print();
	}
	public static void main(String[] args) {
		child obj = new child();
		obj.print();
	}
}
