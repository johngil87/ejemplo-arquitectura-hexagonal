package domainbook.repository;

import domainbook.data.Book;

import java.util.UUID;

public interface BooksRepository {

    void save(Book book);
    void delete(UUID id);
}
