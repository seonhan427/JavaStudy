package condition_assignments3;

import java.util.Scanner;

public class condition4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int month = in.nextInt();
		int date = 0;
		
		switch (month) {
		
		case 1:
			date = 31;
			break;
		case 2:
			date = 28;
			break;
		case 3:
			date = 31;
			break;
		case 4:
			date = 30;
			break;
		case 5:
			date = 31;
			break;
		case 6:
			date = 30;
			break;
		case 7:
			date = 31;
			break;
		case 8:
			date = 31;
			break;
		case 9:
			date = 30;
			break;
		case 10:
			date = 31;
			break;
		case 11:
			date = 30;
			break;
		case 12:
			date = 31;
			break;
		default:
			System.out.println("error");
			break;
		
		}
		
		if(date > 0 ) {
		System.out.println(date);
		}
		in.close();
	}
	
}
