package Task1;

public class Driver {
    //Egenskaber
    private String name;
    private int age;

    //Konstruktører
    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Metoder
    public String toString() {
        return " is driven by "+name;
    }
}
