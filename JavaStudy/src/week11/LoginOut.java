package week11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

public class LoginOut extends JFrame {
	private JLabel label1, lable2;
	private JPanel panel;
	private JButton button1, button2;
	private JTextField id;
	private JTextField password;

	public LoginOut() {

		setTitle("login window");
		setSize(300, 150);
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("id    ");
		JLabel label2 = new JLabel("pass");
		id = new JTextField(20);
		password = new JTextField(20);

		add(panel);
		panel.add(label1);
		panel.add(id);
		panel.add(label2);
		panel.add(password);

		JButton button1 = new JButton("login");
		JButton button2 = new JButton("cancel");
		panel.add(button1);
		panel.add(button2);

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (id.getText().equals("dean") && password.getText().equals("123qwe!")) {
					System.out.print("로그인이 되었습니다.");
				} else {
					System.out.println("id 혹은 password가 일치하지 않습니다.");
				}
			}
			
		});
		
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				id.setText("");
				password.setText("");
			}
			
		});

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

//	private class ButtonListener implements ActionListener {
//		public void actionPerFormed(ActionEvent e) {
//			String ID1 = id.getText();
//			String PW1 = password.getText();
//				
//			if (e.getSource() == button1) {
//				if (ID.equals(ID1) && PW.equals(PW1)) {
//					System.out.print("로그인이 되었습니다.");
//				} else {
//					System.out.println("id 혹은 password가 일치하지 않습니다.");
//				}
//			}
//			if (e.getSource() == button2) {
//				id.setText("");
//				password.setText("");
//			}
//		}
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//
//		}
//	}

	public static void main(String[] args) {
		new LoginOut();

	}

}
