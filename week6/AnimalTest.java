package week6;

abstract class Animal {
	public abstract void sound();
}

class cat extends Animal{
	public void sound() {
		System.out.println("�߿˾߿�");
	}
}

class dog extends Animal{
	public void sound() {
		System.out.println("�۸�");
	}
}


public class AnimalTest {
	public static void main(String[] args) {
		cat c = new cat();
		dog d = new dog();
		
		c.sound();
		d.sound();
	}
}
