package com.university.sppu;

public class Demo {

	public static void main(String[] args) {
	
		String str = "hello all";
	 char ch[] = str.toCharArray();
	 String reverse = " ";
		System.out.println("original string is::"+str);
		for(int i=ch.length-1;i>=0;i--)
		{
			reverse = reverse + ch[i];
		}
		System.out.println("reverse string is::"+reverse);
	}

}
