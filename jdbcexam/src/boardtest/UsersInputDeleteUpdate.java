package boardtest;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersInputDeleteUpdate {

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
				
//			insert into users (userid, username, userpassword, userage, useremail)
//					values('a5', '이강산', '5123',25,'a5@mya5.com');
				
//			 sql = "INSERT INTO users (userid, username, userpassword, userage, useremail)" +	
//						  "VALUES(?,?,?,?,?)";   // ? -> 사용자로부터 입력받아서 처리
////								  1 2 3 4 5
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			
////			setter, getter ex) setString, setInt, setXXX(순번,값)
//			pstmt.setString(1, "a6");   //' ' - 문자,  " " -문자열
// 			pstmt.setString(2, "이돌돌");
//			pstmt.setString(3, "6123");
//			pstmt.setInt(4, 29);
//			pstmt.setString(5, "a6@mya6.com");
//			
//			// executeUpdate() : insert, update, delete
//			// executeQuery() : select	
//			// execute() : 저장프로시저(스토어드 프로시저), 저장함수(스토어드 function)
//
//			//sql문 실행 - user테이블에 1개의 행이 저장 
//			int rows = pstmt.executeUpdate();  // 성공 - 행의개수 (1을 리털)
//			
//			// 몇 개의 형이 저장되었는지 확인
//			System.out.println("저장된 행의 수 : " + rows);
//			
//			//PreparedStatement를 더이상 사용하지 않을 경우, 메모리를 해제
//			pstmt.close();
			
			sql = "INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata)" +
					"VALUES( ?, ?, ?, now(), ?, ?)";
				
			//bno -> auto_increment라 생략
			//bdate : 현재날짜와 시간을 받기 위해 now()를 쓰기에 ?로 처리하지 않음
			//bno 열에 실제로 값이 저장되었는지 확인...
			//자동으로 증가된 bno의 값을 가져오기 : Statement.RETURN_GENERATED_KEYS
			//그림파일 : blob(바이너리타입), setBlob()
			
			PreparedStatement pstmt1 = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
				
			pstmt1.setString(1, "제목5");
			pstmt1.setString(2, "그림1에 대한 내용~~");
			pstmt1.setString(3, "a1");
			pstmt1.setString(4, "indexpage1.jpg");
//			pstmt1.setBlob(5, new FileInputStream("./image/indexpage1.jpg"));
			pstmt1.setBlob(5, new FileInputStream(".\\image\\indexpage1.jpg"));
			
			//bno에 대한 처리 , 위의 내용이 저장이 되면 rows가 1일떄 getGeneratedKeys()메서드 이용
				
			int rows = pstmt1.executeUpdate();
			
			System.out.println("추가된 행의 수 : " + rows);
			
			//Statement.RETURN_GENERATED_KEYS 대한 처리
			if(rows==1) {
				ResultSet rs = pstmt1.getGeneratedKeys();
				
				if(rs.next()) {
					int bno = rs.getInt(1);   //new String [] {} 스트링 배열로 처리되어서 가져옴
					System.out.println("저장된 bno : " + bno);
				}
				rs.close();
			}
			
			
			pstmt1.close();
			
			
			
			
			
			
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
