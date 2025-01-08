//Q9  Write a program that takes three numbers as input from the user and printstheir average.
// Solution
import java.util.*;
class Average {//class Average
    public static void main(String args[]){ //main function
	    Scanner sc = new Scanner(System.in); //Scanner class object
		int a = sc.nextInt(); //  input variable a
        int b = sc.nextInt();		//  input variable b
        int c  = sc.nextInt();		// input variable c 
		double avg = (a+b+c)/3;  // Average
		System.out.println("Average "+ avg); 
		
		}
}