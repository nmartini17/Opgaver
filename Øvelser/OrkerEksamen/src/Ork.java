import java.util.Random;

public class Ork implements Angreb{
    Random rd;
    String name;

    Ork(String name) {
        rd = new Random();
        this.name = name;
    }

    @Override
    public int attack() {
        return rd.nextInt(44);
    }
}
