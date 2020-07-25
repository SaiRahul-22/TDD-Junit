package com.epam.app;

public class removeA {

	public static String remov(String string) {
		// TODO Auto-generated method stub
		if(string.length()>0) {
			String str = string;
			String sr = "";
			if(str.charAt(0)=='A') {
				sr = str.replaceFirst("A","");
				if(sr.charAt(0)=='A') {
					 sr = sr.replaceFirst("A","");
				}
			}
			else if(str.charAt(1)=='A') {
				sr = str.replaceFirst("A","");
			}
			if(sr.length()>0) {
				return sr;
			}
			return str;
		}
		else {
			return "";
		}
	}
	
}
