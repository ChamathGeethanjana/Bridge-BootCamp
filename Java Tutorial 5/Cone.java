import java.lang.Math.*;
public class Cone {
    // variable declaration
    private double radius;
    private double height;


    //constructors
    public Cone(){
        radius = 0;
        height = 0;
    }

    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    //setter
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setHight(double height){
        this.height = height;
    }

    //getters
    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    // This function calcualtes the area of the Cone
    public double calculateConeSurfaceArea(){
        return Math.PI * radius * (radius + Math.sqrt(height*height + radius*radius) );
    }

    // This function calcualtes the volume of the Cone
    public double calculateConeVolume(){
        return (Math.PI * radius * radius * height)/3;
    }
}