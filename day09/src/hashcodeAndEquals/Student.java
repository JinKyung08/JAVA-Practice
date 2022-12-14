package hashcodeAndEquals;

public class Student implements Comparable<Student> {
		String name;
		int ssn;
		
		
		public Student(String name, int ssn) {
			super();
			this.name = name;
			this.ssn = ssn;
		}
		
//		@Override
//		public String toString() {
//			String result ="";
//			
//			result +=  "이름 : " + name ;  // result = result + "이름 : " + name;
//			result += "\n학번 : " + ssn;
//			
//			return result;
//			return name + "," + ssn;
//		}
		
		//hashcode 정의
		@Override
		public int hashCode() {
			return ssn +name.hashCode(); //이름과 학번이 같으면 같은 사람이라고 재정의
		}
		
		
		@Override
		public boolean equals(Object obj) {
			// 형변환 가능여부 확인
			if(obj instanceof Student) {
				Student std = (Student)obj; //부모(obj) -> 자식으로 다운캐스팅
				if((this.ssn == std.ssn) && this.name.equals(std.name)) {
					return true;
				}
			}
			
			return false;
		}
		
		@Override
		public int compareTo(Student s) {
			//오름차순 정렬
			if(this.ssn > s.ssn) {
				return 1;
			}else if (this.ssn == s.ssn) {
				return 0;
			}else {
				return -1;
			}
			
//			return this.ssn - s.ssn; // 오름차순
//			return s.ssn - this.ssn; // 내림차순
			}
		
		
		
		
		
		
		
} // end of class
