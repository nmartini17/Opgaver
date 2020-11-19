package Task2;

public class Building {
    //Egenskaber
    private final Room[] rooms;
    private int numberOfRooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    //Konstruktører
    public Building(int numberOfRooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
        rooms = new Room[numberOfRooms];
    }

    //Metoder

    public Room[] getRooms() {
        return rooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}