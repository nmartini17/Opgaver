import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CapitalLetter {
    List<String> sentences;
    Scanner sc = new Scanner(System.in);


    public CapitalLetter() {
        sentences = new ArrayList<>();
    }


    public void addSentences(String input) {
        input = sc.nextLine();
        sentences.add(input);
    }

    public int checkForUpperCase() {
        int count = 0;

        for (String sentence : sentences) {
            char firstLetter = sentence.charAt(0);
            if (Character.isUpperCase(firstLetter)) {
                count++;
            }
        }
        return count;
    }

    public List<String> getSentences() {
        return sentences;
    }

    public void showAllSentences() {
        for (String input : sentences) {
            System.out.println(input);
        }
    }

}
