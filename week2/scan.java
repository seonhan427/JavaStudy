package week2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class scan {
	public static void main(String[] args) {
		// Scanner�� Ȱ���Ͽ� ������� �̸��� ���̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		//���� ����
		Scanner input = new Scanner(System.in);
		
		// ����� �Է��� ó�� 
		System.out.print("������� �̸��� �Է��Ͻÿ�: ");
		String name = input.nextLine();
		
		System.out.print("���̸� �Է��Ͻÿ�: ");
		int age = 0;
		try {
			age = input.nextInt();
			
			//�Է� ������ ���
			
			System.out.println("�ȳ��ϼ���. "+ name + "��, " + age + "�� �̽ñ���!!");
		}catch( InputMismatchException e) {
			System.out.println("���ڸ� �Է����ּž��ؿ�..");
		}
		
		
		input.close();
	}
}
