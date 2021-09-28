package week2;

import java.util.Scanner;
public class temp {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("È­¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
		double F = input.nextDouble();

		double C = (5/9.)*(F-32);
		
		System.out.println("¼·¾¾¿Âµµ´Â "+ C);
		
		
		input.close();
	}
}
