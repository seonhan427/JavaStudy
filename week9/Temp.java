package week9;

import javax.swing.*;
import java.awt.*;

public class Temp extends JFrame{
	public Temp() {
		setSize(300,150);
		setTitle("�µ���ȯ��");
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
//		JPanel panel = new JPanel();
//		add(panel);
		
		JLabel label1 = new JLabel("ȭ���µ�");
		JLabel label2 = new JLabel("�����µ�");
		JTextField textfield1 = new JTextField(20);
		JTextField textfield2 = new JTextField(20);
		JButton button = new JButton("��ȯ");
		
//		panel.add(label1);
//		panel.add(textfield1);
//		panel.add(label2);
//		panel.add(textfield2);
//		panel.add(button);
		add(label1);
		add(textfield1);
		add(label2);
		add(textfield2);
		add(button);
		
		setVisible(true);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Temp t = new Temp();

	}

}
