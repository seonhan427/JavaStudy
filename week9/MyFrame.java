package week9;

import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;

public class MyFrame extends JFrame{
	public MyFrame() {
		setSize(300,200); // 프로그램 사이즈
		setTitle("MyFrame"); // 프로그램 타이틀
		setBackground(Color.ORANGE); // 프레임의 색상만을 변경
		getContentPane().setBackground(Color.CYAN); // 프로그램 배경색깔 변경, 콘텐트 페인 의 색상을 변경
		setLocationRelativeTo(null); // 화면 중앙에 뜨게 하는 코드
		
		setLayout(new FlowLayout()); // 레이아웃 생성
		JButton button = new JButton("확인"); // 버튼생성, 버튼 이름
		JButton button2 = new JButton("취소"); // 버튼생성, 버튼 이름
		add(button); // 버튼을 컨테이너에 추가
		add(button2); // 버튼을 컨테이너에 추가		
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}

}
