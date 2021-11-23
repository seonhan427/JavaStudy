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
		setTitle("카운터");
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		label = new JLabel("현재의 카운터 값: " + count);
	    button = new JButton("증가");
		button.addActionListener(new MyListener());
		
		add(label);
		add(button);
		
		setVisible(true);
	}
	
class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("현재의 카운터값: " + count);
		
	}
}
	
	public static void main(String[] args) {
		CountNum test = new CountNum();

	}

}
