package boardexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class BoardExamFinal {
	//입력
	private Scanner scanner = new Scanner(System.in);
	//필드
	private Connection conn;
			
	// Constructor
		public BoardExamFinal() throws InterruptedException {
			String url = "jdbc:mysql://localhost:3306/jdbctest?characterEncoding=UTF-8&serverTimezone=UTC";
//			              "jdbc:mysql://localhost:3306/jdbctest",
			String user = "jdbctestsql";
			String password = "1234";
			try {
				// JDBC Driver 등록
				Class.forName("com.mysql.cj.jdbc.Driver");
//				Class.forName("com.mysql.jdbc.Driver");

				// 연결하기
				conn = DriverManager.getConnection(url, user, password);

			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
	
		
		
		
		
		
		
	public static void main(String[] args) {
	} // end of main

} //end of boardexamfinal class
