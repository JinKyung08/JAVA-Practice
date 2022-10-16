package inputoutputStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExam {

	public static void main(String[] args) {
		try {
			// 문자기반 출력 스트림 생성
			Writer writer = new FileWriter("c:\\temp\\cde.txt");
			
			// 1문자씩 출력
			char a = 'j';
			writer.write(a);
			char b = 'a';
			writer.write(b);
			
			writer.flush();
			writer.close();
			
			
		}catch(IOException e ) {
				
		}catch(Exception e) { }
		
	}

}
