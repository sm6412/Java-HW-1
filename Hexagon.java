import java.util.Scanner;

public class Hexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Name: Samira Mantri
		// Date: 9/17/16
		// Assignment: #1
		// Summary: this program will ask the user to enter the side length of a hexagon and 
		// compute its area and perimeter
		
		// introduce the goal of the program to the user
		System.out.println("Hello. We are going to compute a hexagon's area and perimeter.");
		
		// use the scanner in order to create an input
		Scanner in= new Scanner(System.in);
		
		// ask the user what the length of the side will be
		System.out.println("First, please enter the length of the side: ");
		double length= in.nextDouble();
		
		// calculate the perimeter and area with the entered length
		double perimeter= 6 * length;
		double root= Math.sqrt(3);
		double area= (6*length*length)/(4*(root/3));
		
		// print the resulting perimeter and area
		System.out.println("");
		System.out.println("-----Results-----");
		System.out.println("");
		System.out.println("The area of the hexagon will be: "+area+" units squared");
		System.out.println("The perimeter of the hexagon will be: "+perimeter+" units");
		
		// close scanner
		in.close();
		
		

		
		
		

	}

}
