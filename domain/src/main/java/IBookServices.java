import java.util.UUID;

public interface IBookServices {

    UUID createBook(String name, String author, String description);
    void deleteBook(UUID id);

}
