package Bedroom;
public class Bed {

    private String size ; //queen, double, twin, king
    private int numberOfPillows;
    private String color;
    private String material; //wooden, metal

    public Bed(String size, int numberOfPillows, String color, String material) {
        this.size = size;
        this.numberOfPillows = numberOfPillows;
        this.color = color;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumberOfPillows() {
        return numberOfPillows;
    }

    public void setNumberOfPillows(int numberOfPillows) {
        this.numberOfPillows = numberOfPillows;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void make(){
        System.out.println("Bed class - make() method ");
    }
}