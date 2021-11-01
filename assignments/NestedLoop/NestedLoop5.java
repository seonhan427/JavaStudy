package NestedLoop;

import java.util.Scanner;

public class NestedLoop5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		for (int x = num; x > 0; x--) {
			for (int y = num - x; y > 0; y--) {
				System.out.print(" ");
			}
			for (int z = x * 2 - 1; z > 0; z--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		in.close();
	}
}
