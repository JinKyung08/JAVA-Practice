package inheritanceExam;

public class Student { //extend object
// 학번, 이름, 나이 - private
	//필드 - 인스턴스 필드 (즉 객체가 생성될 때 객체 안에 만들어지는 것)
	private String ssn;  //공통으로 값을 주고 싶을 때 = "123"; //  외부에서 접근 X, 내부에서는 자유롭게 접근 가능
	private String name ; //= "홍길동";
	private int age;      //=20;
	private String major; 
	
// 생성자를 통해 초기화 -객체를 초기화하는 목적을 가지고있음
//	public Student() {
//		ssn = "123";		
//		name = "홍길동";
//		age = 20;
		
//		this.ssn = "123";		//구분가능할 때 this 안적어도됨
//		this.name = "홍길동";
//		this.age = 20;
//	}
//	생성자 - 매개값이 없는 생성자
	public Student() {     // 기본 생성자 - {}안에 아무것도 안주는것
		major = "컴퓨터 공학";//초기 설정 사항들을 만들어줌    //공통으로 넣어주고싶은것 생성자에 넣기
	}
//	생성자 -매개값이 있는 생성자
	public Student(String ssn, String name, int age, String major) { //지역변수
//		super();   // 부모생성자 호출 / 생략하면 컴파일러가 자동으로 호출함
		this.ssn = ssn;			//넘겨 받고 싶은것만 체크하면 됨.
		this.name = name;		//this.name : 필드 , name : 지역변수
		this.age = age;
		this.major = major;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		//유효성 검사 - 매개값으로 들어온 학번이 유효한지 안한지 확인
//		if() {}
		this.ssn = ssn;
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
	
	
	
// 메서드 => 학번과 이름과 나이가 출력
	public void showInfo() {
		System.out.println("학번 : " + this.ssn);  //this 생략 가능 필드라는걸 알 수 있기 때문 this:자기자신 객체
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("전공 : " + this.major);
	}

}
