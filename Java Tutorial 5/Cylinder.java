import java.lang.Math.*;
public class Cylinder {
    // variable declaration
    private double radius;
    private double height;


    //constructor declaration
    public Cylinder() {
        this.radius = 0;
        this.height = 0;
    }

    public Cylinder(double radius, double hight) {
        this.radius = radius;
        this.height = hight;
    }

    //setter
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setHight(double hight){
        this.height = height;
    }

    //getters
    public double getRadius(){
        return radius;
    }


    public double getHight(){
        return height;
    }

    // This function calcualtes the area of the cylinder
    public double calculateCylinderSurfaceArea(){
        return 2 * Math.PI * radius * (height+radius);

    }

    // This function calcualtes the volume of the cylinder
    public double calculateCylinderVolume(){
        return Math.PI * radius * radius * height;
    }


}