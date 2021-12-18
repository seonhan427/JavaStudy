package week11;

import java.awt.*;
import javax.swing.*;


public class CatImage extends JFrame {
	
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	
	public CatImage() {
		setTitle("레이블 테스");
		setSize(500,300);
		setLocationRelativeTo(null);
		
		
		
		panel = new JPanel();
		label = new JLabel("CAT");
		label.setForeground(Color.ORANGE);
		
		
		ImageIcon icon = new ImageIcon("Image/Cat.jpeg"); // 상대경로 지정 
		//ImageIcon icon2 = new ImageIcon("/Users/seonhan/eclipse-workspace/JavaStudy/src/week11/catIcon.png");
		label.setIcon(icon);
		//button.setIcon(icon2);
		button = new JButton("자세한 정보를 보려면 클릭하세요!");
		
		
		
		panel.add(label);
		panel.add(button);
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new CatImage();
	}
	
}
