import java.util.UUID;

public interface IBooksRepository {

    void save(Book book);
    void delete(UUID id);
}
