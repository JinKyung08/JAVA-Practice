package boardtest.selectExam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExam {

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
			
			
			// pstmt.executeQuery();  => select문으로 데이터를 가져올 때
			// ResultSet 저장하고 리턴 
			// ResultSet rs = pstmt.executeQuery();
			
			// 1개의 데이터 행만 가져올 경우 
			/* if(rs.next(){ 			//pk(기본키)를 조건으로 데이터를 가져오는 경우
					// 첫 번째 데이터가 행처리 
			   }else {
					// 마지막 자료가 없을 경우
			   }
			*/
			
			
			
			
			// n개의 데이터 행을 가져올 경우
			/*
			 * 		while(rs.next()){
			 * 				// 가져올(읽어올) 데이터 행 처리
			 * 		}
			 */
			
			sql ="SELECT userid, username, userpassword, userage, useremail " +
					"FROM users WHERE userid=?";
				
				//PreparedStatement 얻기 및 값 지정
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "a1");   //pk로 조건을 검색 
				
				//SQL문 실행 후, ResultSet을 통해 데이터 읽기
				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) {						//1개의 데이터 행을 가져왔을 경우
					User user1 = new User();				
					user1.setUserId(rs.getString("userid"));    // rs.getString(1)
					user1.setUserName(rs.getString("username")); //rs.getString(2)
					user1.setUserPassword(rs.getString("userpassword"));
					user1.setUserAge(rs.getInt(4));       //컬럼 순번을 이용
					user1.setUserEmail(rs.getString(5));  //컬럼 순번을 이용	
					
					System.out.println(user1);  // toString()호출
					
				} else {                           //데이터 행을 가져오지 않았을 경우
					System.out.println("사용자 아이디가 존재하지 않음");
				}
				rs.close();
			
			
			
			
			
			
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
