package week10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGame extends JFrame implements KeyListener{

	JLabel label1,label2,label3;
	int n1,n2,n3;
	
	public SimpleGame() {
		setSize(400,150);
		setTitle("Simpel Game Machine");
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		label1 = new JLabel(Integer.toString(n1));
		label2 = new JLabel(Integer.toString(n2));
		label3 = new JLabel(Integer.toString(n3));
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		
		panel.addKeyListener(this);
		panel.requestFocus();
		panel.setFocusable(true);
		
		add(panel);
		setVisible(true);
	}
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		if(keycode == KeyEvent.VK_ENTER) {
			n1 = (int)(Math.random()*10);
			n2 = (int)(Math.random()*10);
			n3 = (int)(Math.random()*10);
			
			label1.setText(Integer.toString(n1));
			label2.setText(Integer.toString(n2));
			label3.setText(Integer.toString(n3));
		}
	} 
	public void keyReleased(KeyEvent e) { // 스펠링 조심
		
	}
	public void keyTyped(KeyEvent e) { // 스펠링 조심 제발...
		  
	}

	public static void main(String[] args) {
		SimpleGame test = new SimpleGame();
	}
	
}
