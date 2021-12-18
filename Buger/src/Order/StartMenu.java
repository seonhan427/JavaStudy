package Order;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import Calendar.ManagerWindow;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import Calendar.ManagerWindow;
public class StartMenu {

   public JFrame frame;

   /**
    * Launch the application.
    */
//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               StartMenu window = new StartMenu();
//               window.frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//         }
//      });
//   }

   /**
    * Create the application.
    */
   public StartMenu() {
      initialize();

   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setTitle("\uD584\uBC84\uAC70\uB9E4\uC7A5\uD0A4\uC624\uC2A4\uD06C\uD504\uB85C\uADF8\uB7A8");
      frame.setBounds(100, 100, 559, 444);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setResizable(false);
      frame.getContentPane().setLayout(null);
      
      JLabel lblNewLabel = new JLabel("\uD584\uBC84\uAC70\uCC9C\uAD6D\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4!");
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel.setBounds(0, 71, 555, 119);
      frame.getContentPane().add(lblNewLabel);
      
      JButton btnNewButton = new JButton("매장식사");
      btnNewButton.setBounds(191, 200, 170, 79);
      frame.getContentPane().add(btnNewButton);
      
      JButton btnNewButton_2 = new JButton("관리");
      btnNewButton_2.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			StartMenu start = new StartMenu();
            start.frame.setVisible(false);
			ManagerWindow window = new ManagerWindow();
            window.frame.setVisible(true);
            
		}
    	  
      });
      btnNewButton_2.setIcon(null);
      btnNewButton_2.setBounds(481, 344, 62, 62);
      frame.getContentPane().add(btnNewButton_2);
   }
}