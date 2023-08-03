package firstunitad;

import java.util.Scanner;

public class FibVersionOne{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int limite = Integer.parseInt(leitor.nextLine());
        System.out.println("Sequências de Fibonacci...");
        System.out.println("utilizando for:"); fib1(limite);
        System.out.println("utilizando While:"); fib2(limite);
        System.out.println("utilizando Recursão:");
        for(int c=0;c<limite;c++){
            System.out.print(fib3(c)+" ");
        }

        leitor.close();
    }

    //usando for
    public static void fib1(int num){
        int num1 = 0;
        int num2 = 1;
        for(int i=0;i<num;i++){
            int cal= num1+num2;
            System.out.print(num1+" ");
            num1=num2;
            num2=cal;
        }
        System.out.println();
    }

    //usando while
    public static void fib2(int num){
        int num1 = 0;
        int num2 = 1;
        int i=0;
        while(i<num){
            int cal= num1+num2;
            System.out.print(num1+" ");
            num1=num2;
            num2=cal;
            i++;
        }
        System.out.println();
    }

    //usando metodo recursivo
    public static int fib3(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib3(n - 1) + fib3(n - 2);
        }
    }
    
    
}