package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n,a,b,c;
        Scanner scr = new Scanner(System.in);

        System.out.println("Eleman sayısı: ");
        n = scr.nextInt();
        a = 0;
        b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 1; i < n; i++){
            c = b + a;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }
}
