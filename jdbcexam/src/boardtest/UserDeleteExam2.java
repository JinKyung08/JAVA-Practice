package boardtest;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDeleteExam2 {

	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/jdbctest?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "test";
		String password = "1234";
		String sql = "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url,user,password);
			
			System.out.println("연결 성공");
			
			//delete from 테이블명 where 열이름 = 값;
			
			sql ="DELETE FROM boards WHERE bwriter =?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1,"a1");
			
			int rows = pstmt.executeUpdate();   //insert,delete,update // 처리결과 행수로 리턴 
												//select -> executequery , 프로시저 -> execute
			
			//확인용
			if(rows>=1) {
				System.out.println("삭제된 행의 수 : " + rows);
			}else {
				System.out.println("삭제 실패");
			}
			
			pstmt.close();
			
			
			
			
			
			
		}catch(ClassNotFoundException e) {
			
		}catch(SQLException e) {
					
		}catch(Exception e) {
	
		}finally {
	
			if (conn != null) {
				try {
					//연결 끊기
					conn.close();
					System.out.println("연결 끊기");
				}catch(SQLException e) {	
	
				}
			}
			
			
		}
	}

}
