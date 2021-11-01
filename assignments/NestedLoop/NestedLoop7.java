package NestedLoop;

import java.util.Scanner;

public class NestedLoop7 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int count = 1;
		for(int x = 1; x <= num; x++) {
			for(int y = 0; y < num-x; y++) {
				System.out.print("  ");
			}
			for(int z = num; z > num-x; z--) {
				System.out.print(count +" ");
				count++;
			}	
			count=1;
			System.out.println();
		}

		in.close();
		
	}

}
