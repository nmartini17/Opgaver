import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Garage {
    String name;
    List<Bil> biler;
    HashMap<String,Integer> bilerMedEnv;

    Garage(String name) {
        biler =new ArrayList<>();
        bilerMedEnv = new HashMap<>();
    }
    public void addCarToGarage(Bil bil) {
        biler.add(bil);
        bilerMedEnv.put(bil.getCarMake(), bil.getEnvFactor());
    }

    public HashMap<String,Integer> getMapOfCars() {
        return bilerMedEnv;
    }

    public void showCarsInGarage() {
        Collections.sort(biler);
        for (Bil bil : biler ) {
            System.out.println(bil);
        }
    }
}
