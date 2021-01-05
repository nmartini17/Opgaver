public class Main {

    public static void main(String[] args) {
        strings();

        /*for(int i = 0; i < 0; i++ );

        for (Datatypen variabelnavn : Collection)
        {

        }
        // Man skal have en counter
        int counter = 0;
        while(counter != 10) {

        }
        */

        int i = diller();
    }

    public static void strings(){
        String string1 = new String("String");
        String string2 = new String("String");

        if(string1.equals(string2)) {
            System.out.println("De er ens");
        } else
            System.out.println("Forskellige");

    }

    public static int diller() {
        return 2;
    }

}
