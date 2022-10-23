package inputOutputExam;
import java.io.*;
public class BufferedInputOutputExam01 {

	public static void main(String[] args) {
// buffer 
		String inUrl = ".\\test\\abc.txt";
		String outUrl = ".\\test\\aaa.txt";
		
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inUrl));
			 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outUrl))){
			// close는 여기서 해줌
			
			while(bis.available()>0) {
				int b = bis.read();
				bos.write(b);
			}
			
			bos.flush(); // 버퍼를 사용 할때는 반드시 넣기
			
			
		} catch (Exception e) {
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
