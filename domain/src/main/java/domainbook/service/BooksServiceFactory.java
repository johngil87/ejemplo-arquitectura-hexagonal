package domainbook.service;

import domainbook.repository.BooksRepository;

public class BooksServiceFactory {

    public static BooksServices getBooksService(BooksRepository booksRepository){
        return new BooksServiceImpl(booksRepository);
    }
}
