import java.util.ArrayList;

public class GetList {
    ArrayList<String> stringArrayList;

    public GetList() {
        stringArrayList = new ArrayList<>();
    }

    public boolean addStringToList(ArrayList<String> stringArrayList, String s) {
        if (stringArrayList.contains(s) == false) {
            stringArrayList.add(s);
        }
        boolean retVal;
        if (stringArrayList.contains(s) == true) {
            retVal = true;
        } else {
            retVal = false;
        }
        System.out.println(retVal);
        return retVal;
    }
}
