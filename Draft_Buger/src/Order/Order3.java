package Order;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Order3 extends JFrame{
	
	private JPanel Menu3, Sum;
	private JCheckBox tomato,lettuce,pickle, onion, mushroom, olive, eggfry, bacon, cheese ; 
	private JButton back, next;
	private JLabel step3;
	private LineBorder line = new LineBorder(Color.black, 1, false);
	
	public Order3() {
		setSize(1000,1000);
		setLocationRelativeTo(null);
		
		Menu3 = new JPanel();
		Sum = new JPanel();
		setLayout(null);
		
		// panel 위치설정
		Menu3.setBounds(0,0,700,1000);
		Sum.setBounds(0,700,300,1000);
		
		// 이미지 삽입해야함
		// ImageIcon plain = new ImageIcon("Image/Cat.jpeg");
		// ImageIcon wholegrain = new ImageIcon("Image/Cat.jpeg");
		// ImageIcon glutenfree = new ImageIcon("Image/Cat.jpeg");
		
		Menu3.setLayout(null);
		Menu3.setBorder(line); // 테두리 확인을 위해 
		Sum.setBorder(line);
		
		add(Menu3);
		add(Sum);
		
		// 문구삽입 
		step3 = new JLabel("<html>Step 3<br>토핑을 골라주세요</html> ");
		
		Menu3.add(step3);
		step3.setBounds(100,150,700,30);
		// Menu1.add(plain); 이미지 삽입 
		// Menu1.add(wholegrain);
		// Menu1.add(glutenfree);
		tomato = new JCheckBox("<html>토마토<br>300</html>");
		lettuce = new JCheckBox("<html>양상추<br>500</html>");
		pickle = new JCheckBox("<html>피클<br>200</html>");
		onion = new JCheckBox("<html>양파<br>300</html>");
		mushroom = new JCheckBox("<html>버섯<br>500</html>");
		olive = new JCheckBox("<html>올리브<br>500</html>");
		eggfry = new JCheckBox("<html>계란후라이<br>600</html>");
		bacon = new JCheckBox("<html>베이컨<br>600</html>");
		cheese = new JCheckBox("<html>치즈<br>200</html>");
		
		
		
		Menu3.add(tomato);		
		Menu3.add(lettuce);		
		Menu3.add(pickle);
		Menu3.add(onion);
		Menu3.add(mushroom);
		Menu3.add(olive);
		Menu3.add(eggfry);
		Menu3.add(bacon);
		Menu3.add(cheese);
		
		
		// 버튼위치  
		tomato.setBounds(100,350,100,30);
		lettuce.setBounds(300,350,100,30);
		pickle.setBounds(500,350,100,30);
		onion.setBounds(100,550,100,30);
		mushroom.setBounds(300,550,100,30);
		olive.setBounds(500,550,100,30);
		eggfry.setBounds(100,750,100,30);
		bacon.setBounds(300,750,100,30);
		cheese.setBounds(500,750,100,30);
		
		
		back = new JButton("BACK");
		next = new JButton("NEXT"); // 이미지로 바꿀수도 있음
		
		back.setBounds(30,850,100,100);
		next.setBounds(570,850,100,100);
		Menu3.add(back);
		Menu3.add(next);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Order3();
	}
}
