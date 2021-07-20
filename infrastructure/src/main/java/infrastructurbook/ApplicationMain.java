package infrastructurbook;

import app.ConsoleApp;
import domainbook.service.BooksServiceFactory;
import domainbook.service.BooksServices;
import infrastructurbook.bookimpl.BooksRepositoryImpl;

public class ApplicationMain {

    public static void main(String[] args) {
        BooksServices booksService = BooksServiceFactory.getBooksService(new BooksRepositoryImpl());
        ConsoleApp consoleApp = new ConsoleApp(System.console(), booksService);
        consoleApp.waitForCommand();
    }
}
