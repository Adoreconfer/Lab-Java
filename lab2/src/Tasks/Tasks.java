package Tasks;

public class Tasks {
    public String QuadraticEquation(float a, float b, float c){
        float delta =  (b*b - 4*a*c);
        if(delta>0){
            float x1 = (-b - (float) Math.sqrt(delta))/2*a;
            float x2 = (-b + (float) Math.sqrt(delta))/2*a;
            return "x1 = "+x1+ " x2 = "+x2;
        }if (delta==0) {
            return "x = "+(-b/2*a);
        }
        return "Brak rozwiazania w liczbach rzeczywistych";
    }

    public Float FunA(float x){
        if(x>0){ return (float)2*x; }
        if(x==0) { return (float)0; }
        else return (float) (-3*x);
    }

    public Float FunB(float x){
        if(x>=1){ return (float)(x*x); }
        else return (float) (x);
    }

    public Float FunC(float x){
        if(x>2){ return (float)(2+x); }
        if(x==2){ return (float)(8); }
        else return (float) (x-4);
    }

    public String Sort(float a, float b, float c){
        if(a>=b && a>=c){
            if(b>=c){
                return c+" "+b+" "+a;
            }
            else return b+" "+c+" "+a;}
        if(b>=a && b>=c){
            if(a>=c){
                return c+" "+a+" "+b;
            }
            else return a+" "+c+" "+b;
        }
        else{
            if(a>=b){
                return b+" "+a+" "+c;
            }
            else return a+" "+b+" "+c;
        }
    }

    public String Decision1(boolean x, boolean y){
            if(x && y){
                return "Weź parasol\nDostaniesz się na uczelnie";
            }
            if(x && !y){
                return "Nie dostaniesz się na uczelnię";
            }
            if(!x && y){
                return "Dostaniesz się na uczelnie\nMiłego dnia i pięknej pogody";
            }

        return null;
    }

    public String Decision2(boolean x, boolean y){
        if(!x || y) {
            if (!x) {
                if (y) return "Możesz kupić samochód !\nZniżki na samochód nie ma";
                if (!y) return "Zakup samochód trzeba odłożyć na później...\nZniżki na samochód nie ma";

            }
            if (y) {
                if(x) return "Możesz kupić samochód !";
            }
        }
        return "";
    }

    public Float Calculator(float a, float b, char x){
        switch (x){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '/':
                return a/b;
            case '*':
                return a*b;
            default: return null;
        }
    }
}
