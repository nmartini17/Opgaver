import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Garage {


    public void filReader() {
        BufferedReader objReader = null;
        try {
            String strCurrentLine;
            objReader = new BufferedReader(new FileReader(C:\Users\Nicou\IdeaProjects\BilerOpgave\resource\biler.csv));
            while((strCurrentLine = objReader.readLine()) != null) {
                String[] biler strCurrentLine.split(";");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
