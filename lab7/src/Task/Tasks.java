package Task;
import Class.*;
import RunInput.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Tasks {
    Input input = new Input();

    public void Zadanie1(){
        List<Pojazd> pojazdy = new ArrayList<>();
        pojazdy.add(new Samochod("S0001", "Toyota"));
        pojazdy.add(new SamochodElektryczny("SE001", "Kia"));
        pojazdy.add(new RowerElektryczny("RE001", "Rower"));

        while(true){
            System.out.println("\n******* Menu *******");
            System.out.println("1. Wyświetl dostępne pojazdy");
            System.out.println("2. Wypożycz pojazd");
            System.out.println("3. Zwróć pojazd");
            System.out.println("4. Naładuj pojazd elektryczny");
            System.out.println("5. Wyjście");
            System.out.println("Twój wybór");
            int wybor = input.InputInt();
            switch (wybor){
                case 1: viewPojazdy(pojazdy); break;
                case 2: wypoztczPojazd(pojazdy); break;
                case 3: zwrocPojazd(pojazdy); break;
                case 4: naladujPojazd(pojazdy); break;
                case 5: System.exit(1); break;
                default:
                    System.out.println("Błędne dane ... Spróbuj jeszcze raz. ");
            }
        }

    }

    private void naladujPojazd(List<Pojazd> pojazdy) {
        System.out.println("Podaj ID pojazdu do ładowania: ");
        String idWyp = input.InputString();
        for(Pojazd p: pojazdy){
            if(p.getId().equals(idWyp) && p instanceof  Elektryczny){
                ((Elektryczny) p).naladuj();
                System.out.println("Pojazd naładowany do 100%");
            }
        }
    }

    private void zwrocPojazd(List<Pojazd> pojazdy) {
        System.out.println("Podaj ID pojazdu do zwrócenia: ");
        String idWyp = input.InputString();
        for(Pojazd p: pojazdy){
            if(p.getId().equals(idWyp) && !p.isCzydostepny()){
                p.zwroc();
                System.out.println("Pojazd "+p.getId()+" został zwrócony");
            }
        }
    }

    private void wypoztczPojazd(List<Pojazd> pojazdy) {
        System.out.println("Podaj ID pojazdu do wypożyczenia: ");
        String idWyp = input.InputString();
        for(Pojazd p: pojazdy){
            if(p.getId().equals(idWyp) && p.isCzydostepny()){
                System.out.println("Na ile godzin chcesz wypożyczyć pojazd: ");
                int godz = input.InputInt();
                p.wypozycz();
                System.out.println("Koszt wypożyczenia: "+p.ObliczKoszt(godz));
            }
        }
    }

    private void viewPojazdy(List<Pojazd> pojazdy){
        for(Pojazd p: pojazdy)
            System.out.println("Id: "+p.getId()+", Model: "+ p.getModel()+" - "+(p.isCzydostepny() ? "Dostępny" : "Zajęty"));
    }

    public void Zadanie2(){
        Figura[] tablicaFigur = {
        new Prostokat(3, 6, "czerwony", new Punkt(0,0)),
        new Trojkat(7, 4, "biały",new Punkt(1,1)),
        new Kwadrat(3,"czarny",new Punkt(2,3)),
        new Prostokat(2, 6, "fioletowy", new Punkt(0,1)),
        new Trojkat(1, 4, "żółty",new Punkt(3,0)),
        new Kwadrat(3,"niebieski",new Punkt(0,3)),
        new Prostokat(2, 6, "fioletowy", new Punkt(0,1)),
        new Trojkat(1, 4, "żółty",new Punkt(0,5)),
        new Kwadrat(3,"niebieski",new Punkt(0,3))};

        Random random = new Random();
        for (Figura fig: tablicaFigur) {
            int x = random.nextInt(0, 6);
            int y = random.nextInt(0, 6);
            System.out.println(fig.opis()+"\nPunkt: ("+x+","+y+")"+(((IFigury) fig).wPolu(new Punkt(x, y)) ? " W polu" : " Nie w polu" ));
        }

        Okrag okrag = new Okrag(3,"czerwony", new Punkt(0,0));
        System.out.println(okrag.opis());
        System.out.println(okrag.wPolu(new Punkt(1,1)));
        okrag.przesun(1,1);
        System.out.println(okrag.opis());
    }
}
