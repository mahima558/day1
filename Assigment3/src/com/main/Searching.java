package com.main;

public class Searching {
		public String searchElement(int[] array, int num){
			String str="";
			for(int i=0;i<array.length;i++){
				if(array[i]==num){
					str=num +"element is exists";
					break;
				}else{
					str = num +"element does not exists";
				}
			}
			return str;
		}
		
	   
	}



