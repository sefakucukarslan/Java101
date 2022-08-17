package Harmonik;

import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        int n;
        double result = 0;

        Scanner scr = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        n = scr.nextInt();

        for (double i = 1; i <= n; i++){
            result += (1/i);
        }
        System.out.println(result);
    }
}
