import java.util.Scanner;

public class MainController {
    Square square = new Square();
    Scanner sc = new Scanner(System.in);

    public void runProgram() {
        System.out.println("Type number, then sign");
        try {
            square.drawSquare(sc.nextInt(), sc.next());
        }catch(InvalidNumberException e) {
            e.printErrorMessage();
        }
    }

}
