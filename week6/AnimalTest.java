package week6;

abstract class Animal {
	public abstract void sound();
}

class cat extends Animal{
	public void sound() {
		System.out.println("具克具克");
	}
}

class dog extends Animal{
	public void sound() {
		System.out.println("港港");
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
