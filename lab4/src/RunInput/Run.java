package RunInput;

import Task.Tasks;

public class Run {

    public void RunTask(){
        Input input = new Input();
        Tasks tasks = new Tasks();
        System.out.println("Laboratorium 4\n");
        System.out.println("Zadanie 1");
        System.out.println("Zadanie 2");
        System.out.println("Zadanie 3");
        System.out.println("Zadanie 4");
        System.out.println("Zadanie 5");
        System.out.println("Zadanie 6");
        System.out.println("Zadanie 7");
        System.out.print("Wybierz zadananie: ");

        int wybor = input.InputInt();
        switch (wybor) {
            case 1:
                tasks.Zadanie1();
                break;
            case 2:
                tasks.Zadanie2();
                break;
            case 3:
                tasks.Zadanie3();
                break;
            case 4:
                tasks.Zadanie4();
                break;
            case 5:
                tasks.Zadanie5();
                break;
            case 6:
                tasks.Zadanie6();
                break;
            case 7:
                tasks.Zadanie7();
                break;
            default:
                System.out.println("Nie ma takiego zadania");
        }
    }
}
