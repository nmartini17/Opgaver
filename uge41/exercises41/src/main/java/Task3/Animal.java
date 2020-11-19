package Task3;

public class Animal implements AnimalSound{
    //Egenskaber
    private int numberOfLegs;

    //Konstruktører
    public Animal(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }

    //Metoder

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void makeSound() {
        System.out.println("Undefined animal makes no sound.");
    }
}
