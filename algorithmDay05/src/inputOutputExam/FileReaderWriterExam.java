package inputOutputExam;
import java.io.*;
public class FileReaderWriterExam {

	public static void main(String[] args) {
		String inUrl = ".\\test\\bcd.txt";
		String outUrl = ".\\test\\ccc.txt";
		
		
		
		try(FileReader fr = new FileReader(inUrl); // bcd.txt 파일 시용하기 위해
			FileWriter fw = new FileWriter(outUrl) // ccc.txt 파일 시용하기 위해
		) {
			
			int data=0;
			while((data=fr.read()) != -1) { //read() 메서드를 이용(호출)해서 한 문자씩 읽기
				fw.write(data); //  write()메서드를 이용(호출)해서 한 문자씩 쓰기
			}
			
		} catch (Exception e) {
		}
		
		
		
		
		
		
	}

}
