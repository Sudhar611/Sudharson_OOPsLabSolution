package com.gl.main;
import java.util.Scanner;
import com.gl.employee.*;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String firstName, lastName, department = "";
		boolean flag=false;
		int choice;
		
		System.out.println("Welcome to GL private Limited !");
		System.out.println("Please Enter your details");
		
		System.out.println("First Name: ");
		firstName = scanner.nextLine();
		System.out.println("Last Name: ");
		lastName = scanner.nextLine();
		
		Employee newEmp = new Employee(firstName, lastName); 
		
		do {
			System.out.println("Please enter the deparment from the following");
			System.out.println("1. Technical \n2. Admin\n3. Human Resource\n4. Legal");
		
					choice=scanner.nextInt();
					
					switch (choice) {
					case 1:{ department = "tech";}
					break;
					
					case 2:{ department = "admin";}
					break;
					
					case 3:{ department = "HR";}
					break;
					
					case 4:{ department = "legal";}
					break;

					default:{System.out.println("Invalid choice ! Please choose the correct department");}
					break;
					}
				
		} while (department == "" );
		
		newEmp.setDepartment(department);
		
		CredentialService newEmpService = new CredentialService();
		
		newEmpService.generateEmail(newEmp);
		newEmpService.generatePassword(newEmp);
		
		System.out.println("Dear "+ firstName + ", your generated credentials are as follows !");
		newEmpService.showCredentials(newEmp);
		
		scanner.close();
	}
	
	
	

}
