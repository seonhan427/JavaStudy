package week6;

class Animal1{
	void eat() {
		System.out.println("�԰�����...");
	}
}

class Dog extends Animal1{
	void bark() {
		System.out.println("¢������...");
	}
}

public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
}
