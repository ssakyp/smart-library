package kz.smart.library.controller;

import kz.smart.library.model.Book;
import kz.smart.library.service.BookService;
import kz.smart.library.service.BookServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookControllerImpl implements BookController {
    private final BookService bookService = new BookServiceImpl();

    @PostMapping("/add")
    @Override
    public Book addBook(@RequestParam String title) {
        return bookService.addBook(title);
    }

    @PostMapping("/borrow")
    @Override
    public String borrowBook(@RequestParam Long bookId) {
        return bookService.borrowBook(bookId);
    }

    @GetMapping
    @Override
    public List<Book> listBooks() {
        return bookService.listBooks();
    }
}
