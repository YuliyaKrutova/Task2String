package com.krutova.tasktwo.string;

public class StringTask3 {

public static void main(String[] args) {
		
		String string = "asPAsd sPDddPasd sdsdasPAdfP";
		System.out.println("Before: "+string);
	
		string = string.replace(string.charAt(string.indexOf("P")+1), ((string.charAt(string.indexOf("P")+1)=='A')?'O':(string.charAt(string.indexOf("P")+1))));
		System.out.println("Before: "+string);
	}
}
