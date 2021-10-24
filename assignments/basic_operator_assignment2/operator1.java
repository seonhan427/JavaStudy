package basic_operator_assignment2;

import java.util.Scanner;

public class operator1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int num2 = in.nextInt();
		
		int i = num>num2 ? 1 : 0;
		int i2 = num<num2 ? 1 : 0;
		int i3 = num>=num2 ? 1 : 0;
		int i4 = num<=num2 ? 1 : 0;
		
		System.out.println(num + " > " + num2 + " --- " + i);
		System.out.println(num + " < " + num2 + " --- " + i2);
		System.out.println(num + " >= " + num2 + " --- " + i3);
		System.out.println(num + " <= " + num2 + " --- " + i4);
		
		in.close();
		
	}

}
