package boardtest;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserUpdateExam {

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
			
			//update 테이블명 set 열이름 = 값,....where 조건
			sql = "UPDATE boards SET btitle=?, bcontent =?, bfilename=?, bfiledata=?" +
					"WHERE bno=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "수정제목");
			pstmt.setString(2, "수정내용입니다..");
			pstmt.setString(3, "indexpage1.jpg");
			pstmt.setBlob(4, new FileInputStream(".\\image\\indexpage1.jpg"));
			pstmt.setInt(5, 3);
			
			int rows = pstmt.executeUpdate();
			
			if(rows==0) {
				System.out.println("업테이트 실패");
			}else {
				System.out.println("업데이트 된 행의 수 : " +rows);
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
