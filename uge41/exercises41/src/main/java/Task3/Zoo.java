package Task3;

import java.util.ArrayList;

public class Zoo {
    //Egenskaber
    ArrayList<Animal> animals = new ArrayList<Animal>();

    //Konstruktører


    //Metoder
    public void makeAllSounds() {
        for(Animal a : animals) {
            a.makeSound();
        }
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void printNumberOfLegs() {
        int totalNumberOfLegs = 0;
        for (Animal a : animals){
            totalNumberOfLegs = totalNumberOfLegs + a.getNumberOfLegs();
        }
        System.out.println("Total number of legs in my zoo: " +totalNumberOfLegs);
    }

}
