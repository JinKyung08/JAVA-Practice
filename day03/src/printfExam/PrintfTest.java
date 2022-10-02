package printfExam;

public class PrintfTest {

	public static void main(String[] args) {
		System.out.println(10/3);
		System.out.println(10.0/3);
		System.out.println();
		
		System.out.printf("%d\n",10/3);
		System.out.printf("%f",10.0/3);
		System.out.println();
		
		System.out.printf("%5d\n",10/3);
		System.out.printf("%.2f\n",10.0/3);
		System.out.println();
		
		System.out.printf("%s\n","홍길동");
		System.out.printf("%c\n",'a');
		System.out.println();
		
		
		System.out.println("==============================");
		System.out.println("이름\t국어\t수학\t영어");
		System.out.println("==============================");
		System.out.printf("%s\t%d\t%d\t%d\n", "홍길동",70,80,90);
		
		
		System.out.println("홍길동\t"+70+"\t"+80+"\t"+90);
		
		
	} // end of main

} // end of PrintfTest
