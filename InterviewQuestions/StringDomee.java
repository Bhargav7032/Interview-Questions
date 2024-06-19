 package InterviewQuestions;

public class StringDomee {
	public static void main(String[] args) {
String str="Bhargav";
String strArr[]=str.split("");

for (int i = 0; i < str.length(); i++) {
	if (i % 2==0) {
		System.out.print(strArr[i].toLowerCase());
	}else {
		System.out.print(strArr[i].toUpperCase());
	}
}
}
}
