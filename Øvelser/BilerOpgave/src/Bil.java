import java.io.*;

public class Bil {

    private String make;
    private int hp;
    private int cylinder;
    private int length;

    public Bil(String make, int hp, int cylinder, int length){
        this.hp = hp;
        this.cylinder = cylinder;
        this.length = length;
        this.make = make;
    }

    public int miljøtryk() {
        int værdi = 0;
        værdi = hp*cylinder*length;

        return værdi;
    }



}
