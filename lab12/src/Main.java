import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int kobiety;
    static int mezczyzni;
    static int[] rok50_80={0,0};
    static int[] rok81_00={0,0};
    static int[] rok01_25={0,0};
    public static void main(String[] args) throws IOException {
        String wynik = "dane/wynik.txt";
        String wynik1 = "dane/wynik1.txt";

        File plik = new File(wynik);

        try{
            if(plik.createNewFile()){
                System.out.println("Utworzono plik: "+plik.getName());
            }
            else System.out.println("Plik już istnieje");
            FileWriter writer = new FileWriter(wynik);

            File pesele = new File("dane/pesele.txt");
            Scanner scanner = new Scanner(pesele);
            List<String> lines = new ArrayList<>();
            while (scanner.hasNextLine()){
                String linia = scanner.nextLine();
                Pesel pesel = new Pesel(linia);
                countKM(pesel);
                countRokUrodzenia(pesel);
                writer.write(pesel.DataUrodzenia()+"\n");
                lines.add(pesel.DataUrodzenia()+"");
            }

            scanner.close();
            writer.close();
            Files.write(Paths.get(wynik1), lines);
            System.out.println("Kobiet: "+kobiety+"\nMężczyzn: "+mezczyzni);
            System.out.println("Urodziło się miedzy:\n" +
                    "1950 - 1980: "+rok50_80[0]+", średni wiek: "+rok50_80[1]/rok50_80[0]+
                    "\n1981 - 2000: "+rok81_00[0]+", średni wiek: "+rok81_00[1]/rok81_00[0]+
                    "\n2001 - 2025: "+rok01_25[0]+", średni wiek: "+rok01_25[1]/rok01_25[0]);
        } catch (IOException e) {
            System.out.println("Wystąpił bład.");
            e.printStackTrace();
        }
    }

    public static void countKM(Pesel pesel){
        if(pesel.getPlec().equals("k")){
            kobiety++;
        }
        else mezczyzni++;
    }

    public static void countRokUrodzenia(Pesel pesel){
        int rok = (LocalDate.now().minusYears(pesel.getRok())).getYear();
        if(pesel.getRok()>=1950 && pesel.getRok()<=1980){
            rok50_80[0]++;
            rok50_80[1] += rok;
        }
        if(pesel.getRok()>=1981 && pesel.getRok()<=2000){
            rok81_00[0]++;
            rok81_00[1] += rok;
        }
        if(pesel.getRok()>=2001 && pesel.getRok()<=2025){
            rok01_25[0]++;
            rok01_25[1] += rok;
        }
    }
}