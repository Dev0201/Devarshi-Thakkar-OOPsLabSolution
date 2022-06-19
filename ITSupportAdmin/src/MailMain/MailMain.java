package MailMain;

import java.util.Scanner;
import com.itsupportadmin.model.employee;
import com.itsupportadmin.service.CredentialService;

public class MailMain {
	
	public static void main (String[] args) {
		char[] password;
		
		String strGeneMailId;
		Scanner sc = new Scanner (System.in);
		String firstName;
		String lastName;
		System.out.println("First Name?");
		firstName = sc.nextLine();
		System.out.println("Last Name?");
		lastName = sc.nextLine();
		CredentialService credentialservice = new CredentialService();
		employee empDetails = new employee (firstName, lastName);
		System.out.println("Pick a Department");
		System.out.println("1. Tech");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		int options = sc.nextInt();
		if(options == 1) {
			strGeneMailId = credentialservice.geneMailId(empDetails.getFirstName(), empDetails.getLastName() + "Tech", lastName);
			password = credentialservice.generatepass();
			credentialservice.showCred(empDetails, strGeneMailId, password);	
		}
		else if(options == 2) {
			strGeneMailId = credentialservice.geneMailId(empDetails.getFirstName(), empDetails.getLastName() + "Admin", lastName);
			password = credentialservice.generatepass();
			credentialservice.showCred(empDetails, strGeneMailId, password);
		}
		else if(options == 3) {
			strGeneMailId = credentialservice.geneMailId(empDetails.getFirstName(), empDetails.getLastName() + "HR", lastName);
			password = credentialservice.generatepass();
			credentialservice.showCred(empDetails, strGeneMailId, password);
		}
		else if(options == 4) {
			strGeneMailId = credentialservice.geneMailId(empDetails.getFirstName(), empDetails.getLastName() + "Legal", lastName);
			password = credentialservice.generatepass();
			credentialservice.showCred(empDetails, strGeneMailId, password);
		}
		else System.out.println("Invalid Option");
	}

}
