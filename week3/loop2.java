package week3;

import java.util.Scanner;

public class loop2 {
	public static void main(String[] args) {
		
		int num;
		int result;
		System.out.printf("양의 정수를 입력하시오: ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			result = num % i;
			if (result == 0)
				System.out.print(i +" ");
		}
		input.close();
	}
}
