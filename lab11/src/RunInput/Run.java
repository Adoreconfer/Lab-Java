package RunInput;

import Task.Tasks;

public class Run {

    public void RunTask(){
        Input input = new Input();
        Tasks tasks = new Tasks();
        System.out.println("Laboratorium 11\n");
        System.out.println("Zadanie 1");
        System.out.println("Zadanie 2");
        System.out.println("Wybierz zadananie:");

        int wybor = input.InputInt();
        switch (wybor) {
            case 1:
                tasks.Zadanie1();
                break;
            case 2:
                tasks.Zadanie2();
                break;
            default:
                System.out.println("Nie ma takiego zadania");
        }
    }
}
