package loop;

import java.util.Scanner;

public class loop5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			int num = in.nextInt();
			
			
			if (num % 3 != 0 && num % 5 != 0) {
				count++;
			}
			else if (num == 0) {
				System.out.println(count);
				break;
			}
		}
		in.close();
		
	}

}
