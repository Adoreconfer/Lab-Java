import threads.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Podaj n : ");
        int n = scanner.nextInt();
        Thread suma = new SumThread(n);
        Thread factorial = new FactorialThread(n);
        suma.start();
        factorial.start();

        try {
            suma.join();
            factorial.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}