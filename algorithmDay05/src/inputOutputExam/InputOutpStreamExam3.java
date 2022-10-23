package inputOutputExam;
import java.io.*;

public class InputOutpStreamExam3 {

	public static void main(String[] args) {	
		
		String inUrl = ".\\test\\abc.txt";
		String outUrl = ".\\test\\cde.txt";
		int data=0;
		
		//파일 복사 (1바이트씩 읽어오기)
		try(  FileInputStream is = new FileInputStream(inUrl); 
			  FileOutputStream os = new FileOutputStream(outUrl)) {	
			// try with resource 구문이용해서 자동으로 리소스 닫기 (해제)	
			
			 // 파일이 가야할 자리
			while((data=is.read()) != -1){
				os.write(data);
			}
		
		} catch (Exception e) {
					
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
