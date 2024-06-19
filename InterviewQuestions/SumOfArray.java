package InterviewQuestions;
public class SumOfArray {  
    public static void main(String[] args) {  
//        int [] arr = new int [] {2, 4, 6, 8, 10};  
//        int sum = 0;  
//        for (int i = 0; i < arr.length; i++) {  
//           sum = sum + arr[i];  
//        }  
//        System.out.println("Sum of all the elements of an array: " + sum);  
   
    	
    	
  //  	int []arr = new int[] {23,32,35,54,21};
//    	int sum=0;
//    	for(int i=0;i<arr.length;i++) {
//    		sum=sum+arr[i];
//    	}
//    	System.out.println("sum of all the Element of an Array: "+sum);
    
    	
    	
    	int arr[]= {1,2,4,3};
    	int sum=0;
    	for(int i=0;i<arr.length;i++) {
    		if (i%2==0)
    		sum =sum+arr[i];
    		
    	}
    	System.out.println(sum);
    		}
    }
    
    	