package entities;
import java.util.ArrayList;
import java.util.List;

public class Client extends AbstractUser {
    private Boolean banned;
    List<Book> books;

    public Client(String firstName, String lastName, String middleName, String phone, Boolean banned, List<Book> books) {
        super(firstName, lastName, middleName, phone);
        this.banned = banned;
        this.books = books;
    }

    public Client(String firstName, String lastName, String middleName, String phone) {
        super(firstName, lastName, middleName, phone);
        this.banned = false;
        this.books = new ArrayList<>();
    }

    public Boolean isBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = List.of(books);
    }
}