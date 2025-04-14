package Task;
import RunInput.Input;

import java.util.*;

import Class.*;

public class Tasks {
    Input input = new Input();
    public void Zadanie1(){
        Set<String> names = new HashSet<String>();

        while (true){
            System.out.println("Podaj imię (lub zakończ - ): ");
            String name = input.InputString();
            if(name.equals("-")){
                break;
            }
            names.add(name);
        }

        System.out.println("Wypisanie unikalnych imion");
        for(String name: names){
            System.out.println(name);
        }
    }

    public void Zadanie2(){
        List<String> pary1 = new ArrayList<>();
        List<String> pary2 = new ArrayList<>();
        while (true){
            System.out.print("Podaj imie 1 partnera: ");
            String name1 = input.InputString();
            System.out.print("Podaj imie 2 partnera: ");
            String name2 = input.InputString();
            if(name1.equals("-") || name2.equals("-")){
                break;
            }
            pary1.add(name1);
            pary2.add(name2);
        }
        System.out.print("Podaj imie osoby: ");
        String name = input.InputString();
        try {
            if (pary1.contains(name)) System.out.println(name + " i " + pary2.get(pary1.indexOf(name)));
            else System.out.println(name + " i " + pary1.get(pary2.indexOf(name)));
        } catch (Exception e) {
            System.out.println(name+" Nie ma partnera");
        }

    }

    public void Zadanie3(){
        List<Osoba> uczestnicy = new ArrayList<>();
        uczestnicy.add(new Osoba("132", "Ala", 13));
        uczestnicy.add(new Osoba("112", "Tom", 20));
        uczestnicy.add(new Osoba("101", "Jan", 18));
        uczestnicy.add(new Osoba("211", "Ola", 12));

        System.out.print("Podaj id uczęstnika: ");
        String id = input.InputString();
        for (Osoba os: uczestnicy){
            if(os.getId().hashCode()==id.hashCode()){
                System.out.println(os.toString());
            }
        }

        System.out.println("Niepełnoletni uczęstnicy");
        for (Osoba os: uczestnicy){
            if(os.getWiek()<18){
                System.out.println(os.toString());
            }
        }

        //LinkedList
        List<Osoba> uczestnicy1 = new LinkedList<>();
        uczestnicy1.add(new Osoba("132", "Ala", 13));
        uczestnicy1.add(new Osoba("112", "Tom", 20));
        uczestnicy1.add(new Osoba("101", "Jan", 18));
        uczestnicy1.add(new Osoba("211", "Ola", 12));

        System.out.print("Podaj id uczęstnika: ");
        id = input.InputString();
        for (Osoba os: uczestnicy1){
            if(os.getId().equals(id)){
                System.out.println(os.toString());
            }
        }

        System.out.println("Niepełnoletni uczęstnicy");
        for (Osoba os: uczestnicy1){
            if(os.getWiek()<18){
                System.out.println(os.toString());
            }
        }
    }

    public void Zadanie4(){
        Ksiazka[] ksiazki = {
                new Ksiazka("Harry Potter", "Joan Rowling"),
                new Ksiazka("Dune", "Frank Herbert"),
                new Ksiazka("Game of Thrones", "George Martin")
        };

        List<Ksiazka> ksiazki_lista = new ArrayList<>(Arrays.asList(ksiazki));

        List<Ksiazka> podlista = ksiazki_lista.subList(0,2);
        podlista.clear();
        for(Ksiazka k: ksiazki_lista){
            System.out.println(k.toString());
        }

    }

    public void Zadanie5(){
        List<Integer> lista1 = new ArrayList<>(List.of(1,2,6,4,0,7));
        List<Integer> lista2 = new ArrayList<>(lista1);


        Iterator<Integer> iterlista = lista1.iterator();
        int i = lista1.size()-1;
        while (iterlista.hasNext()){
            lista2.set(i,iterlista.next());
            i--;
        }
        for (Integer l: lista2){
            System.out.print(l+" ");
        }
    }
}
