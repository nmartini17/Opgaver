import java.util.ArrayList;

public class Tal {

    public ArrayList<Integer> gentageTal(ArrayList<Integer> tal, int k) throws MinusTalException {
        ArrayList<Integer> gentagedeTal = new ArrayList<>();
        if(tal == null) {
            throw new NullPointerException();
        }
        if(k <= 0) {
            throw new MinusTalException();
        }
        for (int t : tal) {
            for(int i = 0; i < k; i++) {
                gentagedeTal.add(t);
            }
        }
        return gentagedeTal;
    }
}
