package UsluSayi;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int n,k,total = 1;
        Scanner scr = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n = scr.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = scr.nextInt();

        for (int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println("Cevap : " + total);
    }
}
