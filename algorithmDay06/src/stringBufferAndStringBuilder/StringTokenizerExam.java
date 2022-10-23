package stringBufferAndStringBuilder;

import java.util.StringTokenizer;


public class StringTokenizerExam {

	public static void main(String[] args) {
//		StringTokenizer
		
		
		String str = "Hello java is fun!";
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		System.out.println(st.countTokens() + "개");
		
		while(st.hasMoreTokens()) {
			System.out.println("[" + st.nextToken() + "]");
		}
		
		
		
		
		
		
		
		
	}

}
