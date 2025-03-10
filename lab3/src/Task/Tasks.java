package Task;

import RunInput.Input;

import javax.swing.*;
import java.util.Random;

public class Tasks {
    Input input = new Input();
    public void Zadanie1(){
        int n;
        System.out.println("Podaj liczbe studentow");
        n = input.InputInt();
        while(n<0){
            System.out.println("Liczba studentoq ma byc liczba dodatnia");
            n = input.InputInt();
        }

        int i = 0;
        double suma=0;
        int punkty = 0;


        while (i<n){
            System.out.println("Podaj liczbe punktow "+ (i+1)+ ": ");
            punkty = input.InputInt();
            if (punkty >=0 && punkty <=10){
                suma+=punkty;
                i++;
            }else {
                System.out.println("niepoprawna liczba punktow musi byc w [0-10]");
                continue;
            }
        }
        double sr = suma/n;
        System.out.println("Srednia "+ sr);
    }

    public void Zadanie2(){
        int licz_d =0;
        int licz_u =0;

        double sum_d = 0;
        double sum_u = 0;

        int i = 0;
        while (i<=9){
            System.out.println("Podaj "+(i+1)+" liczbe");
            float n = input.InputFloat();
            if(n > 0){
                licz_d++;
                sum_d+=n;
            }
            if(n<0){
                licz_u++;
                sum_u+=n;
            }
            if(n==0) {System.out.println("Podaj inna liczbe"); continue;}
            i++;
        }
        System.out.println("Suma liczb dodatnich "+sum_d+" ilosc "+licz_d);
        System.out.println("Suma liczb ujemnych "+sum_u+" ilosc "+licz_u);

    }

    public int Parzysta(int a, int suma){
        if(a%2==0){
            suma+=a;
        }
        return suma;
    }

    public void Zadanie3(){
        System.out.print("Podaj ilosc liczb: ");
        int n = input.InputInt();
        int i=0;
        int suma = 0;
        while (n>0){
            i++;
            System.out.print("Podaj liczbe "+i+": ");
            int a = input.InputInt();
            suma = Parzysta(a,suma);
            n--;
        }
        System.out.println("Suma liczb parzystych: "+suma);
    }

    public void Zadanie4(){
        System.out.println("Podaj ilosc liczb: ");
        int n = input.InputInt();
        int suma = 0;
        Random random = new Random();
        while (n>0){
            int a = random.nextInt(56)-10;
            System.out.print(a+" ");
            suma = Parzysta(a,suma);
            n--;
        }
        System.out.println("\nSuma liczb parzystych: "+suma);
    }

    public String Zadanie5(){
        System.out.println("Podaj slowo: ");
        String text = input.InputString();
        int leng = text.length();
        for (int i = 0; i < leng; i++) {
            if(text.charAt(i)!=text.charAt((leng-1)-i)){
                return "Nie palindrom";
            }
        }
        return "Palindrom";

    }
}
