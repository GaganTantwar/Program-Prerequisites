//Q6  Write a program to calculate simple interest using the formula: Simple Interest = (Principal * Rate * Time) / 100. Take Principal, Rate, and Time as inputs from the use.
// Solution
import java.util.*;
class SimpleInterest {//class SimpleInterest
    public static void main(String args[]){ //main function
	    Scanner sc = new Scanner(System.in); //Scanner class object
		int principal = sc.nextInt(); //  input variable for principal
        float rate = sc.nextFloat();		//  input variable for rate
        int time  = sc.nextInt();		// input variable for time 
		double si = (principal*rate*time)/100; // finding simple interest
		System.out.println("Simple Interest: "+ si); // Simple Interest 
		}
}