package InterviewQuestions;

public class Vowels {

	public static void main(String[] args) {
		String str = "BhagavRam";

		String vowels = "a'A'e'E'i'I'o'O";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (vowels.contains(ch + "")) {
				System.out.print(ch);
			}

		} 

		// Another away//
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'U' || ch == 'u') {
				System.out.print(ch);
			}

		}
	}
}
