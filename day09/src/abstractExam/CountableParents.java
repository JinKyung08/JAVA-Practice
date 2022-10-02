package abstractExam;

public abstract class CountableParents {
			//필드
		public String name;
		public int num;
	
		
		//생성자
       public CountableParents(String name, int num) {
//    	   	super();
    	   	this.name = name;
    	   	this.num = num;
       }	

       //추상메서드
       public abstract void showCount();



}//end of class





