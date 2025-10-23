package kz.smart.library.service;

import kz.smart.library.model.Book;
import kz.smart.library.repository.BookRepository;

import java.util.List;

public class BookService {
    private final BookRepository bookRepository = new BookRepository();

    public Book addBook(String title) {
        return bookRepository.save(new Book(null, title, false));
    }

    public String borrowBook(Long bookId) {
        return bookRepository.findById(bookId)
                .map(book -> {
                    if (book.isBorrowed()) return "Book is already borrowed";
                    book.setBorrowed(true);
                    return "Book borrowed successfully";
                })
                .orElse("Book not found");
    }

    public List<Book> listBooks() {
        return bookRepository.findAll();
    }
}
