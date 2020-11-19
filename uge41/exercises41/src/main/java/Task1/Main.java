package Task1;

public class Main {
    public static void main(String [] args){

        Driver driver1 = new Driver("Nicolai",21);

        Car car1 = new Car("Porsche","Taycan",2020,"Coupé");
        Car car2 = new Car("Ferrari","488 Pista",2020,"Race Car");

        car1.setDriver(driver1);
        car2.setDriver(driver1);
        System.out.println(car1.toString() + " " + driver1.toString());
        System.out.println(car2.toString() + " " + driver1.toString());
    }
}
