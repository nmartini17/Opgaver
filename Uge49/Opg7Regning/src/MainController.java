public class MainController {
    Regning regning = new Regning();

    public void runProgram() {
        try {
            regning.calc(25, 10);
        } catch (InvalidNumberException e) {
            e.printErrorMessage();
        }
    }

}
