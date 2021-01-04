public class MainController {
    Bibleotek bibleotek = new Bibleotek();

    public void runProgram() {
        bibleotek.addBook(new Bog(123, "Harry Potter", 1990));
        bibleotek.addBook(new Bog(456, "Lord of the Rings", 1954));
        Bog bog = new Bog(123, "Pride and Prejudice", 1813);
        System.out.println(bibleotek.containsBook(bog));
        System.out.println(bibleotek.books.size());
    }

}
