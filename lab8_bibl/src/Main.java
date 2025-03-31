import java.io.IOException;
import java.util.*;
import LibraryManagementSystem.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        ConsoleBookInput bookInput = new ConsoleBookInput();

//        ConsoleBookInput con = new ConsoleBookInput();
//        Book book = (Book) con.readBook();
//        System.out.println(book.getAuthor());
        // Inicjalizacja obiektów: biblioteki, BookInput
        // Pętla główna z menu
        // Obsługa opcji (dodawanie, usuwanie, edycja itd.)
        // Obsługa wyjątków (try-catch)
        while (true){
            System.out.println("\n******* Menu *******");
            System.out.println("1. Wyświetl książki biblioteki");
            System.out.println("2. Znajdz książkę");
            System.out.println("3. Dodaj kiążkę");
            System.out.println("4. Edycja kiążki");
            System.out.println("5. Usuń książkę");
            System.out.println("6. Wyjście");
            System.out.println("Twój wybór: ");
            try {
                int wybor = scanner.nextInt();
                switch (wybor) {
                    case 1:
                        library.listBooks();
                        break;
                    case 2:
                        System.out.print("Podaj ISBN: ");
                        String isbn = scanner.next();
                        library.findBook(isbn);
                        break;
                    case 3:
                        try {
                            Book book = bookInput.readBook();
                            library.addBook(book);
                            break;
                        }
                        catch (InvalidBookException e){
                            e.printStackTrace();
                            break;
                        }
                    case 4:
                        try {
                            Book book = bookInput.readBook();
                            library.editBook(book.getIsbn(), book);
                            break;
                        }
                        catch (InvalidBookException e){
                            e.printStackTrace();
                            break;
                        }
                    case 5:
                        System.out.print("Podaj ISBN: ");
                        isbn = scanner.next();
                        library.removeBook(isbn);
                        break;
                    case 6:
                        System.exit(1); break;
                    default:
                        System.out.println("Błędne dane ... Spróbuj jeszcze raz. ");
                }
            }
            catch (InputMismatchException e){
                System.out.println("Podaj liczbę całkowitą");
                break;
            }
        }
    }
}
