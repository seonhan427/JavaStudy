package loop;

import java.util.Scanner;

public class loop6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		while (true) {
			System.out.print("Base = ");
			int base = in.nextInt();
			
			System.out.print("Height = ");
			int height = in.nextInt();
			
			double result = (base * height)/2.0;
			
			System.out.println("Triangle width = " + String.format("%.1f", result));
			
			System.out.print("Continue? ");
			String answer = in.next();
			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			}
			else {
				System.out.println("shut down");
				break;
			}
		}
		in.close();
	}

}
