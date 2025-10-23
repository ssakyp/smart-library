package kz.smart.library.repository;

import kz.smart.library.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BookRepository {
    private final Map<Long, Book> books = new HashMap<>();
    private long idCounter = 1;

    public Book save(Book book) {
        book.setId(idCounter++);
        books.put(book.getId(), book);
        return book;
    }

    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }

    public Optional<Book> findById(Long id) {
        return Optional.ofNullable(books.get(id));
    }
 }
