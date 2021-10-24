package condition_assignments3;

import java.util.Scanner;

public class condition1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		if(num == 0) {
			System.out.println("zero");
		}
		else if (num > 0) {
			System.out.println("plus");
		}
		else {
			System.out.println("minus");
		}
		in.close();
	}

}
