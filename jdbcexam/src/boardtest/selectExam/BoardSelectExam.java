package boardtest.selectExam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardSelectExam {

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
			
			// 쿼리문 작성
			sql = "SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata " +
					"FROM boards WHERE bwriter=?";
			
			//PreparedStatement 객체 구현
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			
			// 객체에 값 지정
			pstmt.setNString(1, "a3");
			
			// sql문을 실행 - executeQuery() : select문, insert/update/delete : excuteUpdate()
			//				  execute () : 스토어드 프로시저/ 스토어드 function
			
			//executeQuery()의 실행 결과 => ResultSet 형
			
			ResultSet rs = pstmt.executeQuery();
			
			// rs 객체에 담겨있는 값을 가져다 Board객체를 생성해서 담기
			// rs.next() : 데이터가 있으면 true, 없으면 false
			while(rs.next()) {
				Board board = new Board();
				
//				board.setBno(rs.getInt(1));
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfilename(rs.getString("bfilename"));
				board.setBfiledata(rs.getBlob("bfiledata"));

				// 상황에 맞게 코딩할 부분
				// 콘솔 화면에만 출력 => toString() 재정의해 놓은 것을 통해 확인 
				
				System.out.println(board);
				
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
