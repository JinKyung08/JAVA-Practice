package hashcodeAndEquals;

public class StudentMain {

	public static void main(String[] args) {
		Student hong = new Student("홍길동",220301);
		Student lee = new Student("이기자",220302);
		Student hong1 = new Student("홍길동",220301);
				
		
		//================ String의 특징
		String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = new String("홍길동");
		
		System.out.println("**==확인**");
		System.out.println(name1==name2);  // true == 스택안에 있는 변수에 담긴 값이 같은가?
		System.out.println(name1==name3);  // false
		System.out.println(name2==name3);  // false
		System.out.println();
		
		//==========================
		System.out.println(hong==lee); //false
		System.out.println(hong==hong1);  //false
		System.out.println(hong1==lee); //false
		System.out.println();
		
		System.out.println("**equals()확인");
		//참조변수가 가리키는 내용이 같은가 // 글자가 같은가
		System.out.println(name1.equals(name2)); // true
		System.out.println(name1.equals(name3)); // true
		System.out.println(name2.equals(name3)); // true
		System.out.println();
		
		System.out.println(hong.name.equals(lee.name));  //f 비교대상이 문자열
		System.out.println(hong.name.equals(hong1.name)); //t
		System.out.println(lee.name.equals(hong1.name));  //f
		System.out.println();
		
		System.out.println(hong.equals(lee)); //f
		System.out.println(hong.equals(hong1)); //f => t
		System.out.println(lee.equals(hong1));  //f
		System.out.println();
		
		System.out.println("**hashcode()확인**");
		System.out.println(hong.hashCode());  
		System.out.println(hong1.hashCode()); 
		System.out.println(lee.hashCode());  
		System.out.println();
		
		int re = hong.compareTo(lee);
		System.out.println(re);
		
		System.out.println("**toString()확인**");
		//내용확인
		 System.out.println(name1);
		 System.out.println(name2);
		 System.out.println(name3);
		 System.out.println();
		 
		 System.out.println(hong); //hong.toString()
		 System.out.println();
		 System.out.println(lee);
		 System.out.println();
		 System.out.println(hong1);
		 
		
	}

}
