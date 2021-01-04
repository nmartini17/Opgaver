import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Garage {

    String name;
    List<Bil> biler;

    public Garage(String name) {
        this.name = name;
        biler = new ArrayList<>();
    }

    public void addCarToGarage(Bil bil) {
        biler.add(bil);
    }

    public void showAllCars() {
        Collections.sort(biler);
        for (Bil b:biler) {
            System.out.println(b);
        }
    }

}
