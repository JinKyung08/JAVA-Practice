package algorithm_1;

import java.util.Scanner;

public class Algorithm_project1_sjk {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		//암호화문자열, 키값 입력 받기
	      String enc = in.next();
	      String dec = in.next();
	      
	      in.close();
	      //배열로 변환
	      char[] encC = enc.toCharArray();
	      char[] decC = dec.toCharArray();
	      
	      String result = "";
	      int copyIndex = 0;
	      
	      for (int i = 0; i < encC.length; i++) {
	         if(encC[i]==decC[copyIndex]) {
	            if(copyIndex<decC.length-1) {
	               copyIndex++;
	            }else if(copyIndex==decC.length-1) {
	               copyIndex=0;
	            }
	            continue;
	            
	         }else {
	            result+=encC[i];
	         }
	         
	      }
	      
	      System.out.println(result);
	   }

	}