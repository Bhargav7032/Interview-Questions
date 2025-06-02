package com.ciq;

public class SingletonDemo1 {
	
	/*
	 * Singleton class create into two types 1.egarlyloading 2.lazyloading
	 * Make the constructor private.
       Create a private static instance of the class.
       Provide a public static method to get the instance. 
	 */

	//private static  SingletonDemo1 singletonDemo1=new SingletonDemo1(); //egarlyloading

	private static  SingletonDemo1 singletonDemo2=null; //lazyloading

	
	private SingletonDemo1() {
	}
	
	
	/* egarlyloading */
//	private static SingletonDemo1 getSingleton() {
//		return singletonDemo1;
//	}
	
	
	/* lazyloading */
	private static SingletonDemo1 getSingleton() {
		if(singletonDemo2 == null) {
			SingletonDemo1 singletonDemo2=new SingletonDemo1();
		}
		return singletonDemo2;
	}
	
	
	public static void main(String[] args) {
		SingletonDemo1 singletonDemo1=SingletonDemo1.getSingleton();
		SingletonDemo1 singletonDemo2=SingletonDemo1.getSingleton();
		SingletonDemo1 singletonDemo3=SingletonDemo1.getSingleton();

		System.out.println(singletonDemo1);
		System.out.println(singletonDemo2);
		System.out.println(singletonDemo3);
	}
}
