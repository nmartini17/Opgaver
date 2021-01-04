public class MainController {
    Search search = new Search();

    public void runProgram() {
        String[] strings = new String[] {"Abe", "Kat", "Flodhest", "Sko", "Sne"};
        try {
           search.hasString(strings, "Sne");
        } catch(StringNotFoundException e) {
            e.printErrorMessage();
        }
    }
}
