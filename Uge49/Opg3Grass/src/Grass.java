import java.util.Scanner;


public class Grass {

    public int daysToMowing(double current, double max) {
        int days = 0;
        Scanner sc = new Scanner(System.in);
        while (current < max) {
            current = current + 0.8;
            days++;
        }

        return days;
    }
}