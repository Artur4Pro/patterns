import java.util.Objects;

public final class Book {

    private final String code;
    private final String title;
    private final String genre;
    private final String author;
    private final int publishingYear;
    private final String description;


    public Book(String code, String title, String genre, String author, int publishingYear, String description) {
        this.code = code;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.publishingYear = publishingYear;
        this.description = description;
    }


    public String getCode() {
        return this.code;
    }


    public String getTitle() {
        return this.title;
    }


    public String getGenre() {
        return this.genre;
    }


    public String getAuthor() {
        return this.author;
    }


    public int getPublishingYear() {
        return publishingYear;
    }


    public String getDescription() {
        return description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(code, book.code) && Objects.equals(title, book.title) && Objects.equals(genre, book.genre) && Objects.equals(author, book.author) && Objects.equals(description, book.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, title, genre, author, publishingYear, description);
    }

    @Override
    public String toString() {
        return "Book{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", publishingYear=" + publishingYear +
                ", description='" + description + '\'' +
                '}';
    }
}
