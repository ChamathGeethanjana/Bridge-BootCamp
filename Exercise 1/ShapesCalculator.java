import java.util.Scanner;

public class ShapesCalculator{
	public static void main (String args[]){

		double radius;
		int length, width;
		double circleArea;
		double circleCircumference;
		int rectangleArea;  
		int rectanglePerimeter;  
		
		// user inputs - is a responsibility of main function
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius of the circle : ");
		radius = input.nextDouble();

		System.out.println("Enter length of the rectangle: ");
		length = input.nextInt();
		System.out.println("Enter width of the rectangle : ");
		width = input.nextInt();
		
		// created object 
		Circle c1 = new Circle();
		c1.radius = radius;
		
		Rectangle r1 = new Rectangle();
		r1.length = length;
		r1.width = width;
		
		

		// call classes 
		circleArea = c1.calculateCircleArea();
		circleCircumference = c1.calculateCircleCircumference();

		rectangleArea = r1.calculateRectangleArea();
		rectanglePerimeter = r1.calculateRectanglePerimeter();

		// display output - is a responsibility of main function
		System.out.println("Area of the circle : "+circleArea);
		System.out.println("Circumference of the circle : "+circleCircumference);
		System.out.println("Area of the rectangle : "+rectangleArea);
		System.out.println("Perimeter of the rectangle: "+rectanglePerimeter);	
	}
	

	

}