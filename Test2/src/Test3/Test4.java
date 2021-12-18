package Test3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test4 extends JFrame implements MouseListener{
	public Test4() {
		setSize(600,600);
		setLocationRelativeTo(null);
		setVisible(true);
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(e.getX()-30, e.getY()-30, 60, 60);
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Test4 c = new Test4();
	}
}