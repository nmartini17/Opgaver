public class InvalidNumberException extends Exception {
    public void printErrorMessage() {
        System.out.println("Number is either negative or too large");
    }
}
