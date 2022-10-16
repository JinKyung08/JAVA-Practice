package inputoutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExam {

	public static void main(String[] args) {
//		File outFile = new File(".\\test\\bcd.txt");
		File outFile = new File("c:\\temp\\bcd.txt"); //다른 저장공간에 넣곳 싶을 때
//		OutputStream os = new FileOutputStream(".\\test\\bcd.txt");
		try {
			OutputStream os = new FileOutputStream(outFile);   //기존 파일을 덮어쓰기
//			OutputStream os = new FileOutputStream(outFile,true);  //append = true, 이어쓰기
			
			os.write('j');
			os.write('a');
			os.write('v');
			os.write('a');

			os.flush();  //FileOutputStream은 내부적으로 메모지 버퍼를 사용하지 않아 생략가능
						 // 그러나 넣는 방향으로...
						 // 내부버퍼에 잔류하는 바이트를 출혁하고 버퍼를 비움
						 // 내부 퍼버를 사용하는 이유 : 출력성능을 향상시키기 위해
			os.close();  // 출력 스트림을 닫아 사용한 메모리를 해제
			
		
		
		}catch(IOException e) {
			System.out.println("출력에러");
//			e.printStackTrace(); //확인후에는 반드시 주석처리하거나 또는 제거 
		}catch(Exception e) { }
		
	}

}
