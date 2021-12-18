package week12;

import java.awt.*;
import javax.swing.*;

public class CountDownTest extends JFrame{
	
	private JLabel label;
	
	class MyThread extends Thread{
		public void run() {
			for(int i = 10; i >= 0; i--) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i+"");
			}
			label.setText("End");
		}
	}
	
	public CountDownTest() {
		setTitle("카운트다운");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		label = new JLabel("Strat");
		label.setFont(new Font("Serif", Font.BOLD, 100));
		add(label);
		new MyThread().start();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new CountDownTest();
	}

}
