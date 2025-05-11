package threads;

public class SumThread extends Thread{
    int suma;
    int n;

    public SumThread(int n){
        this.n = n;
    }
    public void run(){
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.printf("Suma od 1 do "+ n+" : "+suma+"\n");
    }
}
