//Q4 Write a program to calculate the area of a circle. Take the radius as input and use the formula: Area = π * radius^2.
//Solution :
import java.util.*;
class Circle {//class Cricle
    public static void main(String args[]){ //main function
	    Scanner sc = new Scanner(System.in); //Scanner class object
		int radius = sc.nextInt(); //  input variable for radius of Circle 
		double area =  (3.14*radius*radius); // finding area of circle 
		System.out.println("Area of Circle "+ area); // Area of Circle
		}
}