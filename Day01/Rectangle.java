//Q7   Write a program to calculate the perimeter of a rectangle. Take the length and width as inputs and use the formula: Perimeter = 2 * (length + width).
// Solution
import java.util.*;
class Rectangle {//class Rectangle
    public static void main(String args[]){ //main function
	Scanner sc = new Scanner(System.in); //Scanner class object
	double length =sc.nextInt();//  input variable for length
        double width  = sc.nextInt();// input variable for width
	double perimeter =2*(length+width); // finding perimeter
	System.out.println("Perimeter of Rectangle: "+ perimeter); // Perimeter of Rectangle
	}
}
