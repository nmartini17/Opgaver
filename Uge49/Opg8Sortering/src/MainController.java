import java.util.List;

public class MainController {
    GetUserStrings gus = new GetUserStrings();

    public void runProgram() {
        gus.readStrings();
        List<String> strings = gus.getStrings();
        System.out.println(strings);

    }

}
