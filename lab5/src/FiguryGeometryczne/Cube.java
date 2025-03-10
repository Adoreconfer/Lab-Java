package FiguryGeometryczne;

public class Cube {
    float a;

    public void setA(float a) {
        this.a = a;
    }

    private float AreaOfAShape(){
        return 6*a*a;
    }

    private float Volume(){
        return (float) Math.pow(a,3);
    }

    public void PrintDate(){
        System.out.println("---\nCube:\nArea of a shape: "+AreaOfAShape()+ "\nVolume: "+ Volume()+"\n---");
    }
}
