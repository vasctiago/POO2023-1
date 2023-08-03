package firstunitad;

import java.util.Scanner;

public class FibVersionTwo{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int limite = Integer.parseInt(leitor.nextLine());
        System.out.println("Sequências de Fibonacci...");
        System.out.println("utilizando for:"); fib1(limite);
        System.out.println("utilizando While:"); fib2(limite);
        System.out.println("utilizando Recursão:");
        if(limite<=0){
            System.out.println("[]");
        }
        else if(limite==1){
            System.out.println("[0]");
        }
        else{
            System.out.print("[");
            for(int c=0;c<limite;c++){
                if(c<limite-1){
                    System.out.print(fib3(c)+" ");
                }
                else{
                    System.out.println(fib3(c)+"]");
                }
            }
        }

        leitor.close();
    }

    //usando for
    public static void fib1(int num){
        int num1 = 0;
        int num2 = 1;
        if(num<=0){
            System.out.println("[]");
        }
        else if(num==1){
            System.out.println("[0]");
        }
        else{
            System.out.print("[");
            for(int i=0;i<num;i++){
                int cal= num1+num2;
                if(i<num-1){
                    System.out.print(num1+" ");
                }
                else{
                    System.out.println(num1+"]");
                }
                num1=num2;
                num2=cal;
            }
        }
    }

    //usando while
    public static void fib2(int num){
        int num1 = 0;
        int num2 = 1;
        int i=0;
        if(num<=0){
            System.out.println("[]");
        }
        else if(num==1){
            System.out.println("[0]");
        }
        else{
        while(i<num){
            int cal= num1+num2;
                if(i<num-1){
                    System.out.print(num1+" ");
                }
                else{
                    System.out.println(num1+"]");
                }
                num1=num2;
                num2=cal;
                i++;
            }
        }
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