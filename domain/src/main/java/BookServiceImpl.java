import java.util.UUID;

public class BookServiceImpl implements IBookServices{

    private final IBooksRepository booksRepository;

    public BookServiceImpl(IBooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public UUID createBook(String name, String author, String description) {
        final Book book = new Book(UUID.randomUUID(), name, author, description);
        booksRepository.save(book);
        return book.getId();
    }

    @Override
    public void deleteBook(UUID id) {
        booksRepository.delete(id);
    }
}
