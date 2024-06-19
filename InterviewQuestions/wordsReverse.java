package InterviewQuestions;
public class wordsReverse {
public static void main(String[] args) {
	String str = "Jai Sri Ram";
    String arr[] = str.split(" "); 
    for (int i = arr.length-1; i >= 0; i--) {
        if(i==0 || i == arr.length-1) {
            String word = arr[i];
            String rev = "";
            for (int j = word.length()-1; j >= 0; j--) {
                rev = rev + word.charAt(j);
            }
            System.out.print(rev+" ");
        }else {
            System.out.print(arr[i]+" ");
        }
    }
 
}
}
