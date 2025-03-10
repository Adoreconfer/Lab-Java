package FiguryGeometryczne;

public class Square {
    float a;

    public void setA(float a) {
        this.a = a;
    }

    private float Area(){
        return a*a;
    }

    private float Perimeter(){
        return 4*a;
    }

    public void PrintDate(){
        System.out.println("---\nSquare:\nArea: "+Area()+ "\nPerimeter: "+ Perimeter()+"\n---");
    }
}
