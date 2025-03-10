package FiguryGeometryczne;

public class RectangularPrism {
    float a,b,h;

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setH(float h) {
        this.h = h;
    }

    private float AreaOfAShape(){
        return h*(a+b)+2*(a*b);
    }

    private float Volume(){
        return a*b*h;
    }

    public void PrintDate(){
        System.out.println("---\nRectangular Prism:\nArea of a shape: "+AreaOfAShape()+ "\nVolume: "+ Volume()+"\n---");
    }
}
