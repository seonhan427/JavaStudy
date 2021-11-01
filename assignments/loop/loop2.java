package loop;

import java.util.Scanner;

public class loop2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int result = 0;
		
		if (num >100 || num < 0) {
			System.out.println("Enter 100 or less");
			}
		else {
			while(num < 101) {
				result += num;
				num++;
			}
			System.out.println(result);
			}
		in.close();
	}
}