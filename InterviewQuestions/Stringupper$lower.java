package InterviewQuestions;

public class Stringupper$lower {
	public static void main(String[] args) {
//		String str = "java";
//		String strArr[] = str.split("");
//
//	for (int i = 0; i < str.length(); i++) {
//			if (i % 2== 0) {
//				System.out.print(strArr[i].toUpperCase());
//			} else {
//				System.out.print(strArr[i].toLowerCase());
//			}
//		}
//}
//	
	
	
	
	String str="BhargavRam";
	String strarr[]=str.split("");
	
	for(int i=0;i<str.length();i++) {
		//if(i%2!=0) {
		if (i % 2==0) {
			System.out.print(strarr[i].toUpperCase());
		}else {
			System.out.print(strarr[i].toLowerCase());
				
			}
		}
		
	}
	   
	  }
	

	
	
	

