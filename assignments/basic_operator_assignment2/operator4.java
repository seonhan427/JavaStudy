package basic_operator_assignment2;

import java.util.Scanner;

public class operator4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("input minsu's heght and weight: ");
		int height = in.nextInt();
		int weight = in.nextInt();
		
		System.out.print("input kiyoung's heght and weight: ");
		int height2 = in.nextInt();
		int weight2 = in.nextInt();
		
//		System.out.println(height + " " + weight + " \n" + height2 + " " + weight2);
		
		int result = height > height2 && weight > weight2 ? 1 : 0;
		System.out.println(result);
		in.close();
		
	}

}
