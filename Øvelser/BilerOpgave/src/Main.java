import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Bil bil = new Bil("Audi",700,8,298);
        System.out.println(bil.miljøtryk());
    }
}