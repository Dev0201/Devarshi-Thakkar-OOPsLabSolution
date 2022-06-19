package com.itsupportadmin.service;
import java.util.Random;
import com.itsupportadmin.model.employee;

public class CredentialService {
	
	public char[] generatepass() {
		
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	    String specialCharacters = "!@#$";
	    String numbers = "1234567890";
	    
	    String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	    
	    Random random = new Random();
	    
	    char[] password = new char[8];
	    for(int i=0;i<8;i++) {
	    	password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	    }
	    	    
	    return password;
	    
	}
	
	public String geneMailId(String firstName, String lastName, String deptName) {
		
		String strMailId = firstName + lastName + "@" +deptName+".company.com";
		
		return strMailId;		
		
	}
	
	public void showCred(employee empDetails, String strMailId,char[]password) {
		System.out.println("Hey "+empDetails.getFirstName()+" " + empDetails.getLastName()+" your eMail ID is");
		
		System.out.println(strMailId);
		
		System.out.println("****PASSWORD****");
		
		System.out.println(generatepass());
		
	}
	
	
}
