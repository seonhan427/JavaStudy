package NestedLoop;

import java.util.Scanner;

public class NestedLoop6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int count = 1;
		while(true) {
			if(num*count % 10 == 0) {
				System.out.println(num*count);
				break;
			}
			else {
				System.out.print(num*count + " ");
			}
			count++;
		}
		

		in.close();
	}

}
