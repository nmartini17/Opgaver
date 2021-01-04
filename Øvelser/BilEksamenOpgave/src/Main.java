import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Bil> biler = new ArrayList<>();
    public static void main(String[] args) {
        Main main = new Main();
        main.readCarsFromFile("resources/biler.csv");
        System.out.println(biler.size());
        Garage garage = new Garage("Sinds Garage");
        for (Bil b: biler) {
            garage.addCarToGarage(b);
        }
        garage.showAllCars();
    }

    public void readCarsFromFile(String fileName){
        File file = new File(fileName);
        Bil tmpBil = null;
        String line =  "";
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            while((line = br.readLine())!=null) {
                String[] lineArr = line.split(";");
                String make = lineArr[1];
                String model = lineArr[2];
                int hp = Integer.valueOf(lineArr[10]);
                int cylindre = Integer.valueOf(lineArr[9]);
                int length = Integer.valueOf(lineArr[15]);
                tmpBil = new Bil(make, model, hp, cylindre, length);
                biler.add(tmpBil);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
