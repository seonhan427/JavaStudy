package week3;

import java.util.Scanner;
public class age {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("나이를 입력하시오: ");
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
