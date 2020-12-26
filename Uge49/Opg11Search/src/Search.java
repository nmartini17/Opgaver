import java.util.Arrays;
import java.util.List;

public class Search {

    public int hasString(String[] strings, String string) throws StringNotFoundException {
        int index = 0;


        List<String> stringList = Arrays.asList(strings);
        if (stringList.contains(string)) {
            index = stringList.indexOf(string);
        } else {
            throw new StringNotFoundException();
        }
        System.out.println(index);
        return index;
    }

}
