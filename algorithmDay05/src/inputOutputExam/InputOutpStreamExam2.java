package inputOutputExam;
import java.io.*;

public class InputOutpStreamExam2 {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		String inUrl = ".\\test\\abc.txt";
		String outUrl = ".\\test\\efg.txt";
		int data=0;
		
		//파일 복사 (5바이트씩 읽어오기)
		try {
			is = new FileInputStream(inUrl); //파일 불러오기 
			os = new FileOutputStream(outUrl); // 파일이 가야할 자리
			byte[] bstr = new byte[5]; // 글자를 5개씩
			
			while((data=is.read(bstr)) != -1){ // 바이트 처리 하려면 바이트만큼 저장해야함
				os.write(bstr,0,data);
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
