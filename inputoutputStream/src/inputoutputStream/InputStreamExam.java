package inputoutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExam {

	public static void main(String[] args) throws IOException {
		//1. 파일 읽기 ( 입력파일 생성)
		File inFile = new File(".\\test\\abc.txt");
//		InputStream is = new FileInputStream(".\\test\\abc.txt");
		//2. byte단위로 읽기
		InputStream is = new FileInputStream(inFile);
		
		int data;  //4byte
		while((data = is.read()) != -1 ) {
//		while(true) {
//			data = is.read();
//			if(data++-1) {break;}
			System.out.println(data + " " + (char)data);
			System.out.println();
		}
		
		System.out.println();
		
		is.close(); // 입출력닫기 
		
		
		
	}

}
