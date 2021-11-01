package NestedLoop;

import java.util.Scanner;

public class NestedLoop7_1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int count = num*2-1;
		
		for(int x = 1; x <= num; x++) {
			System.out.print(" ".repeat(count));

			for(int z = 1; z < x+1; z++) {
				System.out.print(z + " ");
			}
			System.out.println("");
			count-=2;
		}
		in.close();
		
	}

}
