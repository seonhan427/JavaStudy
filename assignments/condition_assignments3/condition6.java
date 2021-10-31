package condition_assignments3;

import java.util.Scanner;

public class condition6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int year = in.nextInt();
		String result = "";
		
		if(year % 400 == 0) {
			result = "leap year";
		}else if (year % 4 == 0 && year % 100 != 0) {
			result = "leap year";
		}
		else {
			result = "common year";	
		}
		
		System.out.println(result);
		
		in.close();
		
		
	}
	
}
