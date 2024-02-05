package Bedroom;
public class Ceiling {
    private int numOfLights;
    private String color;
    private Size size;

    public Ceiling(int numOfLights, String color, Size size) {
        this.numOfLights = numOfLights;
        this.color = color;
        this.size = size;
    }

    public int getNumOfLights() {
        return numOfLights;
    }

    public void setNumOfLights(int numOfLights) {
        this.numOfLights = numOfLights;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Size getSize() {

        return size;
    }
    public double getLength(){
        return size.getLength();
    }
    public double getWidth(){
        return size.getWidth();
    }

    public void setDimensions(Size size, double width, double length){
        size = new Size (width, length);
        this.size = size;
        this.size.setWidth(width);
        this.size.setLength(length);
    }

    public void setSize(Size size){
        this.size = size;

    }

}