import java.lang.Math.*;
public class Sphere {
    // variable declaration
    private double radius;

    //constructors

    public Sphere(){
        this.radius = 0;
    }
    public Sphere(double radius){
        this.radius = radius;
    }

    //setter
    public void setRadius(double radius){
        this.radius = radius;
    }

    //getters
    public double getRadius(){
        return radius;
    }

    // This function calcualtes the area of the sphere
    public double calculateSphereSurfaceArea(){
        return 4 * Math.PI * radius * radius;

    }

    // This function calcualtes the volume of the sphere
    public double calculateSphereVolume(){
        return (4 * Math.PI * radius * radius * radius)/3;
    }



}