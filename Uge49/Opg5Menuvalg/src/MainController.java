import java.util.Scanner;

public class MainController {
    UI ui = new UI();
    Scanner sc = new Scanner(System.in);
    Service s = new Service();

    public void runProgram(){

        int choice = 0;
        while (choice != 9) {
            ui.showMenuOptions();

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Type two numbers");
                    s.calculateResult(sc.nextInt(), sc.nextInt());
                    break;
                case 2:
                    s.printResult();
                    break;
                case 3:
                    s.getHelp();
                    break;
                case 9:
                    System.out.println("Exiting..");
                    break;
                default:
                    choice = 9;
                    break;
            }
        }
    }
}

