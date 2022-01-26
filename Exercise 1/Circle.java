class Circle{
    // Class Members 

	// variable declaration
	double radius;

	// This function calcualtes the area of the circle
	double calculateCircleArea(){ 
		double circleArea;
		circleArea = 22/7*radius*radius;
		return circleArea;
	}
	
	// This function calcualtes the circumference of the circle
	double calculateCircleCircumference(){ 
		return 2*22/7*radius;
	}
	
}