package week2;

import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�: ");
		int num1 = input.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�: ");
		int num2 = input.nextInt();
		
		int sum = num1+num2;
		
		System.out.println(sum);
		
		input.close();
	}

}
