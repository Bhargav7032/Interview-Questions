package com.demo;
public class PalindromeDemo {
	public static void main(String[] args) {

		int num = 123;
		int rev = 0;
		int flag = num;

		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		
		if(rev == flag) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}
}
