
public class Cuboid {
    // variable declaration
    private int length;
    private int width;
    private int height;

    //constructor
    public Cuboid(){
        height = 0;
        length = 0;
        width = 0;
    }

    public Cuboid(int length,int width,int height){
        this.height = height;
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

    public void setHight(int height){
        this.height = height;
    }

    // getter

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public int getHight(){
        return height;
    }

    // other methods


    // This function calcualtes the area of the cuboid
    public int calculateCuboidSurfaceArea(){
        return 2 * (length * width + length * height + width * height);

    }

    // This function calcualtes the volume of the cuboid
    public int calculateCuboidVolume(){
        return length*width*height;
    }


}