package week6;

public class child extends parent {
	public void print() {
		
		System.out.println("�ڽ� Ŭ������ print() �޼ҵ� ");
		super.print();
	}
	public static void main(String[] args) {
		child obj = new child();
		obj.print();
	}
}
