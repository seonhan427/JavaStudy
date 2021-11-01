package NestedLoop;

import java.util.Scanner;

public class NestedLoop1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int add = 0;
		int count = 0;
		int result = 0;
		
		while (result < num) {
			add++;
			if (add % 2 != 0) {
				result += add;
				count++;
			}
			else {
				continue;
			}
		}
		System.out.println(count + " " + result);
		
		in.close();
	}
	
}
