package Bedroom;
public class Size {
    private double height;
    private double width;
    private double length;

    public Size(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
    public Size(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;

    }
    public double getLength() {
        return length;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

}