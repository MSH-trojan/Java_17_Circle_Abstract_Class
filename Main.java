package main;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	Circle c1 = new Circle(); // class object with a default constructor. 
	
	System.out.println("The first circle is " + c1.getColor() + " and has radius of " + c1.getRadius() + ", area of "+ c1.calculateArea() + " and perimeter of " + c1.getPerimeter()); // getting the 4 elements for the first circle.
	
	System.out.println();
	
	Circle c2 = new Circle(0.0 , " "); // now, initializing the parameter values and then setting them in the inputs given by the user.
	
	System.out.println("Please enter the radius for the second circle: ");
	c2.setRadius(input.nextDouble()); //setting the value of radius for c2 to be the input value given by the user.
	
	while(c2.getRadius() < 0) { // while this input is negative, we will have another message asking for a positive one.
	System.out.println("Please enter a positive value of the radius for the second circle:");
	c2.setRadius(input.nextDouble());
	}
	// consuming the next input and making the reserved place empty so we'll have a new input for the new circle radius.
	input.nextLine();
	
	System.out.println("Please enter color for the second circle: "); // setting the color for the c2 circle by the input.
	c2.setColor(input.nextLine());
	
	System.out.println("The second circle is " + c2.getColor() + " and has radius of " + c2.getRadius() + ", area of " + c2.calculateArea() + " and perimeter of " + c2.getPerimeter());
	
	System.out.println();
	
	System.out.println("Please enter the new radius for the second circle:");
	c2.setRadius(input.nextDouble());
	
	while(c2.getRadius() < 0) {
	System.out.println("Please enter a positive value of the new radius for the second circle:");
	c2.setRadius(input.nextDouble());
	}
	
	System.out.println("The radius of the " + c2.getColor() + " became " + c2.getRadius() + ", its area now is " + c2.calculateArea() + " and its perimeter is now " + c2.getPerimeter());
	}
}