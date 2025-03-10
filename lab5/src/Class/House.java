package Class;

import java.time.LocalDate;

public class House {
    String name;
    int year;
    int floors;

    public House(String name, int year, int floors) {
        this.name = name;
        this.year = year;
        this.floors = floors;
    }

    private int Lata(){
        LocalDate ld = LocalDate.now();
        if(ld.getYear()<=year){
            return 0;
        }
        else{
            return ld.getYear()-year;
        }
    }

    public void PrintData(){
        System.out.println("Budynek ma nazwę: "+name
                +"\nRok budowy: "+ year+
                "\nLiczba pięter: "+ floors+
                "\nJuż ma "+Lata()+" lat");
    }
}
