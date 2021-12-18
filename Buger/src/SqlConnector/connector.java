package SqlConnector;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.io.*;
import java.time.*;
import java.util.Calendar;


public class connector {

	private Connection conn; //DB 커넥션 연결 객체
    private static final String USERNAME = "root";//DBMS접속 시 아이디
    private static final String PASSWORD = "qwe123123";//DBMS접속 시 비밀번호
    private static final String URL = "jdbc:mysql://localhost:3306/buger";//DBMS접속할 db
	
    public connector() {
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

    public void Order(int Card, int Cash){
        //쿼리문 준비
        String sql = "insert into Revenue(`Day`, `Card`, `Cash`, `Date`) VALUES (?, ?, ?, ?);";
        
        // 오늘의 날
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Calendar date = Calendar.getInstance();
        
        String format_date = format.format(date.getTime());
        
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, 9);
            pstmt.setInt(2, Card);
            pstmt.setInt(3, Cash);
            pstmt.setString(4, format_date);
            
            
            int result = pstmt.executeUpdate();
            if(result==1) {
                System.out.println("Revenue 데이터 삽입 성공!");
                
            }
            
        } catch (Exception e) {
            System.out.println("Revenue 데이터 삽입 실패!");
        }    finally {
            try {
                if(pstmt!=null && !pstmt.isClosed()) {
                    pstmt.close();
                }
            } catch (Exception e2) {}
        }
    }


	// Price 테이블 가져오기
    public void getProduct(String s) {
        String sql = "select * from product where ProductId = ?";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, s);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                System.out.println("ProductId: " + rs.getString("ProductId"));
                System.out.println("ProductName: " + rs.getString("ProductName"));
                System.out.println("ProductPrice: " + rs.getInt("ProductPrice"));
                System.out.println("AvailPerDay: " + rs.getInt("AvailPerDay"));
                
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
    	connector con = new connector();
    	String[] Id = {"B1","B2","B3","B4","B5","B6","Op1","Op2","Op3","Ex1","Ex2","Ex3","Ex4","Ex5","Ex6","Ex7","Ex8"};
    	for(String id : Id) {
    		con.getProduct(id);
    	}

    }

}
