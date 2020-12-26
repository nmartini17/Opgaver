public class MainController {
    Strenge strenge = new Strenge();

    public void runProgram() {
        String replacedString = strenge.charReplacer("Abe", "Kat", 'R', 'X');
        System.out.println(replacedString);
    }

}
