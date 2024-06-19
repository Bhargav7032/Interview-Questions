package InterviewQuestions;

public class StringSplit {

	public static void main(String[] args) {
		String str = "Balaji Bhargavi Pranavi Padmas Dhrma";
		String[] arr = str.split(" ");
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i].length() % 2 == 0) {
//				System.out.println(arr[i]);
//			}
//		}

		// <........forEachloop.......> //
		
		for (String ele : arr) {
			if (ele.length() % 2 == 0) {
				System.out.println(ele);
			}
		}
		
		
	}}

