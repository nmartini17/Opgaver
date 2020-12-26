import java.util.Scanner;

public class MainController {
    Scanner sc = new Scanner(System.in);
    Word word = new Word();

    public void runProgram() {
        System.out.println("Type a full sentence");
        try {
            word.changeSentence(sc.nextLine());
        } catch(EmptyStringException e) {
            e.printErrorMessage();
        }
    }

}
