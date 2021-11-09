package week8;

import java.util.Scanner;

public abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	public void run() {
		Scanner in = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " +getDestString()+ "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ���>> ");
		double val = in.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ���: " + res + getDestString()+"�Դϴ�");
		
		in.close();
	}
}
