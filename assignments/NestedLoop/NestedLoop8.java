package NestedLoop;

import java.util.Scanner;

public class NestedLoop8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int count = 1;
		
		for (int x = 0; x < num; x++) {
			for(int y = 0; y < x; y++) {
				System.out.print("  ");
				}
			for(int z = 0; z < num-x; z++) {
				System.out.print(count+ " ");
				count++;
			}
			System.out.println("");
		}
		in.close();
		
	}
}
