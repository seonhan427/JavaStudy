package week10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CountNum extends JFrame{
	
	private JButton button;
	private JLabel label;
	int count = 0;
	
	public CountNum() {
		setSize(350,150);
		setTitle("ī����");
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		label = new JLabel("������ ī���� ��: " + count);
	    button = new JButton("����");
		button.addActionListener(new MyListener());
		
		add(label);
		add(button);
		
		setVisible(true);
	}
	
class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("������ ī���Ͱ�: " + count);
		
	}
}
	
	public static void main(String[] args) {
		CountNum test = new CountNum();

	}

}
