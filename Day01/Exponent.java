//Q8 Write a program that takes two numbers as input: a base and an exponent,and prints the result of base raised to the exponent (without using loops or conditionals)
// Solution
import java.util.*;
import java.lang.Math;
class Exponent {//class Exponent
    public static void main(String args[]){ //main function
	    Scanner sc = new Scanner(System.in); //Scanner class object
		double base =sc.nextInt();//  input variable base
        double expo  = sc.nextInt();// input variable for expo
		double power = Math.pow(base,expo); // finding power
		System.out.println("Exponent : "+ power); // Exponent
		}
}