package week3;

import java.util.Scanner;
public class age2 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("나이를 입력하시오: ");
		int age = input.nextInt();
		int adult = 20;
		
		int agegroup = age/10;
		
		switch(agegroup)
		{
		case 0:
			int result = adult-age;
			System.out.println(result+" years later");
			break;
		case 1:
			int result1 = adult-age;
			System.out.println(result1+" years later");
			break;
		default:
			System.out.println("adult");
		}
		input.close();
	}
}
