package inputOutputExam;

import java.io.*;

public class DataInputOutputStream {

	public static void main(String[] args) {
		//DataInputStream / DataOutputStream
		
		
		try(	//생성
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(".\\test\\data.dat"));
				DataInputStream dis = new DataInputStream(new FileInputStream(".\\test\\data.dat"))
		   ){
				// DataOutputStream 아래의 자료를 쓰기 
				dos.writeDouble(1.0);
				dos.writeInt(1);
				dos.writeUTF("one");
				
				dos.flush(); // 버퍼비우기
				
				//DataInputStream에서 자료 읽어서 화면에 출력
				System.out.println(dis.readDouble());
				System.out.println(dis.readInt());
				System.out.println(dis.readUTF());
			
		} catch (Exception e) {
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
