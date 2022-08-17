package CiftSayilariBulma;

import java.util.Scanner;

public class CiftSayilar {
    public static void main(String[] args) {
        int k, toplam = 0, ort, sayac = 0;

        Scanner scr = new Scanner(System.in);

        System.out.println("Sayı giriniz : ");

        k = scr.nextInt();

        for(int i = 1; i <= k; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                toplam += i;
                sayac++;
            }
        }
        ort = toplam / sayac;
        System.out.println("Ortalama : " + ort);
    }
}
