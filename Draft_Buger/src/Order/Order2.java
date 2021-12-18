package Order;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Order2 extends JFrame{
	private JPanel Menu2, Sum;
	private JCheckBox Chi, bul, Chibul, baconegg, vege; 
	private JButton back, next;
	private JLabel step2;
	private LineBorder line = new LineBorder(Color.black, 1, false);
	
	public Order2() {
		setSize(1000,1000);
		setLocationRelativeTo(null);
		
		Menu2 = new JPanel();
		Sum = new JPanel();
		setLayout(null);
		
		// panel 위치설정
		
		Menu2.setBounds(0,0,700,1000);
		Sum.setBounds(0,700,300,1000);
		
		// 이미지 삽입해야함
		// ImageIcon plain = new ImageIcon("Image/Cat.jpeg");
		// ImageIcon wholegrain = new ImageIcon("Image/Cat.jpeg");
		// ImageIcon glutenfree = new ImageIcon("Image/Cat.jpeg");
		
		Menu2.setLayout(null);
		Menu2.setBorder(line); // 테두리 확인을 위해 
		Sum.setBorder(line);
		add(Menu2);
		add(Sum);
		
		// 문구삽입 
		step2 = new JLabel("<html>Step 2<br>메인을 골라주세요 </html> ");
		
		Menu2.add(step2);
		step2.setBounds(100,150,700,30);
		
		// Menu1.add(plain); 이미지 삽입 
		// Menu1.add(wholegrain);
		// Menu1.add(glutenfree);
		Chi = new JCheckBox("<html>치킨<br>3,000</html>");
		bul = new JCheckBox("<html>불고기<br>3,500</html>");
		Chibul = new JCheckBox("<html>치즈 불고기<br>4,000</html>");
		baconegg = new JCheckBox("<html>베이컨&에그<br>3,000</html>");
		vege = new JCheckBox("<html>베지테리안<br>3,500</html>");
		// 체크박스 문구 
		
		
		Menu2.add(Chi);		
		Menu2.add(bul);		
		Menu2.add(Chibul);
		Menu2.add(baconegg);
		Menu2.add(vege);
		
		
		// 체크 박스 위치 
		Chi.setBounds(100,350,100,30);
		bul.setBounds(300,350,100,30);
		Chibul.setBounds(500,350,100,30);
		baconegg.setBounds(100,550,100,30);
		vege.setBounds(300,550,100,30);
		
		
		back = new JButton("BACK");
		next = new JButton("NEXT"); // 이미지로 바꿀수도 있음
		
		back.setBounds(30,850,100,100);
		next.setBounds(570,850,100,100);
		Menu2.add(back);
		Menu2.add(next);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Order2();
		
	}
}
