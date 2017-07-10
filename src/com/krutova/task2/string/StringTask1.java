package com.krutova.task2.string;

public class StringTask1 {

	public static void main(String[] args) {
		
		int k = 4;
		char newChar = '@';
		String string = "Lambda expressions are a new and important feature included in Java SE 8";
		System.out.println("Before: "+string);

		String newString="";
		String[] stringList = string.split(" ");
		for (String word : stringList){
			if (word.length()>=k){
				word=word.replace(word.charAt(k-1), newChar);
			}
			newString=newString+word+" ";
		}
		newString=newString.trim();
		System.out.println("After:  "+newString);
	}
}
