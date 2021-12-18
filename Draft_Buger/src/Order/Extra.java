package Order;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Extra extends JFrame{
	
	private JPanel Menu4, Sum;
	private JCheckBox fry, salad, wedge, cheeseStick, coke, fanta, cider, water, fizz ; 
	private JButton back, next;
	private JLabel step4;
	private LineBorder line = new LineBorder(Color.black, 1, false);
	
	public Extra() {
		setSize(1000,1000);
		setLocationRelativeTo(null);
		
		Menu4 = new JPanel();
		Sum = new JPanel();
		setLayout(null);
		
		// panel 위치설정
		Menu4.setBounds(0,0,700,1000);
		Sum.setBounds(0,700,300,1000);
		
		// 이미지 삽입해야함
		// ImageIcon plain = new ImageIcon("Image/Cat.jpeg");
		// ImageIcon wholegrain = new ImageIcon("Image/Cat.jpeg");
		// ImageIcon glutenfree = new ImageIcon("Image/Cat.jpeg");
		
		Menu4.setLayout(null);
		Menu4.setBorder(line); // 테두리 확인을 위해 
		Sum.setBorder(line);
		
		add(Menu4);
		add(Sum);
		
		// 문구삽입 
		step4 = new JLabel("<html>Extra<br>사이드 메뉴를 고를수 있습니다</html> ");
		
		Menu4.add(step4);
		step4.setBounds(100,150,700,30);
		// Menu1.add(plain); 이미지 삽입 
		// Menu1.add(wholegrain);
		// Menu1.add(glutenfree);
		fry = new JCheckBox("<html>감자튀김<br>300</html>");
		salad = new JCheckBox("<html>샐러드<br>500</html>");
		wedge = new JCheckBox("<html>웨지<br>200</html>");
		cheeseStick = new JCheckBox("<html>치즈스틱<br>300</html>");
		coke = new JCheckBox("<html>콜라<br>500</html>");
		fanta = new JCheckBox("<html>환타<br>500</html>");
		cider = new JCheckBox("<html>사이다<br>600</html>");
		water = new JCheckBox("<html>생수<br>600</html>");
		fizz = new JCheckBox("<html>탄산수<br>200</html>");
		
		
		
		Menu4.add(fry);		
		Menu4.add(salad);		
		Menu4.add(wedge);
		Menu4.add(cheeseStick);
		Menu4.add(coke);
		Menu4.add(fanta);
		Menu4.add(cider);
		Menu4.add(water);
		Menu4.add(fizz);
		
		
		// 버튼위치 
		fry.setBounds(100,350,100,30);
		salad.setBounds(300,350,100,30);
		wedge.setBounds(500,350,100,30);
		cheeseStick.setBounds(100,550,100,30);
		coke.setBounds(300,550,100,30);
		fanta.setBounds(500,550,100,30);
		cider.setBounds(100,750,100,30);
		water.setBounds(300,750,100,30);
		fizz.setBounds(500,750,100,30);
		
		
		back = new JButton("BACK");
		next = new JButton("NEXT"); // 이미지로 바꿀수도 있음
		
		back.setBounds(30,850,100,100);
		next.setBounds(570,850,100,100);
		Menu4.add(back);
		Menu4.add(next);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Extra();
	}
}