package inputOutputExam;
import java.io.*;

public class InputOutpStreamExam {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		String inUrl = ".\\test\\abc.txt";
		String outUrl = ".\\test\\cde.txt";
		int data=0;
		//파일 복사 (1바이트씩 읽어오기)
		try {
			is = new FileInputStream(inUrl); //파일 불러오기 
			os = new FileOutputStream(outUrl); // 파일이 가야할 자리
			
			while((data=is.read()) != -1){
				os.write(data);
			}
			
			
			
		} catch (Exception e) {

		} finally {
			try {
				if(is != null) {
					is.close();
				}
				if(os != null) {
					os.flush();
					os.close();
				}
				
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
