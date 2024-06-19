package InterviewQuestions;

public class SmallestElement {

	public static void main(String[] args) {
		int []arr=new int [] {143,132,908,209};
        int min = arr[0];  
        for (int i=0;i<arr.length;i++) {  
           if(arr[i] < min)  
               min =arr[i];  
        }  
        System.out.println("Smallest element array: " + min);  
    }  
 
	}
	
