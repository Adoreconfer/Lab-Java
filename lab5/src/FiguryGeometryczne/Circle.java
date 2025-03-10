package FiguryGeometryczne;

public class Circle {
    float r;

    public void setR(float r) {
        this.r = r;
    }

    private float Area(){
        return (float) (Math.PI*Math.pow(2,r));
    }

    private float Circumference(){
        return (float) (2*Math.PI*r);
    }

    public void PrintDate(){
        System.out.println("---\nCircle:\nArea: "+Area()+ "\nCircumference: "+ Circumference()+"\n---");
    }
}
