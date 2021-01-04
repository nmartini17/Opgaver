import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GetUserStrings {
    Scanner sc = new Scanner(System.in);
    List<String> strings;


    public GetUserStrings() {
        strings = new ArrayList<>();
    }

    public void readStrings() {
        int counter = 0;
        while (counter < 5) {
            counter++;
            System.out.println("Indtast et ord");
            String retVal = sc.next();
            strings.add(retVal);
            Collections.sort(strings);
            Collections.reverse(strings);
        }
    }

    public List<String> getStrings() {
        return strings;
    }
}
