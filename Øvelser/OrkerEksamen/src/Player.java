import java.util.Random;

public class Player {
    String name;
    int numOfLives;
    boolean isAlive;
    Random rd;

    public Player(String name) {
        this.name = name;
        this.numOfLives = 5;
        this.isAlive = true;
        this.rd = new Random();
    }

    public int getNumOfLives() {
        return numOfLives;
    }

    public void addToNumOfLives() {
        numOfLives++;
    }

    public boolean isAlive() {
        return isAlive;
    }
    public boolean drawFromNumOfLives() {
        boolean isDead = false;
        numOfLives--;
        if (numOfLives <= 0) {
            isAlive = false;
            return true;
        }
        return isDead;
    }

    public int defense() {
        return rd.nextInt(20);
    }
}
