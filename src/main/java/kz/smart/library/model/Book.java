package kz.smart.library.model;

public class Book {
    private Long id;
    private String title;
    private boolean isBorrowed;

    public Book(Long id, String title, boolean isBorrowed) {
        this.id = id;
        this.title = title;
        this.isBorrowed = isBorrowed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
