class Rectangle{
    // Class Members 

	// variable declaration
	int length;
	int width;

	// This function calcualtes the area of the rectangle
	int calculateRectangleArea(){ 
		return length * width;
	}
	
	// This function calcualtes the perimeter of the rectangle
	int calculateRectanglePerimeter(){ 
		return 2*(length + width);
	}
	
}