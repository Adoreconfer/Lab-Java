package threads;

public class FactorialThread extends Thread{
    int factorial = 1;
    int n;

    public FactorialThread(int n){
        this.n = n;
    }
    public void run(){
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.printf("Silnia "+ n+"! : "+factorial+"\n");
    }
}
