import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Angreb ork = new Ork("Baldur");
        Angreb vampyr = new Vampyr("Dracula");
        Player p = new Player("Kurt");
        //Ork ork = new Ork("Baldur");
        //Vampyr vampyr = new Vampyr("Dracula");
        int counter = 0;
        int limit = 40;
        List<Angreb> attackers = new ArrayList<>();
        attackers.add(ork);
        attackers.add(vampyr);

        while(p.isAlive && counter < limit) {
            counter++;
            if (p.defense() < attackers.get(counter%2).attack() ) {
                System.out.println("Player " + p.name + " lost " + p.getNumOfLives());
                p.drawFromNumOfLives();
            } else  if (p.defense() > attackers.get(counter%2).attack() ) {
                System.out.println("Player " + p.name + " won ");
                p.addToNumOfLives();
            } else {
                System.out.println(" it was a draw");
            }
            System.out.println(counter);
        }

        /*

        for(int i=0;i<10;i++) {
            int vA = vampyr.attack();
            int oA = ork.attack();
            if (vA < oA) {
                System.out.println("Ork wins " + oA);
            } else if (vA > oA) {
                System.out.println("Vamp wins " + vA);
            } else {
                System.out.println("it was a draw " + vA + " & " + oA);
            }
        }

         */
	// write your code here
    }
}
