package condition_assignments3;

import java.util.Scanner;

public class condition5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String MF = in.nextLine();
		int age = in.nextInt();
		String result = "";
		
		
		switch(MF) {
		
		case "M":
			if(age>=18) {
				result = "MAN";
			}
			else {
				result = "BOY";
			}
			break;
		case "F":
			if(age >= 18) {
				result= "WOMAN";
			}
			else {
				result = "GIRL";
			}
			break;
		default:
			System.out.println("error");
			break;
		}
		System.out.println(result);
		in.close();
		
		
	}
	
}
