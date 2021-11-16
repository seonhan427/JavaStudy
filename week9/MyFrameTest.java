package week9;

import java.awt.*;
import javax.swing.*;

public class MyFrameTest extends JFrame{
	public MyFrameTest() {
		setSize(600,150);
		setTitle("MyFrame");
		setLocationRelativeTo(null);

		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		add(panel1);
		add(panel2);
		
		setLayout(new FlowLayout());
		
		JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		JLabel label2 = new JLabel("개수");
		JTextField field = new JTextField(10);
		JButton button1 = new JButton("콤보피자");
		JButton button2 = new JButton("포테이토피자");
		JButton button3 = new JButton("불고기피자");
		
		panel1.add(label1);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(label2);
		panel2.add(field);
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		MyFrameTest test = new MyFrameTest();

	}

}
