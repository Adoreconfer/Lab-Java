package FiguryGeometryczne;

public class Rectangle {
    float a,b;

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    private float Area(){
        return a*b;
    }

    private float Perimeter(){
        return 2*(a+b);
    }

    public void PrintDate(){
        System.out.println("---\nRectangle:\nArea: "+Area()+ "\nPerimeter: "+ Perimeter()+"\n---");
    }
}
