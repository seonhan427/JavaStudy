package basic_operator_assignment2;

import java.util.Scanner;

public class operator2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
	
		int result1 = num1 > num2 && num1 > num3 ? 1 : 0;
		int result2 = num1 == num2 && num1 == num3 ? 1 : 0;
		
		System.out.println(result1 +" "+ result2);
		
		in.close();
	}

}
