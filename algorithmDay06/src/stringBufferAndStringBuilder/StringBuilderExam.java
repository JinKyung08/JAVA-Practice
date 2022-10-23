package stringBufferAndStringBuilder;

public class StringBuilderExam {

	public static void main(String[] args) {
		//String클래스
		
		String name = "홍길동"; // 객체 생성  // String name = new String("홍길동");
		name += "이 학교에 "; //새로운 객체 생성 
		name += "갑니다.";	//새로운 객체 생성 
		
		System.out.println(name);
		
		System.out.println();
		
		String str = new String ("hello");
		System.out.println(str.hashCode());
		
		str += "java!";  // 새로운 객체 생성
		
		System.out.println(str.hashCode());  // 해쉬코드 다름
		System.out.println();
		
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb.hashCode());
		
		sb = sb.append("java!");//추가
		
		System.out.println(sb.hashCode());  //해쉬코드 같음 
		System.out.println(sb);
		
		System.out.println(sb.delete(3, 5)); //3이상 5미만
		System.out.println(sb.replace(0, 3, "good bye ").insert(0,"java, "));
		
		
		
		
		
		
		
		
		
		
		
	}

}
