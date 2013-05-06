package com.udla.edu.ec.hash;

public class CustomHash {

	public String hash(String arg) {
		
		String res = ""; 
		int ascii = 0;
		for (int i = 0; i < arg.length(); i++) {
			
			ascii = ((int)arg.charAt(i)) - 1;
			res+= ""+(char)ascii; 
		}
		return res;
	}
}
