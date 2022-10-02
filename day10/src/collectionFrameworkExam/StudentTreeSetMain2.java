package collectionFrameworkExam;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentTreeSetMain2 {

	public static void main(String[] args) {
		//set : 순서가 중요하지 않다. 단 중복은 허용하지 않는다.
		// 		입력 순서대로 출력되는 것은 아니다
		// 		중복을 체크 : hashCode, equals
		
//		Set<Student> set = new HashSet<Student>();
		TreeSet<Student> set = new TreeSet<Student>();  
		
		set.add(new Student("홍길동",20));
		set.add(new Student("박자바",32));
		set.add(new Student("홍길동",20));
		set.add(new Student("이하늘",28));
		
		System.out.println(set); 
		
		Set<String> aa = new TreeSet<String>();  
		aa.add("홍길동");
		aa.add("이자바");
		aa.add("허산");
		aa.add("홍길동");
		aa.add("박자바");
		System.out.println(aa);
		System.out.println();
		
		Set<Integer> bb = new TreeSet<Integer>();
		bb.add(90);
		bb.add(3);
		bb.add(83);
		bb.add(56);
		System.out.println(bb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
