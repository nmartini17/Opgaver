import java.util.Objects;

public class Bog {
    private int ISBNnr;
    private String title;
    private int year;

    public Bog(int ISBNnr, String title, int year) {
        this.ISBNnr = ISBNnr;
        this.title = title;
        this.year = year;
    }

    public int getISBNnr() {
        return ISBNnr;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setISBNnr(int ISBNnr) {
        this.ISBNnr = ISBNnr;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Bog{";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bog bog = (Bog) o;
        return ISBNnr == bog.ISBNnr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBNnr);
    }
}
