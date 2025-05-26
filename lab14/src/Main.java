import java.sql.SQLException;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsersCRUD usersCRUD = new UsersCRUD();

        printBanner("ATM Bank");

        System.out.println("Podaj nazwę użytkownika: ");
        String userName = scanner.nextLine();

        System.out.println("Podaj PIN: ");
        String userPIN = scanner.nextLine();

        try{
            if(usersCRUD.authenticateUser(userName, userPIN, "admin")){
                System.out.println("Zalogowano jako ADMINISTRATOR");
                adminMenu(usersCRUD, scanner);
            }
            else if(usersCRUD.authenticateUser(userName, userPIN, "user")){
                System.out.println("Zalogowano jako UŻYTKOWNIK");
                userMenu(usersCRUD, scanner, userName);
            }
        } catch (Exception e) {
            System.out.println("Wystąpił błąd: "+ e.getMessage());
        }

    }

    private static void userMenu(UsersCRUD usersCRUD, Scanner scanner, String userName) throws Exception{
        while (true){
            printBanner("\nMenu użytkownika");

            System.out.println("1. Wpłata pieniędzy");
            System.out.println("2. Wypłata pieniędzy");
            System.out.println("3. Zmiana PIN-u");
            System.out.println("4. Saldo");
            System.out.println("5. Wyloguj się");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Podaj kwotę do wpłaty: ");
                    double depositAmout = scanner.nextDouble();
                    usersCRUD.deposit(userName, depositAmout);
                    break;
                case 2:
                    System.out.println("Podaj kwotę do wypłaty: ");
                    double withdrawAmout = scanner.nextDouble();
                    usersCRUD.withDraw(userName, withdrawAmout);
                    break;
                case 3:
                    System.out.println("Podaj nowy PIN: ");
                    String newPIN = scanner.next();
                    usersCRUD.changePIN(userName, newPIN);
                    break;
                case 4:
                    usersCRUD.showBalance(userName);
                    break;
                case 5:
                    System.out.println("\nWylogowano z systemu.");
                    return;
                default:
                    System.out.println("Podano niepoprawne dane, spróbuj ponownie!");
            }
        }
    }

    private static void adminMenu(UsersCRUD usersCRUD, Scanner scanner) throws Exception{
        while (true){
            System.out.println("Menu administratora");
            System.out.println("1. Dodaj nowego użytkownika");
            System.out.println("2. Wyloguj się");

            System.out.println("\nWybierz opcje:");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Podaj nazwe użytkownika: ");
                    String newUserName = scanner.next();
                    System.out.println("Podaj PIN do użytkownika: ");
                    String newPIN = scanner.next();
                    usersCRUD.addUser(newUserName, newPIN);
                    break;
                case 2:
                    System.out.println("\nWylogowano z systemu.");
                    return;
                default:
                    System.out.println("Podano niepoprawne dane, spróbuj ponownie!");
            }
        }
    }

    //Metoda do wyświetlenia glowengo baneru
    private static void printBanner(String title){
        System.out.println("\n" + "=".repeat(40));
        System.out.print(" "+ title);
        System.out.println("\n" + "=".repeat(40));
    }
}