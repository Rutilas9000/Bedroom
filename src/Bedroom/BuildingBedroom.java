package Bedroom;

public class BuildingBedroom {
    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");
        Size size = new Size(10,5);
        Ceiling ceiling = new Ceiling(2,"white", size);
        Bed bed = new Bed(4,"King", "white","wood");
        Desk desk = new Desk("Brown","rectangle","wood");
        Door door = new Door(size, "brown", "wood");
        Bedroom myBedroom = new Bedroom("Savion", wall1, wall2, wall3, wall4, ceiling, bed, desk, door);
        System.out.println(myBedroom);
    }
}
