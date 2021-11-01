package loop;

import java.util.Scanner;

public class loop3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int count = 1;
		while (count <=10) {
			int result = num * count;
			System.out.print(result + " ");
			count++;
		}
		in.close();
		
	}
}
