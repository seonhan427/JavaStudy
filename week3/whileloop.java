package week3;

import java.util.Scanner;
public class whileloop {
	public static void main(String[] args) {
		
		long fact = 1;
		int n;
		
		System.out.printf("정수를 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		int i =1;
		while(i <= n) {
			fact = fact * i;
			i++;
		}
		System.out.printf("%d!은 %d입니다.",n,fact);
		scan.close();
	}

}
