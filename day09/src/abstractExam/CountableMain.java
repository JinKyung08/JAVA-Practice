package abstractExam;

public class CountableMain {

	public static void main(String[] args) {
		
//		 Tree tree01 = new Tree("자작나무",5);
//		 Tree tree02 = new Tree("은행나무",3);
//		 Tree tree03 = new Tree("단풍나무",10);
//
//		 Bird bird01 = new Bird("뻐꾸기",5);
//		 Bird bird02 = new Bird("참새",10);
//		 Bird bird03 = new Bird("비둘기",3);

		CountableParents[] cParent = {new Tree("자작나무",5),new Tree("은행나무",3),new Tree("단풍나무",10),
				new Bird("뻐꾸기",5),new Bird("참새",10),new Bird("비둘기",3)
		};
				
//		 tree01.showCount();
//		 tree02.showCount();
//		 tree03.showCount();
//		 System.out.println();
//		 
//		 bird01.showCount();
//		 bird02.showCount();
//		 bird03.showCount();
//		 System.out.println();

		
		for(CountableParents printChild : cParent) {
			printChild.showCount();
		}
		System.out.println();
		
		
//		 tree01.beColored();
//		 tree02.beColored();
//		 tree03.beColored();
//		 System.out.println();
//		 
//		 bird01.fly();
//		 bird02.fly();
//		 bird03.fly();

		if(cParent[0] instanceof Tree) {
//			((Tree) cParent[0]).beColored();
			Tree t = (Tree) cParent[0];
			t.beColored();
			
		}else if (cParent[3] instanceof Bird) {
//			((Bird)cParent[3]).fly();
			Bird b = (Bird) cParent[3];
			b.fly();
		}
		
		
		
		

	}

}
