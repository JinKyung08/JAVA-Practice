package inputOutputExam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class BufferReaderExam {

	public static void main(String[] args) {
		String inUrl = ".\\test\\bcd.txt";
		String outUrl = ".\\test\\efg.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(inUrl)); // 파일에서 읽기 위해 객체 생성
				BufferedWriter bw1 = new BufferedWriter(new FileWriter(inUrl))) // 파일에 쓰기 위해 객체 생성
		{
			
			String data = "";
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (Exception e) {
		}
		
		//키보드로 입력받기
//		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)); //처리 속도 빠름  
//		br1.readLine();
//		
//		Scanner scan = new Scanner(System.in);  // 처리속도 느림 
//		scan.next();
		
//		//콘솔로 내보내기
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		bw.write("홍길동");
//		
//		System.out.println("홍길동");
		
		
		
		
		
		
		
		
		
	}

}
