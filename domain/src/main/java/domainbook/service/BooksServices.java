package domainbook.service;

import java.util.UUID;

public interface BooksServices {

    UUID createBook(String name, String author, String description);
    void deleteBook(UUID id);

}
