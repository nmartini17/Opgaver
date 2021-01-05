import java.time.LocalDate;
import java.time.LocalTime;

public class Vampyr implements Angreb{
    String name;

    public Vampyr(String name) {
        this.name = name;
    }
    @Override
    public int attack() {
        LocalTime lt = LocalTime.now();
        return lt.getHour();
    }
}
