package com.main;

public class StringReverse {
	public static String Reshape(String str){
		String rev="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev+=ch[i];
		}
		return rev;
	}

}
