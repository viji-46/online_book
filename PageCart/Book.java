package prc;

public class Book {
    private String bookId;
    private String title;
    private String genre;
    private String author;
    private Long noOfPages;
    private Double price;

    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getNoOfPages() {
        return noOfPages;
    }
    public void setNoOfPages(Long noOfPages) {
        this.noOfPages = noOfPages;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
