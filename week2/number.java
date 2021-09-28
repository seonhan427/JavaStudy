package week2;

import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		int num1 = input.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오: ");
		int num2 = input.nextInt();
		
		int sum = num1+num2;
		
		System.out.println(sum);
		
		input.close();
	}

}
