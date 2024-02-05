package Bedroom;
public class Desk {
    private String color;
    private String shape;
    private String material;

    public Desk(String color, String shape, String material) {
        this.color = color;
        this.shape = shape;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}