package com.ciq.sum;

public class SumDemo {

	
	public static void main(String[] args) {
		int[] arr= {2,5,7,8,5};
		int sum=10;
		//[2,8] [5,5]
		
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("index"+i+" "+j+" "+"["+arr[i]+","+ arr[j] +"]");
				}
			}
			
		}
	}
}
