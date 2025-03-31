package LibraryManagementSystem;

public class Book {
    // Pola: tytuł, autor, ISBN
    private String title;
    private String author;
    private String isbn;

    // Konstruktor z walidacją danych (rzuca wyjątek)
    public Book(String title, String author, String isbn) throws InvalidBookException {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
    }
    // Gettery i settery z walidacją
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) throws InvalidBookException {
        if(title == null) throw new InvalidBookException("Książka musi mieć tytuł");
        else this.title=title;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws InvalidBookException {
        if(author == null) throw new InvalidBookException("Książka musi mieć autora");
        else this.author=author;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) throws InvalidBookException {
        if(isbn.length()==13) this.isbn = isbn;
        else throw new InvalidBookException("ISBN musi mieć długość 13");
    }

    @Override
    public String toString() {
        return "ISBN: "+getIsbn()+", Autor: "+getAuthor()+", Tytuł: "+getTitle();
    }
}
