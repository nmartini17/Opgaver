import java.util.List;
import java.util.Scanner;

public class MainController {
    UI ui = new UI();
    CapitalLetter cl = new CapitalLetter();
    Scanner sc = new Scanner(System.in);

    public void runProgram() {
        int choice = 0;
        while (choice != 9) {
            ui.showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Type sentences");
                    cl.addSentences(sc.nextLine());
                    break;
                case 2:
                    List<String> sentences = cl.getSentences();
                    cl.showAllSentences();
                    System.out.println(cl.checkForUpperCase()+" tekststrenge begyndte med stort forbogstav");
                case 9:
                    System.out.println("Exiting");
            }
        }
    }
}