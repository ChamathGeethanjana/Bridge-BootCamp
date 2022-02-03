import java.lang.Math.*;
public class Circle{
	// Class Members

	// variable declaration
	private double radius;

	//constructor
	public Circle(){
		radius = 0;
	}
	public Circle(double radius){
		this.radius = radius;
	}

	//setter
	public void setRadius(double radius){
		this.radius = radius;
	}

	//getter
	public double getRadius(double radius){
		return radius;
	}

	// This function calcualtes the area of the circle
	double calculateCircleArea(){ 
		double circleArea;
		circleArea = Math.PI*radius*radius;
		return circleArea;
	}
	
	// This function calcualtes the circumference of the circle
	double calculateCircleCircumference(){ 
		return 2*Math.PI*radius;
	}
	
}