package FiguryGeometryczne;

public class Cone {
    float r,h;

    public void setH(float h) {
        this.h = h;
    }

    public void setR(float r) {
        this.r = r;
    }

    private float AreaOfAShape(){
        return (float) (Math.PI*r*( Math.sqrt(Math.pow(r,2)+Math.pow(h,2)) + r));
    }

    private float Volume(){
        return (float) ((double) 1 /3*Math.PI*Math.pow(r,2)*h);
    }

    public void PrintDate(){
        System.out.println("---\nCone:\nArea of a shape: "+AreaOfAShape()+ "\nVolume: "+ Volume()+"\n---");
    }
}
