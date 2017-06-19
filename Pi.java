
public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Name: Samira Mantri
		// Date: 9/17/16
		// Assignment: #1
		// Summary: this program will compute and display the value of pi done through two mathematical calculation
		
		// initialize the variables which will be the answer to the two computations
		double FirstProblem;
		double SecondProblem;
		
		// assign the variables
		// use the formula for pi to compute its value
		FirstProblem= 4.0*(1.0-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
		
		// add another number in the formula into the computation
		SecondProblem= 4.0*(1.0-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)+(1.0/13));
		
		System.out.println("When trying to find the closest value of pi we can use the following formulas to narrow down its value:\n"+"\n"+
		"4*(1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11))\n"+ "or\n" +"4*(1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)+(1/13))\n");
		
		// print the answers to the two computations 
		System.out.println("The first formula yields the answer:"+FirstProblem);
		System.out.println("The second formula yields the answer:"+SecondProblem);
		
				
				
		
				
		

	}

}
