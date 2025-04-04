package Class;

public class Point {
    public double x;
    public double y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    private void zeruj(){
        x = 0;
        y = 0;
    }

    public void opis(){
        System.out.println("Punkty o wspolżędnych x = "+x+", y = "+y);
    }

    public void przesun(int x_, int y_){
        x+=x_;
        y+=y_;
    }
}
