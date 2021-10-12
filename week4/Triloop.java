package week4;

import java.util.Scanner;

public class Triloop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) { // for(;;)
			System.out.print("Width = ");
			
			int Width = input.nextInt();
			
			System.out.print("Height = ");
			int Height = input.nextInt();
			
			
			System.out.println("Triangle Area = "+ Width*Height/2.0);
			
			System.out.print("Continue? ");
			String yes = input.next();
			if (yes.equals("y")||yes.equals("Y")) { 
				break;
			}
		}input.close();
	}

}
