package week9;

import java.awt.*;
import javax.swing.*;

public class BoarderLayoutTest extends JFrame{
	public BoarderLayoutTest() {
		setTitle("BoarderLayoutTest");
		setSize(300,150);
		setLayout(new BorderLayout());
		
		JButton b1 = new JButton("NORTH");
		JButton b2 = new JButton("SOUTH");
		JButton b3 = new JButton("EAST");
		JButton b4 = new JButton("WEST");
		JButton b5 = new JButton("CENTER");
		
		
		
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(b3, BorderLayout.EAST);
		add(b4, BorderLayout.WEST);
		add(b5, BorderLayout.CENTER);	
		setVisible(true);
	}
	
	public static void main(String[] args) {
		BoarderLayoutTest B = new BoarderLayoutTest();
	}
}
