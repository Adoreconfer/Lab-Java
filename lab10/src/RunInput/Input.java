package RunInput;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    public int InputInt(){
        return scanner.nextInt();
    }
    public float InputFloat(){
        return scanner.nextFloat();
    }
    public double InputDouble(){ return scanner.nextDouble(); }
    public String InputString(){ return scanner.next();}
}
