package kz.smart.library.service;

import kz.smart.library.model.Book;

import java.util.List;

public interface BookService {
    Book addBook(String title);

    String borrowBook(Long bookId);

    List<Book> listBooks();
}
