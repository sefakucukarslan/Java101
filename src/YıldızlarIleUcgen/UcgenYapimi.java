package YıldızlarIleUcgen;

import java.util.Scanner;

public class UcgenYapimi {
    public static void main(String[] args) {
        int n;
        Scanner scr = new Scanner(System.in);
        System.out.print("Satır sayısı: ");
        n = scr.nextInt();
        for (int i = 0; i <= n; i++){
            for (int j = 0; j < (n - i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * n - (2 * i - 1)); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
