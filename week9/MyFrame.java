package week9;

import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;

public class MyFrame extends JFrame{
	public MyFrame() {
		setSize(300,200); // ���α׷� ������
		setTitle("MyFrame"); // ���α׷� Ÿ��Ʋ
		setBackground(Color.ORANGE); // �������� ������ ����
		getContentPane().setBackground(Color.CYAN); // ���α׷� ������ ����, ����Ʈ ���� �� ������ ����
		setLocationRelativeTo(null); // ȭ�� �߾ӿ� �߰� �ϴ� �ڵ�
		
		setLayout(new FlowLayout()); // ���̾ƿ� ����
		JButton button = new JButton("Ȯ��"); // ��ư����, ��ư �̸�
		JButton button2 = new JButton("���"); // ��ư����, ��ư �̸�
		add(button); // ��ư�� �����̳ʿ� �߰�
		add(button2); // ��ư�� �����̳ʿ� �߰�		
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
