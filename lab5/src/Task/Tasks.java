package Task;
import RunInput.Input;
import FiguryGeometryczne.*;
import Class.*;


public class Tasks {
    Input input = new Input();

    public void SetValue(String name){
        System.out.print("Podaj "+ name+ ": ");
    }

    public void Zadanie1(){
        System.out.print(
                "Koło - 1\n" +
                "Kwadrat - 2\n" +
                "Prostokąt - 3\n" +
                "Sześcian - 4\n" +
                "Prostopadłościan - 5\n" +
                "Kula - 6\n" +
                "Stożek - 7\n" +
                "Wybierz figurę: ");
        int wybor = input.InputInt();
        switch (wybor){
            case 1:
                Circle circle = new Circle();
                SetValue("R");
                circle.setR(input.InputFloat());
                circle.PrintDate();
                break;
            case 2:
                Square square = new Square();
                SetValue("a");
                square.setA(input.InputFloat());
                square.PrintDate();
                break;
            case 3:
                Rectangle rectangle = new Rectangle();
                SetValue("a");
                rectangle.setA(input.InputFloat());
                SetValue("b");
                rectangle.setB(input.InputFloat());
                rectangle.PrintDate();
                break;
            case 4:
                Cube cube = new Cube();
                SetValue("a");
                cube.setA(input.InputFloat());
                cube.PrintDate();
                break;
            case 5:
                RectangularPrism rectangPrism =  new RectangularPrism();
                SetValue("a");
                rectangPrism.setA(input.InputFloat());
                SetValue("b");
                rectangPrism.setA(input.InputFloat());
                SetValue("h");
                rectangPrism.setA(input.InputFloat());
                rectangPrism.PrintDate();
                break;
            case 6:
                Sphere sphere = new Sphere();
                SetValue("R");
                sphere.setR(input.InputFloat());
                sphere.PrintDate();
                break;
            case 7:
                Cone cone = new Cone();
                SetValue("R");
                cone.setR(input.InputFloat());
                SetValue("H");
                cone.setH(input.InputFloat());
                cone.PrintDate();
                break;
            default:
                System.out.println("Nie ma takiego nr");
        }

    }

    public void Zadanie2(){
        House house = new House("Dom",2020, 4);
        house.PrintData();
    }

    public void Zadanie3(){
        Gatunek g1 = new Gatunek("Homo","sapiens", 46, 23, "Człowiek współczesny");
        g1.Wypisz();

        Gatunek g2 = new Gatunek("Panthera", "leo", 38, 19, "Lew afrykański");
        g2.Wypisz();

        Gatunek g3 = new Gatunek("Felis", "catus", 38, 19, "Kot domowy");
        g3.Wypisz();

        Gatunek g4 = g1.Clon();
        g4.Wypisz();
    }

}
