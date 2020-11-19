package Task2;

public class Room {
    //Egenskaber
    private int numberOfWalls;
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    //Konstruktører
    public Room(int numberOfWalls, int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.numberOfWalls = numberOfWalls;
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;

    }


    //Metoder
    public int getNumberOfWalls() {
        return numberOfWalls;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
