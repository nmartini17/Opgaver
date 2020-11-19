package Task3;

public class Main {
    public static void main(String [] args) {

        Zoo zoo =  new Zoo();

        Lion lion = new Lion(4);
        Hippo hippo = new Hippo(4);
        Zebra zebra = new Zebra(4);

        zoo.addAnimal(lion);
        zoo.addAnimal(hippo);
        zoo.addAnimal(zebra);

        zoo.makeAllSounds();
        zoo.printNumberOfLegs();
    }
}
