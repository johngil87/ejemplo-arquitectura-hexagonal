public class BooksServiceFactory {

    public static IBookServices getBooksService(IBooksRepository booksRepository){
        return new BookServiceImpl(booksRepository);
    }
}
