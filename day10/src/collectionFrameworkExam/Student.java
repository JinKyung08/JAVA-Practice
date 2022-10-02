package collectionFrameworkExam;

public class Student implements Comparable<Student> {
	public String name;
	public int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	@Override
	public int hashCode() {
		return age +name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) { //obj 모든 객체가 다 올 수 있다는 뜻
		if(obj instanceof Student) { //obj가 스튜던트 타입으로 바뀔수 잇는지
			Student s = (Student)obj;   // 강제형변환을 하겟다
			if ((this.age == s.age) && (this.name.equals(s.name))){
				return true;
			}	
				
		}
		return false;
	}
	
	
	
	@Override
	public int compareTo(Student o) {
			if(this.age>o.age) {
				return 1;
			}else if (this.age == o.age) {
				return 0;
			}else {
				return -1;
			}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
