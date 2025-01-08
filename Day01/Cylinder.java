//Q5  Write a program to calculate the volume of a cylinder. Take the radius and height as inputs and use the formula: Volume = π * radius^2 * height.
// Solution
import java.util.*;
class Cylinder {//class Cylinder
    public static void main(String args[]){ //main function
	    Scanner sc = new Scanner(System.in); //Scanner class object
		int radius = sc.nextInt(); //  input variable for radius of cylinder
        int height = sc.nextInt(); //  input variable for height of cylinder	
		double volume =  (3.14*radius*radius)*height; // finding volume of cylinder
		System.out.println("Volume of Cylinder "+ volume); // Volume of Cylinder
		}
}