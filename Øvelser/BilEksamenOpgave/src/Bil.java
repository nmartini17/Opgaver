public class Bil implements Comparable<Bil> {

    private String make;
    private String model;
    private int hp;
    private int cylindre;
    private int length;

    public Bil(String make, String model, int hp, int cylindre, int length) {
        this.make = make;
        this.model = model;
        this.hp = hp;
        this.cylindre = cylindre;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", hp=" + hp +
                ", cylindre=" + cylindre +
                ", length=" + length +
                '}' + "Miljøtryk:" + miljøtryk();
    }

    public int miljøtryk() {
        return hp*cylindre*length;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getHp() {
        return hp;
    }

    public int getCylindre() {
        return cylindre;
    }

    public int getLength() {
        return length;
    }

    @Override
    public int compareTo(Bil b) {
        return b.miljøtryk()-this.miljøtryk();
    }
}
