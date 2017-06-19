import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Name: Samira Mantri
		// Date: 9/19/16
		// Assignment: #1
		// Summary: this program will display the name and bonus amount for the employee
		// with the highest bonus 
		
		
		// open the scanner 
		Scanner in= new Scanner(System.in);
		
		// ask the user to enter the number of employees
		System.out.println("Please enter the number of employees: ");
		int EmployeeNum= in.nextInt();
		
		// set the bonus to 0 and create an empty string 
		Double HighestBonus = 0.0;
		String EmployeeWithBonus="";
		
		// use a for loop to ask the user for the name and bonus of each employee
		for (int i = 0; i < EmployeeNum; ++i) {
			// prompt user for name
			System.out.println("Please enter the name of the employee: ");
			String EmployeeName = in.next();
			// prompt user for bonus amount
			System.out.println("Please enter the bonus amount for the employee: ");
			Double EmployeeBonus= in.nextDouble();
			// use conditions to see whether the amount is more
			if (EmployeeBonus>HighestBonus){
				HighestBonus= EmployeeBonus;
				EmployeeWithBonus=EmployeeName;
				
				
			}
		}
		// Tell the user which employee had the highest bonus and how much was it
		System.out.print("The employee with the Higest Bonus was "+EmployeeWithBonus+
		" and the bonus for this employee was $"+HighestBonus);
		
		// close scanner
		in.close();
				
		
	}

}
