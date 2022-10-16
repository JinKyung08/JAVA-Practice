package inputoutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputExam {

	public static void main(String[] args) {
//		String data1 = ".\\test\\\\abc.txt";
// 파일을 복사하기 (abc.txt -> bcd.txt)		
		
		try {
		// 입출력 스트림
		InputStream is = new FileInputStream(".\\test\\abc.txt"); //(data1)
		OutputStream os = new FileOutputStream(".\\test\\bcd.txt");
		
		byte[] data = new byte[1024];   // 읽어들인 바이트를 저장할 배열 공간을 생성
		while(true) {
			int num = is.read(data); //최대 1024바이트를 읽고 배열에 저장, 읽은 바이트를 리턴
			if(num == -1) { break;}  // 파일의 내용을 다 읽었으면 while문 종료
//		int num=0;
//		while((num = is.read()) != -1)  //이렇게도 가능
			
			os.write(data,0,num);   // 읽은 바이트 수만큼 출력
		}
		os.flush();  // 내부 버퍼 잔류 바이트를 출력하고 버퍼를 비움
		
		os.close();  
		is.close();
		
		
		}catch (IOException e) {
			System.out.println(e.getMessage());  //개발이 끝나면 주석 또는 제거
		}catch(Exception e ) { e.printStackTrace();  //개발이 끝나면 주석 또는 제거
		}
	}

}
