package LibraryManagementSystem;

import java.util.*;
public class Library {
    // Kolekcja książek (np. HashMap<String, Book> z kluczem ISBN)
    protected List<Book> books = new ArrayList<>();

    // Dodawanie książki (CRUD - Create)
    public void addBook(Book book) {
        if(books.isEmpty()){
            books.add(book);
            System.out.println("Książka została dodana");
        }
        else {
            for (Book b : books) {
                if (!(book.getIsbn().equals(b.getIsbn()) || book.getTitle().equals(b.getTitle()) || book.getAuthor().equals(b.getAuthor()))) {
                    books.add(book);
                    System.out.println("Książka została dodana");
                    break;
                } else System.out.println("Taka kiążka już jest");
            }
        }
    }
    // Usuwanie książki (CRUD - Delete)
    public void removeBook(String isbn) {
        if(books.isEmpty()) System.out.println("Nie ma żadnej książki");
        else {
            for (Book b : books) {
                if (b.getIsbn().equals(isbn)) {
                    books.remove(b);
                    System.out.println("Ksiażka " + b.toString() + "\nZostała usunięta");
                    break;
                } else System.out.println("Za takim ISBN książki nie ma");
            }
        }
    }
    // Edycja książki (CRUD - Update)
    public void editBook(String isbn, Book updatedBook) {
        if(books.isEmpty()) System.out.println("Nie ma żadnej książki");
        else {
            for (Book b : books) {
                if (isbn.equals(b.getIsbn())) {
                    books.remove(b);
                    books.add(updatedBook);
                    System.out.println("Książka została zmieniona");
                    break;
                } else System.out.println("Za takim ISBN książki nie ma");
            }
        }
    }
    // Lista książek (CRUD - Read)
    public void listBooks() {
        if(books.isEmpty()) System.out.println("Nie ma żadnej książki");
        else {
            System.out.println("Lista książek naszej biblioteki: ");
            for (Book b : books) {
                System.out.println(b.toString());
            }
        }
    }
    // Wyszukiwanie książki po ISBN

    public void findBook(String isbn) {
        if(books.isEmpty()) System.out.println("Nie ma żadnej książki");
        else {
            for (Book b : books) {
                if (b.getIsbn().equals(isbn)) System.out.println(b.toString());
                else System.out.println("Za takim ISBN książki nie ma");
            }
        }
    }
}
