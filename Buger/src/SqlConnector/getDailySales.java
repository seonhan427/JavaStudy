package SqlConnector;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class getDailySales {
	protected Connection conn; //DB 커넥션 연결 객체 
    protected static final String USERNAME = "root";//DBMS접속 시 아이디
    protected static final String PASSWORD = "qwe123123";//DBMS접속 시 비밀번호
    protected static final String URL = "jdbc:mysql://localhost:3306/buger";//DBMS
	
    public getDailySales() {
    	try {
            System.out.println("생성자");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("드라이버 로딩 성공");
        } catch (Exception e) {
            System.out.println("드라이버 로딩 실패 ");
            try {
                conn.close();
            } catch (SQLException e1) {    }
        }
	}
	public void getDailySalesAct() {
		
		
//		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
//		Calendar date = Calendar.getInstance();
//
//		String format_date = format.format(date.getTime());
		
		String sql = "select * from patments where date = ?";
        PreparedStatement pstmt = null;
        try {
            
			pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "2021/12/17");
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
            	int card = rs.getInt("card");
            	int cash = rs.getInt("AvailPerDay");
            	System.out.println("날짜 : " + "2021/12/17");
                System.out.println("총 매출 : " + (card+cash));
                System.out.println("카드 결제 : " + rs.getInt("card"));
                System.out.println("현금 결제 : " + rs.getInt("cash"));
                
            }
               
            
        } catch (Exception e) {
            System.out.println("select 예외발생");
        }    finally {
            try {
                if(pstmt!=null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {}
        }
    }
	public static void main(String[] args) {
		getDailySales get =new getDailySales();
		get.getDailySalesAct();
	}
}
