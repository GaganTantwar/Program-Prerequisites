//Q2 Write a program that takes two numbers as input from the user and prints their sum.
//Solution :
import java.util.*;
class Addition{ //class Addition 
    public static void main(String args[]){ //main function
	    Scanner sc=new Scanner(System.in); //Scanner class object
		int x= sc.nextInt(); // 1 input variable
		int y= sc.nextInt(); // 2 input variable
		int sum=x+y; //variable sum for storing summition
		System.out.println("Addition of two  Number: "+ sum); // final sum of two numbers
		}
	}