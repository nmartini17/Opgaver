public class Bil implements Comparable<Bil>{
    String carMake ;
    int cyl;
    int horsepower;
    int length ;

    public Bil(String carMake, int cyl, int horsepower, int length) {
        this.carMake = carMake;
        this.cyl = cyl;
        this.horsepower = horsepower;
        this.length = length;
    }

    public String getCarMake() {
        return carMake;
    }

    public int getCyl() {
        return cyl;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getEnvFactor() {
        return horsepower*cyl*length;
    }

    public String toString() {
        String msg = "";
        msg = carMake + " ENV: " + getEnvFactor();
        return msg;
    }

    @Override
    public int compareTo(Bil o) {
        return o.getEnvFactor()-this.getEnvFactor();
    }
}
