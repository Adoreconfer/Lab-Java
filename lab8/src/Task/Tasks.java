package Task;
import RunInput.Input;

import java.util.InputMismatchException;

public class Tasks{
    Input input = new Input();
    public void Zadanie1(){
        System.out.print("Podaj liczbę: ");
        try {
            float n = input.InputFloat();
            if (n < 0) {
                throw new IllegalArgumentException("Liczba musi być dodatnią");
            }
            System.out.println(Math.sqrt(n));
        }
        catch (InputMismatchException e){
            throw new RuntimeException("Liczba nie może być znakiem");
        }

    }

    public int Silnia(int n){
        if(n==0 || n==1) return 1;
        else{
            return n*Silnia(n-1);
        }
    }


    public void Zadanie2() throws BlednaWartoscDlaSilniException{
        System.out.print("Podaj liczbę: ");
        int n = input.InputInt();
        if(n<0) {
            throw new BlednaWartoscDlaSilniException("Liczba musi być dodatnia");
        }else System.out.println(Silnia(n));
    }
    public void Zadanie3() throws NieprawidlowyAdresException{
        Adres adres = new Adres(null, null, 12,"we");
    }
}

