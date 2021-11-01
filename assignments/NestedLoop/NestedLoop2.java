package NestedLoop;

import java.util.Scanner;

public class NestedLoop2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num1 = in.nextInt();
		int num2 = in.nextInt();

		if (num1 > num2) {
			for (int x = 1; x <= 9; x++) {
				for (int y = num1; y >= num2; y--) {
					System.out.print(y + " * " + x + " = " + y * x + "   ");
				}
				System.out.println("");
			}

		} else if (num1 < num2) {
			for (int x = 1; x <= 9; x++) {
				for (int y = num1; y <= num2; y++) {
					System.out.print(y + " * " + x + " = " + y * x + "   ");
				}
				System.out.println("");
			}
		} else if (num1 == num2) {
			for (int x = 1; x <= 9; x++) {
				System.out.println(num1 + " * " + x + " = " + num1 * x + "   ");
			}

		}
		else {
			System.out.println("error");
		}

		in.close();
	}
}
	