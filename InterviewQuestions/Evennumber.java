package InterviewQuestions;

import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		/*
		 * int i;
		 * 
		 * for( i=1;i<=10;i++) { if (i % 2 == 0) {
		 * 
		 * System.out.println(i); } } } }
		 */
		
		
	 Scanner scan = new Scanner(System.in);
     System.out.println("Enter number :");
      int num =scan.nextInt();
		
		if(num % 2 == 0) {
			
			System.out.println("Even number:" +num);
		}else {
			System.out.println("Odd number:" +num);
				
			}
			
		}
	}
   
