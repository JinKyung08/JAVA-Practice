package inputOutputExam;

import java.io.*;

public class OutputStreamExam01 {
			
	public static void main(String[] args) {
		//OutputStream
		
		OutputStream os = null;
		String url = ".\\test\\bcd.txt";
		
		try {
			os = new FileOutputStream(url); //os = new FileOutputStream(".\\test\\bcd.txt");
			String str = "즐거운 자바 알고리즘 시간~~";
			
			byte[] bstr = str.getBytes(); //문자열을 바이트단위로 가져와서 배열에 담기
			os.write(bstr);
			
		} catch (Exception e) {
			
		}finally {
			try {
				if(os != null) {  // 더 이상 자료가 없으면 
					os.flush(); // 출력 스트림을 닫기 전에 강제로 버퍼 비우기
					os.close(); // 출력 스트림 닫기 
				}
			}catch (IOException e2) {
		}
	}

		
		
		
		
		
	
	}
}