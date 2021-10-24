package basic_assignment1;

import java.util.Scanner;

public class basic5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("yard? ");
		double num = in.nextDouble();
		
		String result = String.format("%.1f",num * 91.44) ;
		System.out.println(num + "yard = " + result + "cm");
		in.close();
	}
}
