package condition_assignments3;

import java.util.Scanner;

public class condition2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String grade = in.nextLine();

		switch(grade) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Usually");
			break;
		case "D":
			System.out.println("Effort");
			break;
		case "F":
			System.out.println("Failure");
			break;
		default:
			System.out.println("error");
			break;
		}
		in.close();
	}
}
