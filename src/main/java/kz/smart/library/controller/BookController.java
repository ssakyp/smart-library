package kz.smart.library.controller;

import kz.smart.library.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BookController {
    Book addBook(@RequestParam String title);

    String borrowBook(@RequestParam Long bookId);

    List<Book> listBooks();
}
