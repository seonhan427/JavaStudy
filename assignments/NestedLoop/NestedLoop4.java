package NestedLoop;

import java.util.Scanner;

public class NestedLoop4 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		for(int x = 1; x < num + 1; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		in.close();
	}

}
