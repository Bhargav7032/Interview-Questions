package InterviewQuestions;

public class StringSplit1 {
	public static void main(String[]args) {
		String str ="jerry,Bhargav,Viganesh,Satish";
		String arr[]=str.split(",");
//		
//		for (int i = 0; i < arr.length; i++) {
//			String string = arr[i];
//			if (arr[i].length() % 2==0) {
//				System.out.println(arr[i]);
//				
//			}
//		}
		
		
		for (String string : arr) {
			if (string.length() % 2!=0) {
				System.out.println(string);
				
			}
			
		}
	
		
	}

}
