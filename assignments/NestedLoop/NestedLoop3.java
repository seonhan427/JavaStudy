package NestedLoop;

import java.util.Scanner;

public class NestedLoop3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int column = in.nextInt();
		int row = in.nextInt();
		
		for(int x = 1; x <= column; x++) {
			for(int y = 1; y <= row; y++) {
				System.out.print(x*y + " ");
			}
			System.out.println("");
		}
		in.close();
	}
}
