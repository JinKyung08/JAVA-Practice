package collectionFrameworkExam;

import java.util.HashSet;
import java.util.Set;

public class StudentHashSetMain {

	public static void main(String[] args) {
		//set : 순서가 중요하지 않다. 단 중복은 허용하지 않는다.
		// 		입력 순서대로 출력되는 것은 아니다
		// 		중복을 체크 : hashCode, equals
		
//		Set<Student> set = new HashSet<Student>();
		HashSet<Student> set = new HashSet<Student>();  //해쉬 이퀄 둘다 비교한 후 결과 나옴
		
		set.add(new Student("홍길동",20));
		set.add(new Student("박자바",32));
		set.add(new Student("홍길동",20));
		set.add(new Student("이하늘",28));
		
		System.out.println(set); //중복 X 왜 홍길동 나옴? /해쉬코드 이퀄 해야 1개만 나옴
		
		Set<String> aa = new HashSet<String>();  //홍길동 1개만 나옴 /string 형
		aa.add("홍길동");
		aa.add("이자바");
		aa.add("허산");
		aa.add("홍길동");
		System.out.println(aa);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
