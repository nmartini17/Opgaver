import java.util.Scanner;

public class MainController {
    Grass grass = new Grass();
    Scanner sc = new Scanner(System.in);

    public void runProgram() {
        System.out.println(grass.daysToMowing(sc.nextDouble(), 100));
    }
}
