package NestedLoop;

import java.util.Scanner;

public class NestedLoop9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int count = 1;
		
		for (int x = 1; x <=num; x ++) {
			for (int y = 1; y <= num; y++) {
				System.out.print(count + " ");
				count+=2;
				if (count > 9) {
					count = 1;
				}
			}
			System.out.println("");
				
		}
		in.close();
	}

}
