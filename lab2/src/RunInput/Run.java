package RunInput;

import Tasks.Tasks;

public class Run {

    public void RunTask(){
        Input input = new Input();
        Tasks tasks = new Tasks();

        System.out.println("Laboratorium 2\n");
        System.out.println("Zadanie 1");
        System.out.println("Zadanie 2");
        System.out.println("Zadanie 3");
        System.out.println("Zadanie 4");
        System.out.println("Zadanie 5");
        System.out.println("Zadanie 6");
        System.out.print("Wybierz zadananie: ");

        int wybor = input.InputInt();
        switch (wybor){
            case 1:
                System.out.print("Podaj a: ");
                float a = input.InputFloat();
                System.out.print("Podaj b: ");
                float b = input.InputFloat();
                System.out.print("Podaj c: ");
                float c = input.InputFloat();
                System.out.print(tasks.QuadraticEquation(a,b,c));
                break;
            case 2:
                System.out.print("Podaj x: ");
                float x = input.InputFloat();
                System.out.println("a("+x+") = "+tasks.FunA(x));
                System.out.print("Podaj x: ");
                x = input.InputFloat();
                System.out.println("b("+x+") = "+tasks.FunB(x));
                System.out.print("Podaj x: ");
                x = input.InputFloat();
                System.out.println("c("+x+") = "+tasks.FunC(x));
                break;
            case 3:
                System.out.print("Podaj a: ");
                a = input.InputFloat();
                System.out.print("Podaj b: ");
                b = input.InputFloat();
                System.out.print("Podaj c: ");
                c = input.InputFloat();
                System.out.println("Uporzadkowane licby a, b, c \n"+tasks.Sort(a,b,c));
                break;
            case 4:
                System.out.print("Czy pada deszcz? (true/false) ");
                boolean answer1 = input.InputBoolean();
                System.out.print("Czy jest autobus? (true/false) ");
                boolean answer2 = input.InputBoolean();
                System.out.println(tasks.Decision1(answer1, answer2));
                break;
            case 5:
                System.out.print("Czy jest zniżka na samochód?  (true/false) ");
                answer1 = input.InputBoolean();
                System.out.print("Czy otrzymałeś podwyżkę? (true/false) ");
                answer2 = input.InputBoolean();
                System.out.println(tasks.Decision2(answer1, answer2));
                break;
            case 6:
                System.out.print("Podaj a: ");
                a = input.InputFloat();
                System.out.print("Podaj b: ");
                b = input.InputFloat();
                System.out.print("Podaj operacje +, -, /, * ");
                char operation = input.InputChar();
                System.out.println(a+" "+operation+" "+b+" = "+tasks.Calculator(a,b,operation));
                break;
            default: System.out.println("Nie ma takiego zadania");
        }
    }
}
