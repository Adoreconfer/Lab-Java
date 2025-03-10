package FiguryGeometryczne;

public class Sphere {
    float r;

    public void setR(float r) {
        this.r = r;
    }

    private float AreaOfAShape(){
        return (float) (4*Math.PI*Math.pow(r,2));
    }

    private float Volume(){
        return (float) (((double) 4 /3)*Math.PI*Math.pow(r,3));
    }

    public void PrintDate(){
        System.out.println("---\nSphere:\nArea of a shape: "+AreaOfAShape()+ "\nVolume: "+ Volume()+"\n---");
    }
}
