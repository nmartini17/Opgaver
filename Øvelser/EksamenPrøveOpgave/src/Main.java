import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> tal = new ArrayList<>();

        int tal1 = 1;
        int tal2 = 2;
        tal.add(tal1);
        tal.add(tal2);

        Tal talobj = new Tal();
        try {
            ArrayList<Integer> gental = talobj.gentageTal(tal, 10);
            for (int i : gental) {
                System.out.println(i);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (MinusTalException e) {
            e.VisFejlMeddelse();
        }
    }
}