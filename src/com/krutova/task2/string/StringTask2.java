package com.krutova.task2.string;

public class StringTask2 {

public static void main(String[] args) {
		
		String string = "Lambda expressions";//"Lambda expressions are a new and important feature included in Java SE 8";
		String letterString="";
		String codeString="";

		char [] chars = string.toCharArray();
		for (char letter : chars){
			letterString = letterString+letter+"  ";
			codeString = codeString+(((int)letter>99 )? (int)letter : (int)letter+" ") ;
		}
		System.out.println("LetterString = "+letterString);
		System.out.println("CodeString   = "+codeString);
	}

}
