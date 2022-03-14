package com.gl.employee;

public class CredentialService {
	
	public void generateEmail(Employee e) {
		String email;
		email = e.getFirstName() + e.getLastName() + "@" + e.getDepartment() + ".gl.com";
		e.setEmail(email);
	}
	
	public void generatePassword(Employee e) {
		String password;
		int number = (int) (Math.random()*1000);
		int randIndex;
		
		String smallLetter = "abcdefghijklmnopqrstuvwxyz";
		randIndex = (int) (Math.random()* (smallLetter.length()));		
		String charSmall = String.valueOf(smallLetter.charAt(randIndex));
		
		String capLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		randIndex = (int) (Math.random()* (capLetter.length()));	
		String charCaps = String.valueOf(capLetter.charAt(randIndex));
		
		String splChars = "!~!@#$%^&*";
		randIndex = (int) (Math.random()* (splChars.length()));	
		String charSpl = String.valueOf(splChars.charAt(randIndex));
		
		password = charSmall + charCaps + charSpl + number;
		
		e.setPassword(password);
	}
	
	public void showCredentials(Employee e) {
		System.out.println("Email: "+ e.getEmail());
		System.out.println("Password: "+ e.getPassword());
	}

}
