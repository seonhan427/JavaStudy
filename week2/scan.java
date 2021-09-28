package week2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class scan {
	public static void main(String[] args) {
		// Scanner를 활용하여 사용자의 이름과 나이를 출력하는 프로그램을 작성하시오
		//변수 선언
		Scanner input = new Scanner(System.in);
		
		// 사용자 입력을 처리 
		System.out.print("사용자의 이름을 입력하시오: ");
		String name = input.nextLine();
		
		System.out.print("나이를 입력하시오: ");
		int age = 0;
		try {
			age = input.nextInt();
			
			//입력 정보를 출력
			
			System.out.println("안녕하세요. "+ name + "님, " + age + "살 이시군요!!");
		}catch( InputMismatchException e) {
			System.out.println("숫자를 입력해주셔야해요..");
		}
		
		
		input.close();
	}
}
