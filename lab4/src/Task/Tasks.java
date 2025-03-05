package Task;
import RunInput.Input;

import java.util.Arrays;
import java.util.Random;

public class Tasks {
    Input input = new Input();

    public int[] Random(int n, int a, int b){
        Random random = new Random();
        int[] arr = new int[n];
        if(a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(a,b+1);
        }
        return arr;
    }

    public void Zadanie1(){
        System.out.print("Podaj ilosc liczb: ");
        int n = input.InputInt();
        System.out.print("Podaj przedzial: \nod : ");
        int a = input.InputInt();
        System.out.print("do : ");
        int b = input.InputInt();
        int[] arr = Random(n, a, b);
        System.out.println(Arrays.toString(arr));
        int suma = 0;
        for(int item: arr){
            suma+=item;
        }
        System.out.printf("Suma: "+suma+" srednia: "+ (float) suma /n);
    }

    public void Zadanie2(){
        int[] tab1 = {1,2,3,4,5,6};
        int[] tab2 = {7,8,9,10,11};
        System.out.println("Tablica 1: "+Arrays.toString(tab1)+" \nTablica 2: "+Arrays.toString(tab2));
        System.out.print("Co drugi element \nTablica 1: ");
        for (int i = 1; i < tab1.length; i += 2) {
            System.out.print(tab1[i]+" ");
        }
        System.out.print("\nTablica 2: ");
        for (int i = 1; i < tab2.length; i += 2) {
            System.out.print(tab2[i]+" ");
        }
    }

    public void Zadanie3(){
        String[] text = {"Hello, wold"};
        System.out.println(Arrays.toString(text));
        for(String item: text){
            System.out.println(item.toUpperCase());
        }
    }

    public void Zadanie4(){
        System.out.println("Podaj 5 slow");
        String r = "";
        char ch;
        String[] text = new String[5];
        for (int i = 0; i < 5; i++) {
            text[i] = input.InputString();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < text[i].length(); j++) {
                ch = text[i].charAt(j);
                r = ch+r;
            }r = " "+r;
        }
        System.out.println(r);
    }

    public int[] SetArr(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbe "+(i+1)+": ");
            arr[i] = input.InputInt();
        }
        return arr;
    }

    public void Zadanie5(){
        int[] arr = new int[8];
        arr = SetArr(arr, 8);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public int Silnia(int n){
        if(n==0){ return 1;}
        if(n<0){ return n;}
        n *= Silnia(n-1);
        return n;
    }

    public void Zadanie6(){
        int[] arr = new int[5];
        arr = SetArr(arr, 5);
        for (int item: arr){
            System.out.println(item+"! = "+Silnia(item));
        }
    }

    public String Porownanie(String[] tab1, String[] tab2){
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab1[i].length(); j++) {
                if(tab1[i].charAt(j)!=tab2[i].charAt(j)){
                    return "Tablice nie sa jednakowe";
                }
            }
        }return "Tablice sa jednakowe";
    }

    public void Zadanie7(){
        String[] tab1 = {"Hello","world"};
        String[] tab2 = {"Hello","world"};
        System.out.println(Porownanie(tab1,tab2));
    }
}
