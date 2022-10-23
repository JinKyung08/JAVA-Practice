package inputOutputExam;

import java.io.IOException;
import java.io.*;

public class InputOutputExam01 {

	public static void main(String[] args) {
//	입출력(I/O) : 입력과 출력
		InputStream is = null;
		try { 
			is = new FileInputStream(".\\test\\abc.txt");
			int data=0;
			while((data=is.read()) !=-1 ) { 
				System.out.println("데이터 : " + data);
				System.out.println("데이터 : " + (char)data);								
			}
			//이렇게도 가능 
//			while(true) {  // (data=is.read()) !=-1 
//				int data = is.read();
//				System.out.println("데이터 : " + data);
//				System.out.println("데이터 : " + (char)data);
//				if(data == -1) {
//					break;
//				}				
//			}
		} catch (Exception e) {
			
		}finally {
			try {
				if(is != null) {
					is.close();
				}
			} catch (IOException e2) {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
