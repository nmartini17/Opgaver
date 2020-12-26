import java.util.Scanner;

public class Service {
    Scanner sc = new Scanner(System.in);
    int result = 0;

    public int calculateResult(int number1, int number2) {
        result = number1 + number2;
        return result;
    }

    public void printResult() {
        System.out.println("The result is: " + result);
    }

    public void getHelp() {
        System.out.println("There is no help to get");
    }

}
