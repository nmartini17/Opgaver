import java.util.ArrayList;
import java.util.List;

public class Bibleotek {
    List<Bog> books;

    public Bibleotek() {
        books = new ArrayList<>();
    }

    public void addBook(Bog bog) {
        books.add(bog);
    }

    public List<Bog> getBooks() {
        return books;
    }

    public boolean containsBook(Bog bog) {
        for (Bog b : books) {
            if (bog.equals(b)) {
                return true;
            }
        }
        return false;
    }

}
