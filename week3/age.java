package week3;

import java.util.Scanner;
public class age {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���̸� �Է��Ͻÿ�: ");
		int age = input.nextInt();
		int adult = 20;
		
		
		if(age >= adult)
			System.out.println("adult");
		else {
			int result = adult - age;
			System.out.println(result + " years later");
		}
		input.close();
	}
}
