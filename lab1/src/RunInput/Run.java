package RunInput;

import Task.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Run {

    public void RunTask(){
        //obiekt klas
        Tasks tasks = new Tasks();
        Input input = new Input();

        System.out.println("Laboratorium 1\n");
        System.out.println("Zadanie 1");
        System.out.println("Zadanie 2");
        System.out.println("Zadanie 3");
        System.out.println("Zadanie 4");
        System.out.println("Zadanie 5");
        System.out.println("Zadanie 6");
        System.out.println("Zadanie 7");
        System.out.println("Wybierz zadananie:");

        int wybor = input.InputInt();
        switch (wybor){
            case 1:
                System.out.println(tasks.DataUser()); break;
            case 2:
                System.out.print("Podaj a: ");
                float a = input.InputFloat();
                System.out.print("Podaj b: ");
                float b = input.InputFloat();
                System.out.print(tasks.Calculator(a,b));
                break;
            case 3:
                System.out.print("Podaj n: ");
                float n = input.InputFloat();
                System.out.println(tasks.IsEven(n));
                break;
            case 4:
                System.out.print("Podaj a: ");
                a = input.InputFloat();
                System.out.println(tasks.IsDivisible(a));
                break;
            case 5:
                System.out.print("Podaj a: ");
                a = input.InputFloat();
                System.out.println(tasks.Pow(a));
                break;
            case 6:
                System.out.print("Podaj a: ");
                a = input.InputFloat();
                System.out.println(tasks.Sqrt(a));
                break;
            case 7:
                System.out.print("Podaj a: ");
                float min = input.InputFloat();
                System.out.print("Podaj b: ");
                float max = input.InputFloat();
                a = tasks.Randomizer(min, max);
                b = tasks.Randomizer(min, max);
                float c = tasks.Randomizer(min, max);
                System.out.println(tasks.IsRightTriangle(a,b,c));
                break;
            default: System.out.println("Nie ma takiego zadania");

        }
    }

}
