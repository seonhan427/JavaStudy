package Calendar;

import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.*;
import Calendar.ManagerWindow.clock;


public class ManagerWindow {
   public JFrame frame;
   private JLabel showClock;
   private JLabel showRevenue;
  
   
//   public static void main(String[] args) {
//      EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            try {
//               ManagerWindow window = new ManagerWindow();
//               window.frame.setVisible(true);
//            } catch (Exception e) {
//               e.printStackTrace();
//            }
//         }
//      });
//   }

   class clock extends Thread { // 시계만드는 
	   JLabel showClock = new JLabel("");
	   
	   
	   Calendar cal = new GregorianCalendar();
	   
	   public void run() {
		   while(true) {
			   try {
				   Thread.sleep(1000);
			   }catch(InterruptedException e) {
				   e.printStackTrace();
			   }
			   int hr = cal.get(Calendar.HOUR);  
			   int min = cal.get(Calendar.MINUTE);
			   int sec = cal.get(Calendar.SECOND);
			   showClock.setText(hr + "시 " + min + "분 " + sec + "초 ");
		   }
	   }

//	   int day = cal.get(Calendar.DAY_OF_MONTH);
//	   int month=cal.get(Calendar.MONTH);
//	   int year=cal.get(Calendar.YEAR);
	   //     showClock.setText(hr+":"+min+":"+sec+"  ("+day+"/"+month+"/"+year+")");      Timer off 
	   //	   showClock.setText(day+"/"+month+"/"+year);
   }
   public ManagerWindow() {
      initialize();
   }


   private <UtilDateModel> void initialize() {
      /* Create main Frame */
      frame = new JFrame();
      frame.setTitle("Manager Window");
      frame.setBounds(100, 100, 934, 653);
      frame.getContentPane().setFont(new Font("Candara Light", Font.PLAIN, 10));
      frame.getContentPane().setBackground(SystemColor.text);
      frame.getContentPane().setLayout(null);

      /*Date*/      
      Panel date = new Panel();
      date.setBackground(new Color(230, 230, 250));
      date.setBounds(67, 199, 202, 201);
      frame.getContentPane().add(date);
      showClock = new JLabel("");
      date.add(showClock);
      showClock.setBackground(SystemColor.menu);
      showClock.setHorizontalAlignment(SwingConstants.CENTER);
      showClock.setForeground(SystemColor.activeCaptionText);
      showClock.setFont(new Font("Tahoma", Font.BOLD, 20));
      frame.getContentPane().add(date);
      clock clock = new clock();
      clock.start();
      
      
      JMonthChooser monthChooser = new JMonthChooser();
      monthChooser.setBorder(null);
      date.add(monthChooser);
      monthChooser.getComboBox().setFont(new Font("Tahoma", Font.PLAIN, 13));
      JYearChooser yearChooser = new JYearChooser();
      date.add(yearChooser);
      JDayChooser dayChooser = new JDayChooser();
      dayChooser.getDayPanel().setBackground(new Color(230, 230, 250));
      date.add(dayChooser);
      
      
      /* Semi Titles */
      JLabel title1 = new JLabel("Daily Revenue");
      title1.setForeground(new Color(230, 230, 250));
      title1.setFont(new Font("Tahoma", Font.BOLD, 30));
      title1.setBounds(48, 10, 232, 50);
      frame.getContentPane().add(title1);
      
      JLabel title2 = new JLabel("And");
      title2.setForeground(new Color(230, 230, 250));
      title2.setFont(new Font("Tahoma", Font.BOLD, 30));
      title2.setBounds(127, 70, 68, 50);
      frame.getContentPane().add(title2);
      
      JLabel title3 = new JLabel("Stock Management");
      title3.setForeground(new Color(230, 230, 250));
      title3.setFont(new Font("Tahoma", Font.BOLD, 30));
      title3.setBounds(21, 131, 299, 50);
      frame.getContentPane().add(title3);
      
      
      /*Logo*/
//      JLabel Logo = new JLabel("");
//      Logo.setIcon(new ImageIcon(""));
//      frame.getContentPane().add(Logo);
      frame.setBounds(100, 100, 950, 554);
      
//      JLabel Background = new JLabel("");
//      Background.setIcon(new ImageIcon("image/background.png"));
//      Background.setBounds(0, 0, 926, 523);
//      frame.getContentPane().add(Background);
//      
      /*Background panel for dbms label*/
      Panel bgpanel = new Panel();
      bgpanel.setBounds(348, 36, 487, 459);
      frame.getContentPane().add(bgpanel);
      
      /*data label*/
      JLabel data = new JLabel("Data needs to be shown here");
      bgpanel.add(data);
      
      

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}
