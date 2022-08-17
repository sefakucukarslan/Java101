package BasamakBulma;

import java.util.Scanner;

public class BasamakBulma {
    public static void main(String[] args) {
        int num, toplam = 0, adet = 0;

        Scanner scr = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        num = scr.nextInt();

        while (num != 0){
            toplam += (num % 10);
            num /= 10;
            adet++;
        }
        System.out.println("basamak sayısı : " + adet);
        System.out.println("basamak toplamı : " + toplam);
    }
}
