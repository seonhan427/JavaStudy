package loop;

import java.util.Scanner;

public class loop4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int count = 1;
		int result = 0;

		if (num > 100 || num < 0) {
			System.out.println("Enter 100 or less");
		} else {
			while (count <= num) {
				result += count;
				count++;
			}
			System.out.println(result);
		}
		

		in.close();
	}
}
