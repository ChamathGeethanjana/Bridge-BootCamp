public class Rectangle{
    // Class Members 

	// variable declaration
	private int length;
	private int width;

	//constructors
	public Rectangle(){
		length = 0;
		width = 0;
	}

	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}

	//setter
	public void setLength(int length){
		this.length = length;
	}

	public void setWidth(int width){
		this.width = width;
	}

	//getters

	public int getLength(){
		return length;
	}

	public int getWidth(){
		return width;
	}


	// This function calcualtes the area of the rectangle
	int calculateRectangleArea(){ 
		return length * width;
	}
	
	// This function calcualtes the perimeter of the rectangle
	int calculateRectanglePerimeter(){ 
		return 2*(length + width);
	}
	
}