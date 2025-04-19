package Task;
import RunInput.Input;

import java.util.*;

public class Tasks {
    Input input = new Input();
    public void Zadanie1(){
        System.out.println("Podaj tekst: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        text = text.toLowerCase().replaceAll("[.,!?;:]", "");

        String[] words = text.split("\\s++");
        Map<String, Integer> wordMap = new HashMap<>();
        for(String word: words){
            wordMap.put(word, wordMap.getOrDefault(word, 0)+1);
        }
        System.out.println("Liczba wystąpień słów: \n");
        for(Map.Entry<String, Integer> entry: wordMap.entrySet()){
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }
    }

    public void Zadanie2(){
        Map<String, String> uzytkownicy = new HashMap<>();
        while (true) {
            System.out.println("-------Menu-------");
            System.out.println("1. Zalogować się");
            System.out.println("2. Dodać użytkownika");
            System.out.println("3. Wyjście");
            System.out.print("Wybierz opcję: ");
            int wybor = input.InputInt();

            switch (wybor) {
                case 1:
                    Logowanie(uzytkownicy);
                    break;
                case 2:
                    Dodanie(uzytkownicy);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
            }
        }
    }

    public void Logowanie(Map<String, String> u){
        System.out.println("Logowanie: ");
        System.out.print("login -> ");
        String login = input.InputString();
        System.out.print("hasło -> ");
        String haslo = input.InputString();
        if(u.containsKey(login) && u.get(login).equals(haslo)){
            System.out.println("Zalogowano pomyślnie!");
        }
        else System.out.println("Nie zalogowano");
    }

    public void Dodanie(Map<String, String> u){
        System.out.println("Dodaj użytkownika(login/hasło): ");

        String text = input.InputString();
        text = text.replaceAll("[/]", " ");

        String[] words = text.split("\\s++");
        u.put(words[0], words[1]);
    }

    public void Zadanie3(){
        Map<String, Double> karta = new HashMap<>();
        karta.put("Zupa pomidorowa", 12.00);
        karta.put("Pizza Margherita", 25.00);
        while (true) {
            System.out.println("------Menu------");
            System.out.println("1. Dodanie nowego dania");
            System.out.println("2. Wyświetlenie całej karty");
            System.out.println("3. Usunięcie dania");
            System.out.println("4. Obliczenie całkowitego rachunku za wybrane dania");
            System.out.println("5. Wyjście");
            System.out.print("Wybierz opcję: ");
            int wybor = input.InputInt();
            switch (wybor) {
                case 1:
                    dodanieNowegoDania(karta);
                    break;
                case 2:
                    wyswietlenie(karta);
                    break;
                case 3:
                    usunDanie(karta);
                    break;
                case 4:
                    obliczRachunek(karta);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Nie ma takiej opcji");
            }
        }
    }

    public void wyswietlenie(Map<String, Double> k){
        System.out.println("Karta: ");
        for(Map.Entry<String, Double> entry: k.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue()+" zł");
        }
    }

    public void dodanieNowegoDania(Map<String, Double> k){
        wyswietlenie(k);
        System.out.println("Nazwa nowego dania: ");
        String danie = input.InputString();
        System.out.println("Cena nowego dania: ");
        double cena = input.InputDouble();
        if(k.containsKey(danie)) System.out.println("Takie danie już istnieje");
        else k.put(danie, cena); System.out.println("Danie zostało dodane!");
    }

    public void usunDanie(Map<String, Double> k){
        wyswietlenie(k);
        System.out.print("Podaj nazwę dania jakie chcesz usunąć: ");
        String danie = input.InputString();
        if(k.containsKey(danie)) {
            k.remove(danie);
            System.out.println("Danie " + danie + " zostało usunięte");
        }else System.out.println("Nie ma takiego dania");
    }

    public void obliczRachunek(Map<String, Double> k){
        wyswietlenie(k);
        System.out.println("Podaj dania (oddzielone przecinkami): ");
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        List<String> zamowienia = new ArrayList<>();
        String[] dania = scanner.nextLine().split(",");
        for (String danie: dania){
            if(k.containsKey(danie)){
                suma+=k.get(danie);
                zamowienia.add(danie);
            }
        }
        System.out.println("Rachunek za "+zamowienia+": "+suma+" zł");
    }
}
