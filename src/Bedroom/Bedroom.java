package Bedroom;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Desk desk;
    private Door door;


    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Desk desk, Door door) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.desk = desk;
        this.door = door;
    }

    public String getName() {
        return name;
    }
    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Bed getBed() {
        return bed;
    }

    public Desk getDesk() {
        return desk;
    }

    public Door getDoor() {
        return door;
    }

    public void makeBed(){
        System.out.println("makeBed() method from bedroom class make a bed");
        this.make();
        bed.make();
    }


    public String toString() {
        return "The owner of the room's name is " +this.name+"." +" The color of door is " + door.getColor() +" and there is a new desk that is made of " + desk.getMaterial() +". " +"Their bed is a size "+ bed.getSize()+".";
    }

    public void make(){
        straightenSheet();
    }
    public void straightenSheet(){
        System.out.println("Straightening the sheet");
    }
}