package Order;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Order1 extends JFrame {
	
	private JPanel Menu1, Sum;
	private JCheckBox plain, wholeGrain, glutenFree; // 하나만 선택하는거면 라디오버튼 사용해야
	private JButton back, next;
	private JLabel step1;
	private LineBorder line = new LineBorder(Color.black, 1, false);
	
	public Order1() {
		setSize(1000,1000);
		setLocationRelativeTo(null);
		
		Menu1 = new JPanel();
		Sum = new JPanel();
		setLayout(null);
		// panel 위치설정
		Menu1.setBounds(0,0,700,1000);
		Sum.setBounds(0,700,300,1000);
		// 이미지 삽입해야함
		// ImageIcon plain = new ImageIcon("Image/Cat.jpeg");
		// ImageIcon wholegrain = new ImageIcon("Image/Cat.jpeg");
		// ImageIcon glutenfree = new ImageIcon("Image/Cat.jpeg");
		
		Menu1.setLayout(null);
		Menu1.setBorder(line); // 테두리 확인을 위해 
		Sum.setBorder(line);
		add(Menu1);
		//여기까지가 화면 왼쪽
		add(Sum);
		
		// 문구삽입 
		step1 = new JLabel("<html>Step 1<br>빵을 골라주세요</html> ");
		
		Menu1.add(step1);
		step1.setBounds(100,150,700,30);
		// Menu1.add(plain); 이미지 삽입 
		// Menu1.add(wholegrain);
		// Menu1.add(glutenfree);
		plain = new JCheckBox("<html>플레인<br>1,000</html>");
		wholeGrain = new JCheckBox("<html>홀그레인<br>1,500</html>");
		glutenFree = new JCheckBox("<html>글루텐프리<br>1,500</html>");
		
		
		Menu1.add(plain);		
		Menu1.add(wholeGrain);		
		Menu1.add(glutenFree);	
		plain.setBounds(100,350,100,30);
		wholeGrain.setBounds(300,350,100,30);
		glutenFree.setBounds(500,350,100,30);
		
		// back next 버튼추가 위치는 곧 정하기
		back = new JButton("BACK");
		next = new JButton("NEXT"); // 이미지로 바꿀수도 있음
		
		back.setBounds(30,850,100,100);
		next.setBounds(570,850,100,100);
		Menu1.add(back);
		Menu1.add(next);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	
	
	public static void main(String[] args) {
		new Order1();
	}

}
