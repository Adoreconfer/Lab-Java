package LibraryManagementSystem;

import java.util.Scanner;
public class ConsoleBookInput implements BookInput{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Book readBook() throws InvalidBookException {
        System.out.print("Podaj ISBN: ");
        String isbn = scanner.next();
        System.out.print("Podaj tytuł: ");
        String title = scanner.next();
        System.out.print("Podaj autora: ");
        String autor = scanner.next();
        return new Book(title,autor,isbn);
    }
}
