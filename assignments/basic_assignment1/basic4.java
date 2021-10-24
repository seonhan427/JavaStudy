package basic_assignment1;

import java.util.Scanner;

public class basic4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		System.out.println("sum = " + (num1+num2+num3) + "\navg = " + (num1+num2+num3)/3);
		
		in.close();
	}
}
