import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {
    static List<Bil> biler = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        HashMap<String,Integer> nyeBiler = new HashMap<>();
        Main main = new Main();
        Garage garage = new Garage("Vesterport");
        main.readCarsFromFile("resources/cars.csv");
        for (Bil bil : biler) {
            garage.addCarToGarage(bil);
        }
        garage.showCarsInGarage();
        nyeBiler = garage.getMapOfCars();
        Set<String> keys = nyeBiler.keySet();
        for (String k : keys) {
            System.out.println("K: " + k + " V:" + nyeBiler.get(k));
        }
    }

    public void readCarsFromFile(String filename) {
        //Obs;Make;Model;Type;Origin;DriveTrain;MSRP;Invoice;EngineSize;Cylinders;Horsepower;MPG_City;MPG_Highway;Weight;Wheelbase;Length
        //1;Acura;MDX;SUV;Asia;All;$36,945;$33,337;3.5;6;265;17;23;4451;106;189
        String line = "";
        File file = new File(filename);
        Bil tmpBil = null;
        try {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while((line=br.readLine())!=null) {
                String[] lineArr = line.split(";");
                String carMake = lineArr[1];
                int cyl = Integer.valueOf(lineArr[9]);
                int horsepower = Integer.valueOf(lineArr[10]);
                int length = Integer.valueOf(lineArr[15]);
                tmpBil = new Bil(carMake,cyl,horsepower,length);
                biler.add(tmpBil);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
