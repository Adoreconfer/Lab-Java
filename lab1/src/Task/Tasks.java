package Task;

public class Tasks {

    public String DataUser(){
        return "Diana, 18";
    }
    public String Calculator(float a, float b){ return "a+b="+(a+b)+" a-b="+(a-b)+" a*b="+(a*b);}
    public Boolean IsEven(float n){
        return n % 2 == 0;
    }
    public Boolean IsDivisible(float a){
        return (a % 3 == 0)&&(a % 5 == 0);
    }
    public Float Pow(float a){
        return (float) Math.pow(3,a);
    }
    public Float Sqrt(float a){
        return (float) Math.sqrt(a);
    }
    public Float Randomizer(float a, float b){
        return a + (int)(Math.random() * ((b - a) +1));
    }
    public Boolean IsRightTriangle(float a, float b, float c){
        return Math.pow(2,a)+Math.pow(2,b) == Math.pow(2,c);
    }
}
